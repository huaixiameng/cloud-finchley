package cloud.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignHystrixService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}


