package com.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by UI03 on 2017/8/23.
 */
@RestController
@RefreshScope
public class ClientContoller {

    Logger logger = LoggerFactory.getLogger(ClientContoller.class) ;
    @Value("${foo}")
    String foo ;

    @GetMapping("hi")
    public String hi(){
        logger.info("hi");
        return "hi :"+ foo ;
    }
}
