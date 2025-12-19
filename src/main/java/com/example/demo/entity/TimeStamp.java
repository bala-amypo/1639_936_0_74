package com.example.demo.entity;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.time.LocalDateTime;


@Entity

public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

     @PrePersist
    LocalDateTime now=LocalDateTime.now();
    public void Oncreate(){
        this.createAt = now;
        this.updateAt = now;
    }
    @PreUpdate
    public void Onupdate(){
        this.updateAt=now;
    }

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
    public LocalDateTime getCreateAt(){
        return createAt;
    }
    public void setCreateAt(LocalDateTime createAt){
        this.createAt=createAt;
    }
    public LocalDateTime getUpdateAt(){
        return updateAt;
    }
    public void setUpdateAt(LocalDateTime updateAt){
        this.updateAt=updateAt;
    }
    public TimeStamp(){

    } 
    public TimeStamp(Long id,String name,String password,String email,LocalDateTime createAt,LocalDateTime updateAt){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
        this.createAt=createAt;
        this.updateAt=updateAt;
    }
}