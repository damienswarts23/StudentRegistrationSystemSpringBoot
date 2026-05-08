package za.ac.mycput.studentregistrationsystemspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRegistrationSpringBootController {
    @GetMapping
    public String homeStudentRegistrationSpringBoot(){
        return "This springboot Application is working";
    }
}
