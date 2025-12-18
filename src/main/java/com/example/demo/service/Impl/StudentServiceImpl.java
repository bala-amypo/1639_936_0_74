package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo repo;
    // save()
    // findAll()
    // findById()
    // deleteById()
    // exisById()
    @Override
    public StudentEntity postData(StudentEntity stu){
        return repo.save(stu);
    }
    @Override
    public List<StudentEntity>getAllData(){
        return repo.findAll();
    }
    
}