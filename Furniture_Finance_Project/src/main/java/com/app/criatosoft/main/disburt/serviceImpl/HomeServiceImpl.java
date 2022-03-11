package com.app.criatosoft.main.disburt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.criatosoft.main.disburt.model.Applicant;
import com.app.criatosoft.main.disburt.model.Disburtment;
import com.app.criatosoft.main.disburt.model.Document;
import com.app.criatosoft.main.disburt.model.LoanSanction;
import com.app.criatosoft.main.disburt.repository.HomeRepository;
import com.app.criatosoft.main.disburt.repository.SanctionRepository;
import com.app.criatosoft.main.disburt.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	HomeRepository hr;
	@Autowired
	SanctionRepository hsr;
	

	@Override
	public void saveData(Applicant d) {
		
		
		hr.save(d);
		
	}

	@Override
	public List<Applicant> getData() {
		List<Applicant> list=hr.findByStatus("OK");
		return list;
	}

	@Override
	public List<Applicant> getRejectedData() {
		List<Applicant> list=hr.findByStatus("rejected");
		return list;
	}

	@Override
	public Applicant getId(String applicantId) 
	{
		Applicant ls=hr.findByApplicantId(applicantId);
		return ls;
	}

	
	

}
