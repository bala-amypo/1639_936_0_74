package com.example.demo.Entity;
import jakarta.persistence.Entity;


@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private Long id;
    @notnull
    @Size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email
    private String email;
    
    private String password;
    private Int age;
}

