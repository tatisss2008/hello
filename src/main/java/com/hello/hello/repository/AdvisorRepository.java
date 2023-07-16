package com.hello.hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Advisor;


@RepositoryRestResource(collectionResourceRel = "advisors", path="advisors")
@CrossOrigin(origins = "http://localhost:3000")
public interface AdvisorRepository extends PagingAndSortingRepository<Advisor, Long>, CrudRepository<Advisor, Long>
{
    //Mappings personalizados
}
