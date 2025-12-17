package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo repo;
    // save()
    // findAll()
    // findById()
    // deleteById()
    // exisById()
    public StudentEntity postData(StudentEntity stu){

    }
}