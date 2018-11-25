package mo.dern.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping("/mutate")
    public String mutate(@RequestBody String body) {
        System.out.println(body);
        return "OK";
    }
}