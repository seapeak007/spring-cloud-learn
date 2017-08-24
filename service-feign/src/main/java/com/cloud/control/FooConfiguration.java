package com.cloud.control;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by UI03 on 2017/8/16.
 * 重写配置，需要加@Configuration注解，并重写下面的两个bean
 */
//@Configuration
//public class FooConfiguration {
//
//    @Bean
//    public Contract feignContract(){
//        return new feign.Contract.Default() ;
//    }
//
//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
//        return new BasicAuthRequestInterceptor("user","password") ;
//    }
//}
