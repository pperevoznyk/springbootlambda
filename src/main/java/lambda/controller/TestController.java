package lambda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableWebMvc
@RequestMapping(value = "/api")
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "Hello!";
    }
    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String bye() {

        return "Bye!";
    }
}
