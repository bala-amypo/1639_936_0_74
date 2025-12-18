package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
public class StudentController{
    @Autowired StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }
    @GetMapping("/get")
    public List<StudentEntity>getval(){
        return ser.getAllData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id){
        return ser.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public StudentEntity getdata(@PathVariable int id){
        return ser.getData(id);
    }
    @UpdateMapping("/update{id}")
    public StudentEntity upda
}