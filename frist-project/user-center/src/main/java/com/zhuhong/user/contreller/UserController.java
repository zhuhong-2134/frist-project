package com.zhuhong.user.contreller;

import com.zhuhong.common.Result;
import com.zhuhong.user.model.User;
import com.zhuhong.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public Result login(@RequestBody User user) {
        Result login = userService.login(user);
        return login;
    }

    @RequestMapping("/register")
    public Result register() {
        return null;
    }
}
