package com.example.myproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyModel {

    @Id
    private Long id;
    private String name;

    // getters and setters
}
