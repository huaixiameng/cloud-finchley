package cloud.controller;

import cloud.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    FeignHystrixService feignHystrixService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignHystrixService.sayHiFromClientOne( name );
    }

}
