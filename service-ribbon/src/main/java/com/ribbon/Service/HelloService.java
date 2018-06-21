package com.ribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yuanyukai on 2018-6-19.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://service-hello/hello?name="+name,String.class);
    }

    public String helloError(String name){
        return "hello,"+name+"sorry,error";
    }
}
