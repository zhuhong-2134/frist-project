package com.zhuhong.user.dao;

import com.zhuhong.user.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Description: [Dao层接口]</p>
 * Created on 2020-01-09
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
public interface UserDao {

    int selectUserByUsernameAndPassword(User user);

    int save(User user);
}
