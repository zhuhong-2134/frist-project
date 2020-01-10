package com.zhuhong.user.service.impl;

import com.zhuhong.common.Result;
import com.zhuhong.constants.SysConstant;
import com.zhuhong.enums.UserCodeEnum;
import com.zhuhong.user.dao.UserDao;
import com.zhuhong.user.exception.BusinessException;
import com.zhuhong.user.exception.ErrorCodeEnum;
import com.zhuhong.user.model.User;
import com.zhuhong.user.service.UserService;
import com.zhuhong.utils.CodeGenerateUtil;
import com.zhuhong.utils.MD5Util;
import com.zhuhong.utils.PhoneUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Description: []</p>
 * Created on 2020-01-09
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private CodeGenerateUtil codeGenerateUtil;

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
        int result = userDao.selectUserByUsernameAndPassword(user);
        if (result != SysConstant.ONE) {
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

        int result = userDao.save(user);

        return null;
    }

    //校验参数
    private void check(User user) {
        if (!PhoneUtil.checkPhone(user.getPhone())) {
            throw new BusinessException(ErrorCodeEnum.PHONE_INCORRECT_FORMAT.getDescription(), ErrorCodeEnum.PHONE_INCORRECT_FORMAT.getCode());
        }
        if (StringUtils.isBlank(user.getUserName())) {
            throw new BusinessException(ErrorCodeEnum.USERNAME_IS_NOT_NULL.getDescription(), ErrorCodeEnum.USERNAME_IS_NOT_NULL.getCode());
        }
        if (StringUtils.isBlank(user.getPassword())) {
            throw new BusinessException(ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getDescription(), ErrorCodeEnum.PASSWORD_IS_NOT_NULL.getCode());
        }
    }

    private void fillAttribute(User user) {
        user.setUserCode(codeGenerateUtil.generateCodeYmdSix(UserCodeEnum.USERCODE.getDescription()));
    }
}
