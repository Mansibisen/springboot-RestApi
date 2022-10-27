package com.springrest.demo.spring.rest.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.demo.spring.rest.api.entities.Load;

@Service
public interface LoadServices {
	public List<Load> getLoads(Long shipperId);
	public Load getLoad(Long loadId);
	public Load addLoad(Load load);
	public Load deleteLoad(Long loadId);
	public Load updateLoad(Load loadId);
}
