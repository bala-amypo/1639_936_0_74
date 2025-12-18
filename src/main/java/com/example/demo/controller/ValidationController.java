package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;


@RestController
public class ValidationController{
    @Autowired ValidationService ser;

    @PostMapping("/post1")
    public ValidationEntity sendData1(@Valid @RequestBody ValidationEntity val){
        return ser.postData1(val);
    }
    // @GetMapping("/get")
    // public List<ValidationEntity>getval(){
    //     return ser.getAllData();
    // }
    // @DeleteMapping("/delete/{id}")
    // public String deleteData(@PathVariable long id){
    //     return ser.DeleteData(id);
    // }
    // @GetMapping("/getid/{id}")
    // public StudentEntity getdata(@PathVariable int id){
    //     return ser.getData(id);
    // }
    // @PutMapping("/put/{id}")
    // public StudentEntity putdata(@PathVariable int id,@RequestBody StudentEntity entity){
    //     return ser.updateData(id,entity);
    // }
}