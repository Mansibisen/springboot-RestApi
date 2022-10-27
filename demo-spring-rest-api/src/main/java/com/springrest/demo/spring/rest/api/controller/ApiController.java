package com.springrest.demo.spring.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.demo.spring.rest.api.entities.Load;
import com.springrest.demo.spring.rest.api.services.LoadServices;


@RestController
public class ApiController {
	@Autowired
	private LoadServices Service;
	
	
	// get the list of loads with particular shipperID
	@GetMapping("/load")
	public List<Load> getLoads(@RequestParam("shipperId") String shipperId ){
		return this.Service.getLoads(Long.parseLong(shipperId));
	}
	// post the loads
	@PostMapping(path="/load" , consumes ="application/json")
	public Load addLoad(@RequestBody Load load ){
		return this.Service.addLoad(load);
	}
	// get the loads of specific loadId
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId ){ 
		return this.Service.getLoad(Long.parseLong(loadId));
	}
	// delete the load of given loadId
	@PutMapping("/load")
	public Load updateLoad( @RequestBody Load load ){
		return this.Service.updateLoad(load);
	}
	// update the load of given loadId
	@DeleteMapping("/load/{loadId}")
	public Load deleteLoad(@PathVariable String loadId ){
		return this.Service.deleteLoad(Long.parseLong(loadId));
	}
	
}
