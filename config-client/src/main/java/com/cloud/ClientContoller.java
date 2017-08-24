package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by UI03 on 2017/8/23.
 */
@RestController
public class ClientContoller {

    @Value("${foo}")
    String foo ;

    @GetMapping("hi")
    public String hi(){
        return "hi :"+ foo ;
    }
}
