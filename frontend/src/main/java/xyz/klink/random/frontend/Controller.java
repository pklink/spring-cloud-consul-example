package xyz.klink.random.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private RandomService randomService;

    @RequestMapping("/int")
    public Integer showRandomInteger() {
        return randomService.getInteger().getValue();
    }

}
