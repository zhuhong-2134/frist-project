package com.zhuhong.user.config;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

/**
 * <p>Description: [初始化]</p>
 * Created on 2019年08月08日
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory connectionFactory) {
        final RedisTemplate template = new RedisTemplate();

        //解决redis序列化时方法和属性不匹配的问题，以及反序列化时变成LinkedHashMap问题
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
        SimpleModule simpleModule = new SimpleModule();
        //simpleModule.addSerializer(DateTime.class,new JodaDateTimeJsonDisSerializer());
        //simpleModule.addDeserializer(DateTime.class,new JodaDateTimeJsonDisSerializer());
        mapper.registerModule(simpleModule);

        GenericJackson2JsonRedisSerializer serializer =new GenericJackson2JsonRedisSerializer(mapper);

        /********* Jackson方式 ***********/
        //Jackson2JsonRedisSerializer serializer =new Jackson2JsonRedisSerializer(Object.class);
        //serializer.setObjectMapper(mapper);

        /** JDK序列化方式 **/
        //JdkSerializationRedisSerializer serializer = new JdkSerializationRedisSerializer();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new GenericToStringSerializer<>(Object.class));
        template.setValueSerializer(serializer);
        template.setHashKeySerializer(new GenericToStringSerializer<>(Object.class));
        template.setHashValueSerializer(serializer);
        return template;
    }
}
