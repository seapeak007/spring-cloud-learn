package com.cloud.control;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by UI03 on 2017/8/16.
 */
@FeignClient(value = "service-hi" ,fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name) ;
}
