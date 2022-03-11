package com.app.criatosoft.main.disburt.service;

import java.util.List;

import com.app.criatosoft.main.disburt.model.Applicant;
import com.app.criatosoft.main.disburt.model.Disburtment;
import com.app.criatosoft.main.disburt.model.Document;
import com.app.criatosoft.main.disburt.model.LoanSanction;


public interface HomeService {

	public void saveData(Applicant d);

	public List<Applicant> getData();

	public List<Applicant> getRejectedData();

	public Applicant getId(String applicantId);

	

	

}
