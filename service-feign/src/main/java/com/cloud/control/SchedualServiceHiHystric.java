package com.cloud.control;

import org.springframework.stereotype.Component;

/**
 * Created by UI03 on 2017/8/16.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne( String name) {
        return "sorry,"+name;
    }
}
