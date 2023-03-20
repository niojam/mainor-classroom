package ee.mainor.classroom.web;

import ee.mainor.classroom.dto.StudentDto;
import ee.mainor.classroom.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


// #TODO FINISH GAME
// #TODO ADD DB dependencies
// #TODO ADD Configuration for db
// #TODO INIT SQL FILES
// #TODO create model


// #TODO create repository



// TODO add docker-compose
// TODO add liquibase
// TODO add changelog
// TODO update your application.properties file
// TODO Test your application

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping("/{name}")
    public String sayHelloEveryone(@PathVariable String name, @RequestParam String lastName) {
        return greetingService.sayHelloEveryone(name, lastName);
    }

    @GetMapping("/{name}/{last}")
    public String sayHello(@PathVariable String name, @PathVariable String last) {
        return String.format("Hello %s %s", name, last);
    }

    @PostMapping("student")
    public String createStudent(@RequestBody StudentDto student) {
        return student.getLastname();
    }

    @PutMapping("student")
    public String updateStudent(@RequestBody StudentDto student) {
        return greetingService.sayHelloEveryone(student.getName(), student.getLastname());
    }

}
