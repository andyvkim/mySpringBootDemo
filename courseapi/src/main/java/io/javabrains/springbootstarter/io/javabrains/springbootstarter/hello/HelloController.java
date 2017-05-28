package io.javabrains.springbootstarter.io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // contains methods mapped to particular requests
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }

}
