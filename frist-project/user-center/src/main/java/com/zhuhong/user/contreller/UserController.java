package com.zhuhong.user.contreller;

import com.zhuhong.common.PageResult;
import com.zhuhong.common.Result;
import com.zhuhong.constants.QueryIdBaseReq;
import com.zhuhong.user.model.User;
import com.zhuhong.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Description: []</p>
 * Created on 2020-01-09
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com"></a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
@Slf4j
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user 请求参数
     * @return 返回成功或失败
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        Result login = userService.login(user);
        return login;
    }

    /**
     * 注册
     * @param user 请求参数
     * @return 返回成功或失败
     */
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        Result result =userService.register(user);
        return result;
    }

    /**
     * 重置密码
     * @param user 请求参数
     * @return 返回成功或失败
     * 重置密码 默认：123456
     */
    @PostMapping("/resetPassword")
    public Result resetPassword(@RequestBody User user) {
        return null;
    }

    /**
     * 修改密码
     * @param user 请求参数
     * @return 返回成功或失败
     */
    @PostMapping("/changePassword")
    public Result changePassword(@RequestBody  User user) {
        return null;
    }

    /**
     * 根据id查询详情
     * @param idBaseReq 主键id
     * @return 返回User详情
     */
    @PostMapping("/selectById")
    public Result<User> selectById(@RequestBody QueryIdBaseReq idBaseReq) {
        return null;
    }

    /**
     * 根据id修改状态/删除
     * @param idBaseReq 主键id
     * @return 返回成功或失败
     */
    @PostMapping("/updateById")
    public Result updateById(@RequestBody QueryIdBaseReq idBaseReq) {
        return null;
    }

    /**
     * 分页查询User列表
     * @param user
     * @return
     */
    @PostMapping("/selectUserList")
    public PageResult<List<User>> selectUserList(@RequestBody User user) {
        PageResult<List<User>> result = userService.selectUserList(user);
        return result;
    }
}
