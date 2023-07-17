package com.hello.hello.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente{
    /**
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long idDoc;
    private String name;    
    private String lastName;    
    private String email;
    private String mobile;
    private LocalDate dateOfBirth;

    //Relaciones
    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    //Constructor
    public Paciente(){

    }

    public Paciente ( Long id ,Long idDoc, String name, String lastName ,String email, String mobile,LocalDate dateOfBirth ){
        this.id=id;
        this.idDoc=idDoc;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.mobile=mobile;
        this.dateOfBirth=dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public Long getIdDoc() {
        return idDoc;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    

}    
    //Metodos de acceso
    // get o Set