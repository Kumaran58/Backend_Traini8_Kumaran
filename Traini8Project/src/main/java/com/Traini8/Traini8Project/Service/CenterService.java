package com.Traini8.Traini8Project.Service;

import java.util.List;

import com.Traini8.Traini8Project.Model.CenterModel;

public interface CenterService {
	
	CenterModel createCenter(CenterModel obj);

	List<CenterModel> getAllCenters();

}
