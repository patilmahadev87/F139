package com.app.criatosoft.main.disburt.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.app.criatosoft.main.disburt.model.Applicant;
import com.app.criatosoft.main.disburt.model.Disburtment;
import com.app.criatosoft.main.disburt.model.Document;
import com.app.criatosoft.main.disburt.model.LoanSanction;
import com.app.criatosoft.main.disburt.service.HomeService;

@CrossOrigin("*")
@RestController
// by deva changes
public class HomeController {

	@Autowired
	HomeService hs;
 
	@PostMapping(value = "/reg")
	public String saveData(@RequestBody Applicant d) {

		hs.saveData(d);
		return "Data Added Successfully";
	}

	@GetMapping("/getAccepted")
	public List<Applicant> getData() {
		List<Applicant> list = hs.getData();
		return list;
	}
	@GetMapping("/getRejected")
	public List<Applicant> rejectedData() {
		List<Applicant> list = hs.getRejectedData();
		return list;
	}
	@GetMapping("/getId/{id}")
	public Applicant getId(@PathVariable("id") String applicantId) {
	Applicant ls = hs.getId(applicantId);
		return ls;
	}

	
	
}
