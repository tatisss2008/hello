package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.hello.hello.entity.Cita;

@RepositoryRestResource(collectionResourceRel= "citas", path="citas")

// /pacientes = GET
// /pacientes = POST
// /pacientes/{id} = GET
// /pacientes/{id} = PUT
// /pacientes/{id} = DELETE

public interface CitaRepository extends PagingAndSortingRepository<Cita,Long>, CrudRepository<Cita,Long> {

    //Mapping personalizados

}
