package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Especialidad;

@RepositoryRestResource(collectionResourceRel= "especialidades", path="especialidades")
@CrossOrigin(origins="http://localhost:3000")

// /especialidades = GET
// /especialidades = POST
// /especialidades/{id} = GET
// /especialidades/{id} = PUT
// /especialidades/{id} = DELETE

public interface EspecialidadRepository extends PagingAndSortingRepository<Especialidad,Long>, CrudRepository<Especialidad,Long> {

    //Mapping personalizados

}
