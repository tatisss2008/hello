package com.hello.hello.entity;


// import java.util.ArrayList;
// import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;

@Entity
public class Especialidad{
    /**
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String description;

    //Relaciones
    // @OneToMany(mappedBy = "especialidad")
    // private List<Doctor> doctores= new ArrayList<>();


    //Constructor
    public Especialidad(){

    }

    public Especialidad( Long id ,String description ){
        this.id=id;
        this.description=description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Metodos de acceso
    // get o Set
    

}    
    