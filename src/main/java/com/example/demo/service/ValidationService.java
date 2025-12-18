package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.ValidationEntity;
public interface ValidationService{
    ValidationEntity postData(ValidationEntity val);
    List<ValidationEntity>getAllData();
    String DeleteData(Long id);
    ValidationEntity getData(Long id);
    ValidatiomEntity updateData(int id,ValidationEntity entity);
} 