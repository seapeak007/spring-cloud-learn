package com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by UI03 on 2017/8/15.
 */
@RestController
public class HiControler {
    @Autowired
    HiService hiService ;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
