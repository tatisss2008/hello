package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Doctor;

@RepositoryRestResource(collectionResourceRel= "doctores", path="doctores")
@CrossOrigin(origins="http://localhost:3000")

// /doctores = GET
// /doctores = POST
// /doctores/{id} = GET
// /doctores/{id} = PUT
// /doctores/{id} = DELETE

public interface DoctorRepository extends PagingAndSortingRepository<Doctor,Long>, CrudRepository<Doctor,Long> {

    //Mapping personalizados

}
