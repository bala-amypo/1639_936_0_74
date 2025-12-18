package com.example.demo.Entity;
import jakarta.persistence.Entity;


@Entity
public class ValidationEntity{
    @notnull
    private Long id;
    private String username;
    private String email;
    private String password;
    private Int age;
}

