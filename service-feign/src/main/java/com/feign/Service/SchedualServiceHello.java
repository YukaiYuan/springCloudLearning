package com.feign.Service;

import com.feign.SchedualServiceHelloHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yuanyukai on 2018-6-19.
 */
@FeignClient(value = "service-hello",fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
