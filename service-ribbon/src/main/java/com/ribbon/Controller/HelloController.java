package com.ribbon.Controller;

import com.ribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanyukai on 2018-6-19.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.helloService(name);
    }
}
