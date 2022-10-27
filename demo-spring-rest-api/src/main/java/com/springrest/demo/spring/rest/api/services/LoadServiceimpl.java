package com.springrest.demo.spring.rest.api.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.demo.spring.rest.api.dao.LoadDao;
import com.springrest.demo.spring.rest.api.entities.Load;

@Service
public class LoadServiceimpl implements LoadServices {
	
	
	@Autowired
	private LoadDao loadDao;
    
    
    public LoadServiceimpl() {
    	
    	
    }
	@Override
	public List<Load> getLoads(Long shipperId ) {
		// TODO Auto-generated method stub
		return loadDao.findAllByshipperId(shipperId);
	}
	@Override
	public Load getLoad(Long loadId) {
		// TODO Auto-generated method stub
		Load entity = loadDao.findOnebyloadId(loadId);
		return entity;
	}
	@Override
	public Load addLoad(Load load) {
		// TODO Auto-generated method stub
		loadDao.save(load);
		return load;
	}
	@Override
	public Load deleteLoad(Long loadId) {
		// TODO Auto-generated method stub
		Load entity = loadDao.getOne(loadId);
		loadDao.delete(entity);
		return entity;
	}
	@Override
	public Load updateLoad(Load load) {
		// TODO Auto-generated method stub
		loadDao.save(load);
		return load;
	}
	

}
