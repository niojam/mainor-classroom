package ee.mainor.classroom.web;

import ee.mainor.classroom.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;
    public HelloController() {
        this.helloService = new HelloService();
    }

    @GetMapping("test")
    public String test() {
        return helloService.sayHello("Nikita");
    }

}
