package com.example.demo.controller;
import org.springframewok.beans.factory.annotation.Autowired;
import org.springframewok.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;

    @postMapping("\post")
    public StudentEntity sendData(@RequestBody )
}