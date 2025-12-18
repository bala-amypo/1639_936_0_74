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
    public ValidationEntity postData1(ValidationEntity val){
        return repo.save(val);
    }
    // @Override
    // public List<ValidationEntity>getAllData(){
    //     return repo.findAll();
    // }
    // @Override
    // public String DeleteData(Long id){
    //     repo.deleteById(id);
    //     return "Deleted Successfully";
    // }
    // @Override
    // public ValidationEntity getData(Long id){
    //     return repo.findById(id).orElse(null);
    // }
    // @Override
    // public ValidationEntity updateData(int id,ValidationEntity entity){
    //     if(repo.existsById(id)){
    //         entity.setId(id);
    //         return repo.save(entity);
    //     }
    //     return null;
    // }
}