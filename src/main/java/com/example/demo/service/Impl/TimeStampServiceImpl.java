package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import java.util.List;

@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired StudentRepo repo;
    // save()
    // findAll()
    // findById()
    // deleteById()
    // exisById()
    @Override
    public TimeStamp postData(TimeStamp stu){
        return repo.save(stu);
    }
}