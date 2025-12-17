package com.example.demo.entity
import jakarta.persistence.*;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private long int id;
    private String name;
    private String email;
    public Student(long int id,String name,String email,LocalDate dob,float cgpa){
        this.id=id;
        this.naem=name;
        this.email=email;

    }
    public String getName(){
        retrun name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}