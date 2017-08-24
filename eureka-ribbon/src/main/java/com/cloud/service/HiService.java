package com.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by UI03 on 2017/8/15.
 */
@Service
public class HiService {
    @Autowired
    RestTemplate restTemplate ;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://Service-hi/hi?name="+name,String.class) ;
    }

    private String hiError(String name){
        return "hi,"+name+",sorry,find error!";
    }
}
