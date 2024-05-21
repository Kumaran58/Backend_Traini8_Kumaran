package com.Traini8.Traini8Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Traini8.Traini8Project.Model.CenterModel;
import com.Traini8.Traini8Project.Service.CenterServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/centers")
public class CenterController {

	@Autowired
	private CenterServiceImpl s1;

	// Creating a training Center API
	@PostMapping("/create")
	public ResponseEntity<CenterModel> createTrainingCenter(@Valid @RequestBody CenterModel Center) {
		CenterModel saved = s1.createCenter(Center);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}

	// GetAll training Centers API
	@GetMapping("/getAll")
	public ResponseEntity<List<CenterModel>> getAllTrainingCenter() {
		List<CenterModel> AllCenters = s1.getAllCenters();
		return ResponseEntity.ok(AllCenters);
	}

}
