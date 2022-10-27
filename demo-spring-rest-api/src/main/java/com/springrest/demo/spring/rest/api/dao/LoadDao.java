package com.springrest.demo.spring.rest.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springrest.demo.spring.rest.api.entities.Load;

public interface LoadDao extends JpaRepository<Load , Long> {
	@Query("select p from Load p where p.shipperId = :shipperId")
    List<Load> findAllByshipperId(Long shipperId);
    
	@Query("select p from Load p where p.loadId = :loadId")
	Load findOnebyloadId(Long loadId);
	

}
