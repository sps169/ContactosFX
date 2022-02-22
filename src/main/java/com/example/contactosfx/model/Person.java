package com.example.contactosfx.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String mail;
    private String imageUrl;
}
