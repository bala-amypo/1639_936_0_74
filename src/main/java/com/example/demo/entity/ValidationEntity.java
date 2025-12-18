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
    @Size("min=2,max=6,must be 2 to 6 character")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be a positive number")
    private Int age;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getUsername(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void  setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public ValidationEntity(Long id,
        @NotNull @Size(min=2,max=10,message="must be 2 to 10 character") String username,@Email(message="Email is not valid")String email,
        @Size(min=2,max=10,message="must be 2 to 10 character") @NotNull(message="Password is mandatory") String password,
        @Max(30) @Positive(message="Age must be a positive number")int age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.age=age;
    }
    public ValidationEntity(){
        
    }
}

