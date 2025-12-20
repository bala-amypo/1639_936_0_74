package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TimeStampRepo;
import java.util.List;

@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired TimeStampRepo repo;
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