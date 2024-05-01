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
        String uri = "http://a22096baa48b247a08514786e6840e4c-1521195377.us-east-1.elb.amazonaws.com/eks1/user";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @RequestMapping("/callEks2")
    private String getEks2() {
        String uri = "http://a6b71ac5b6ecf46d6ac1c558efcce18b-1615111697.us-east-1.elb.amazonaws.com/eks2/user";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
