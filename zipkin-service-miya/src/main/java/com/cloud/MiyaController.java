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
public class MiyaController {

    @Autowired
    RestTemplate restTemplate ;

    private static final Logger LOG = Logger.getLogger(MiyaController.class.getName());


    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "miya hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Level.INFO, "miya info is being called");
        return restTemplate.getForObject("http://localhost:19009/info",String.class);
    }

}
