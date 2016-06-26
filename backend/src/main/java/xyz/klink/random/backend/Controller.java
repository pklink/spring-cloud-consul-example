package xyz.klink.random.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class Controller {

    @RequestMapping(value = "/int", method = RequestMethod.GET)
    public Map<String, Integer> hello() {
        Random random = new Random();
        Map<String, Integer> response = new HashMap<>(2);
        response.put("value", random.nextInt());
        return response;
    }

}
