package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;
public interface ValidationService{
    ValidationEntity post(ValidationEntity stu);
    ValidationEntity get(Long id);
    List<ValidationEntity> getAll();
    

}