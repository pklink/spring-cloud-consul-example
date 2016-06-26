package xyz.klink.random.frontend;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("backend")
interface RandomService {

    @RequestMapping(method = RequestMethod.GET, value = "/int")
    Random<Integer> getInteger();


}
