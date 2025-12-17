package com.example.demo.servimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class Sservimpl implements StudentService{
    // private final StudentRepository strep;
    // public Sservimpl(StudentRepository strep){
    //     this.strep=strep;
    // }

    @Autowired
    StudentRepository strep;

    public Student saveStudent(Student st){
        return strep.save(st);
    }
    

}
