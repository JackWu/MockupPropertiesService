package com.mockup.properties.service;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mockup.properties.service.model.ApplicationProperties;

@RepositoryRestResource(collectionResourceRel = "applicaition", path = "application")
public interface ApplicationPropertiesRepository extends PagingAndSortingRepository<ApplicationProperties, Long> {
	List<ApplicationProperties> findByCustomer(@Param("customer") String customer);
}
