package com.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by UI03 on 2017/8/25.
 */
@RestController
public class HiController {

    private static final Logger LOG = Logger.getLogger(HiController.class.getName());
    @Autowired
    RestTemplate restTemplate ;

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "hi calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:19010/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "info calling trace service-hi ");

        return "i'm service-hi";

    }
}
