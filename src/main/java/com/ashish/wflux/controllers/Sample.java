package com.ashish.wflux.controllers;

import com.ashish.wflux.entities.Person;
import com.ashish.wflux.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class Sample {
    private PersonRepository personRepository;

    public Sample(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    @GetMapping("/all-persons")
    private Flux<Person> getAllPersons() {
        return (Flux<Person>) personRepository.findAll();
    };

    @PostMapping("/create-person")
    private Mono<Person> createPerson(@Valid @RequestBody Person person){
        return personRepository.save(person);
    }
}
