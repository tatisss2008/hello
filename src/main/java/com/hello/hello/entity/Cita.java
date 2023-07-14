package com.hello.hello.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cita{
    /**
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long idPaciente;
    private Long idDoctor;    
    private LocalDate dateAppointment;

    //Constructor
    public Cita(){

    }

    public Cita ( Long id ,Long idPaciente, Long idDoctor, LocalDate dateAppointment ){
        this.id=id;
        this.idPaciente=idPaciente;
        this.idDoctor=idDoctor;
        this.dateAppointment=dateAppointment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Long idDoctor) {
        this.idDoctor = idDoctor;
    }

    public LocalDate getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(LocalDate dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    //Metodos de acceso
    // get o Set

}    
    