package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Cita;

@RepositoryRestResource(collectionResourceRel= "citas", path="citas")
@CrossOrigin(origins="http://localhost:3000")

// /citas = GET
// /citas = POST
// /citas/{id} = GET
// /citas/{id} = PUT
// /citas/{id} = DELETE

public interface CitaRepository extends PagingAndSortingRepository<Cita,Long>, CrudRepository<Cita,Long> {

    //Mapping personalizados

}
