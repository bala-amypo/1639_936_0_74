package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=Generation)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
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
    public void String setEmail(email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Date getCreated(){
        return created;
    }
    public void setCreated(Date created){
        this.created=created;
    }
    public StudentEntity(){

    } 
    public StudentEntity(Integer id,String name,String password,String email,Date created){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
        this.created=created;
    }
}
