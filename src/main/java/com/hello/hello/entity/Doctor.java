package com.hello.hello.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;

@Entity
public class Doctor{
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
    private String consultorio;

    // //Relaciones
    // @ManyToOne
    // @JoinColumn(name="especialidad_id")

    // //LLave Foreanea
    // private Especialidad especialidad;


    //Constructor
    public Doctor(){

    }

    public Doctor ( Long id ,Long idDoc, String name, String lastName ,String email, String mobile,String consultorio ){
        this.id=id;
        this.idDoc=idDoc;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.mobile=mobile;
        this.consultorio=consultorio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

     //Metodos de acceso
    // get o Set

    

}    
   