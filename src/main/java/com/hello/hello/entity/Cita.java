package com.hello.hello.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita{
    /**
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;    
    private LocalDate dateAppointment;

    //Relaciones
    @ManyToOne  
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

    //Constructor
    public Cita(){

    }
 
    public Cita(Long id, LocalDate dateAppointment, Doctor doctor, Paciente paciente) {
        this.id = id;
        this.dateAppointment = dateAppointment;
        this.doctor = doctor;
        this.paciente = paciente;
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    