package com.zhuhong.user.service;

import com.zhuhong.common.Result;
import com.zhuhong.user.model.User;

/**
 * <p>Description: [用户]</p>
 * Created on 2020-01-09
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
public interface UserService {
    Result login(User user);
}
