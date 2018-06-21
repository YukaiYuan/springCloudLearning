package com.feign.Controller;

import com.feign.Service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanyukai on 2018-6-19.
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return schedualServiceHello.sayHelloFromClientOne(name);
    }
}
