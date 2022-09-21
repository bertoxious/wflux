package com.ashish.wflux.entities;

import com.ashish.wflux.annotations.Name;
import com.ashish.wflux.annotations.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Name
    private String firstName;
    @Name
    private String lastName;
    private String address;
    @PhoneNumber
    private String phoneNumber;
}
