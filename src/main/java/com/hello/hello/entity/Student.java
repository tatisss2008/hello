package com.hello.hello.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student{
    /**
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth; //date_of_birth

    //Relaciones
    @ManyToOne
    @JoinColumn(name="advisor_id")

    //LLave Foreanea
    private Advisor advisor;

    //Constructor
    public Student(){

    }

    public Student ( Long id , String name, String email, LocalDate dateOfBirth ){
        this.id=id;
        this.name=name;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
    }


    
    //Metodos de acceso
    // get o Set
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    

}


