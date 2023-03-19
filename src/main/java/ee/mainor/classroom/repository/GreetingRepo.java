package ee.mainor.classroom.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepo {

    public String save(String name, String lastName) {
        return String.format("Hello %s %s", name, lastName);
    }

}
