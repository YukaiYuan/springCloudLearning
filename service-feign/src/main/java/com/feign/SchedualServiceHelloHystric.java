package com.feign;

import com.feign.Service.SchedualServiceHello;
import org.springframework.stereotype.Component;

/**
 * Created by yuanyukai on 2018-6-21.
 */
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name;
    }
}
