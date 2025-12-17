package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
@Override
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo repo;
    // save()
    // findAll()
    // findById()
    // deleteById()
    // exisById()
    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }

}