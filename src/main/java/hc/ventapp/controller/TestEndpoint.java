package hc.ventapp.controller;

import hc.ventapp.models.Person;
import hc.ventapp.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {

    @GetMapping("/test")
    public String greeting() {
        return "greeting";
    }

    @Autowired
    PersonRepo personRepo;

    @GetMapping("/createuser/{name}")
    public String createUser(@PathVariable("name") String name) {
        Person huy = new Person(1, name, name + "@email.com");
        huy = personRepo.save(huy);

        return "Success";
    }
}
