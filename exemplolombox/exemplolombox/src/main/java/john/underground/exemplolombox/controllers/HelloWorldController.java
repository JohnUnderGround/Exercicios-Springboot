package john.underground.exemplolombox.controllers;

import john.underground.exemplolombox.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }

    @GetMapping("/client")
    public Client getClient() {

        Client client = new Client();
        client.setName("John");
        client.setLastName("UnderGround");
        client.setAge(18);

        return client;
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto Cliente";
//    }
}
