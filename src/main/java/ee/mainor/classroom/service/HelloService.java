package ee.mainor.classroom.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }

}
