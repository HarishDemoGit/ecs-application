package com.ECSCallingEKS.ECS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello From ECS";
    }

    @RequestMapping("/callEks1")
    private String getEks1() {
        String uri = "http://af5b98aad8a324f06886c662d1bc0fe3-931780699.us-east-1.elb.amazonaws.com/eks1/user";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @RequestMapping("/callEks2")
    private String getEks2() {
        String uri = "http://af8358252bf6d43f2a4b20e1f9cb87a6-727203431.us-east-1.elb.amazonaws.com/eks2/user";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
