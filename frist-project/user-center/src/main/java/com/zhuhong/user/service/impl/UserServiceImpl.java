package com.zhuhong.user.service.impl;

import com.zhuhong.common.PageResult;
import com.zhuhong.common.Result;
import com.zhuhong.constants.SysConstant;
import com.zhuhong.user.dao.UserDao;
import com.zhuhong.user.exception.BusinessException;
import com.zhuhong.user.exception.ErrorCodeEnum;
import com.zhuhong.user.model.User;
import com.zhuhong.user.service.UserService;
import com.zhuhong.utils.DateUtils;
import com.zhuhong.utils.MD5Util;
import com.zhuhong.utils.PhoneUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description: []</p>
 * Created on 2020-01-09
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
//
//    @Autowired
//    private CodeGenerateUtil codeGenerateUtil;

    // 用户登陆
    @Override
    public Result login(User user) {
        //账号密码判空
        if (StringUtils.isBlank(user.getPassword())) {
            throw new BusinessException(ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getDescription(), ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getCode());
        }
        if (StringUtils.isBlank(user.getUserName())) {
            throw new BusinessException(ErrorCodeEnum.USERNAME_IS_NOT_NULL.getDescription(), ErrorCodeEnum.USERNAME_IS_NOT_NULL.getCode());
        }
        //密码加密
        String passw = MD5Util.MD(user.getPassword());
        user.setPassword(passw);
        User result = userDao.selectUserByUsernameAndPassword(user);
        if (result == null) {
            throw new BusinessException(ErrorCodeEnum.PASSWORD_USERNAME_IS_INCORRECT.getDescription(), ErrorCodeEnum.PASSWORD_USERNAME_IS_INCORRECT.getCode());
        }
        return Result.success(result);
    }

    // 用户注册账号
    @Override
    public Result register(User user) {
        //属性校验
       check(user);

        //密码加密
        String passw = MD5Util.MD(user.getPassword());

        user.setPassword(passw);

        fillAttribute(user);

        int result = userDao.save(user);

        return null;
    }

    //分页查询用户列表
    @Override
    public PageResult<List<User>> selectUserList(User user) {
        user.setState(SysConstant.ONE);
        user.setDelSta(SysConstant.ZERO);
        Integer count = userDao.selectCount(user);
        List<User> users = userDao.selectUserList(user);
        PageResult result = new PageResult();
        result.setTotal(count);
        result.setData(users);
        return result;
    }

    //校验参数
    private void check(User user) {
        if (StringUtils.isBlank(user.getPhone())) {
            throw new BusinessException(ErrorCodeEnum.PHONE_IS_NOT_NULL.getDescription(), ErrorCodeEnum.PHONE_IS_NOT_NULL.getCode());
        }
        if (!PhoneUtil.checkPhone(user.getPhone())) {
            throw new BusinessException(ErrorCodeEnum.PHONE_INCORRECT_FORMAT.getDescription(), ErrorCodeEnum.PHONE_INCORRECT_FORMAT.getCode());
        }
        if (!user.getPassword().equalsIgnoreCase(user.getRepassword())) {
            throw new BusinessException(ErrorCodeEnum.PASSWORD_IS_NOT_SAME.getDescription(), ErrorCodeEnum.PASSWORD_IS_NOT_SAME.getCode());
        }
        if (StringUtils.isBlank(user.getUserName())) {
            throw new BusinessException(ErrorCodeEnum.USERNAME_IS_NOT_NULL.getDescription(), ErrorCodeEnum.USERNAME_IS_NOT_NULL.getCode());
        }
        if (StringUtils.isBlank(user.getPassword())) {
            throw new BusinessException(ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getDescription(), ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getCode());
        }
    }

    //属性填充
    private void fillAttribute(User user) {
//        user.setUserCode(codeGenerateUtil.generateCodeYmdSix(UserCodeEnum.USERCODE.getDescription()));
        user.setCreateTime(DateUtils.getCurrentZero());
        user.setDelSta(SysConstant.ZERO);
        user.setState(SysConstant.ONE);
    }
}
