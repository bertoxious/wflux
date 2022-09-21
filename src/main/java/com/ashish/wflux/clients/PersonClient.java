package com.ashish.wflux.clients;

import com.ashish.wflux.entities.Person;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class PersonClient {
    WebClient client = WebClient.create("http://localhost:8080");
    Mono<Person> employeeMono = client.get()
            .uri("/employees/{id}", "1")
            .retrieve()
            .bodyToMono(Person.class);
}
