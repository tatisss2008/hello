package com.hello.hello.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.hello.hello.entity.Student;

@RepositoryRestResource(collectionResourceRel= "students", path="students")

// /students = GET
// /students = POST
// /students/{id} = GET
// /students/{id} = PUT
// /students/{id} = DELETE

public interface StudentRepository extends PagingAndSortingRepository<Student,Long>, CrudRepository<Student,Long> {

    //Mapping personalizados

}
