package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Paciente;

@RepositoryRestResource(collectionResourceRel= "pacientes", path="pacientes")
@CrossOrigin(origins="http://localhost:3000")

// /pacientes = GET
// /pacientes = POST
// /pacientes/{id} = GET
// /pacientes/{id} = PUT
// /pacientes/{id} = DELETE

public interface PacienteRepository extends PagingAndSortingRepository<Paciente,Long>, CrudRepository<Paciente,Long> {

    //Mapping personalizados

}
