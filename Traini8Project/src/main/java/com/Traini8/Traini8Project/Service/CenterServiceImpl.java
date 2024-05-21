package com.Traini8.Traini8Project.Service;

import java.time.Instant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Traini8.Traini8Project.Model.CenterModel;
import com.Traini8.Traini8Project.Repo.CenterRepo;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private CenterRepo r1;
	
	//Saving a Training Center
	@Override
	public CenterModel createCenter(CenterModel obj) {
		obj.setCreatedOn(Instant.now());
		return r1.save(obj);
	}
	
	//Retrieving all Training Centers
	@Override
	public List<CenterModel> getAllCenters() {
		return r1.findAll();
	}

}
