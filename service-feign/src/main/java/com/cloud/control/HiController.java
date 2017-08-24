package com.cloud.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by UI03 on 2017/8/16.
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method= RequestMethod.GET)
    public  String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name) ;
    }
}
