package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStamp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
// import java.util.List;


@RestController
public class TimeStampController{
    @Autowired TimeStampService serv;
    @PostMapping("/postDa")
    public TimeStamp sendData(@RequestBody TimeStamp stu){
        return serv.postData(stu);
    }
    // @GetMapping("/get")
    // public List<StudentEntity>getval(){
    //     return serv.getAllData();
    // }
    // @DeleteMapping("/delete/{id}")
    // public String deleteData(@PathVariable int id){
    //     return serv.DeleteData(id);
    // }
    // @GetMapping("/getid/{id}")
    // public StudentEntity getdata(@PathVariable int id){
    //     return serv.getData(id);
    // }
    // @PutMapping("/put/{id}")
    // public StudentEntity putdata(@PathVariable int id,@RequestBody StudentEntity entity){
    //     return serv.updateData(id,entity);
    // }
}