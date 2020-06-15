package john.underground.exemplohelloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John
 * @version 0.0.1
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá mundo!";
    }

}
