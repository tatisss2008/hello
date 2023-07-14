package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.hello.hello.entity.Doctor;

@RepositoryRestResource(collectionResourceRel= "doctores", path="doctores")

// /pacientes = GET
// /pacientes = POST
// /pacientes/{id} = GET
// /pacientes/{id} = PUT
// /pacientes/{id} = DELETE

public interface DoctorRepository extends PagingAndSortingRepository<Doctor,Long>, CrudRepository<Doctor,Long> {

    //Mapping personalizados

}
