package com.zhuhong.user;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * <p>Description: [启动类]</p>
 * Created on 2019/12/2
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = { "com.zhuhong.user" })
@SpringBootApplication
@MapperScan("com.zhuhong.user.dao")
@EntityScan("com.zhuhong.user.model")
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}
}
