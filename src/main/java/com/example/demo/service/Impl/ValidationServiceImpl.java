package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepo;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo repo;
    // save()
    // findAll()
    // findById()
    // deleteById()
    // exisById()
    @Override
    public VEntity postData(StudentEntity stu){
        return repo.save(stu);
    }
    @Override
    public List<StudentEntity>getAllData(){
        return repo.findAll();
    }
    @Override
    public String DeleteData(int id){
        repo.deleteById(id);
        return "Deleted Successfully";
    }
    @Override
    public StudentEntity getData(int id){
        return repo.findById(id).orElse(null);
    }
    @Override
    public StudentEntity updateData(int id,StudentEntity entity){
        if(repo.existsById(id)){
            entity.setId(id);
            return repo.save(entity);
        }
        return null;
    }
}