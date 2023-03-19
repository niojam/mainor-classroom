package ee.mainor.classroom.service;

import ee.mainor.classroom.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private GreetingRepo greetingRepo;

    @Autowired
    public GreetingService(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }
    public String sayHelloEveryone(String name, String lastName) {
        return greetingRepo.save(name, lastName);
    }

}
