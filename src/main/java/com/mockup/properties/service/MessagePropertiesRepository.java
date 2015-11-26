package com.mockup.properties.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mockup.properties.service.model.MessageProperties;

@RepositoryRestResource(collectionResourceRel = "message", path = "message")
public interface MessagePropertiesRepository extends PagingAndSortingRepository<MessageProperties, Long> {
	List<MessageProperties> findByCustomer(@Param("customer") String customer);
}
