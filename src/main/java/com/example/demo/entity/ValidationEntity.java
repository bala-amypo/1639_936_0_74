package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.NotNull;
import jakarta.persistence.Email;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2,max=)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be a positive number")
    private Int age;
}

