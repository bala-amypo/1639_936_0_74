package com.example.demo.controller;
import org.springframewok.beans.factory.annotation.Autowired;
import org.springframewok.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframewok.web.bind.annotation.RequestBody;
import org.springframewok.web.bind.annotation.PostMapping;


@RestController
public class StudentController{
    @Autowired StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }
}