package com.example.demo.servimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dem.model.StudentDetail;
import com.example.dem.repository.StudentRepository;
import com.example.dem.service.StudentService;

@Service
public class Sservimpl implements StudentService{
    // private final StudentRepository strep;
    // public Sservimpl(StudentRepository strep){
    //     this.strep=strep;
    // }

    @Autowired
    StudentRepository strep;

    public Student saveStudent(Student st){
        return strep.save(student);
    }
    

}
