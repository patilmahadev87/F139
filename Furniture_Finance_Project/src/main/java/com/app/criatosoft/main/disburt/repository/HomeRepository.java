package com.app.criatosoft.main.disburt.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.criatosoft.main.disburt.model.Applicant;
import com.app.criatosoft.main.disburt.model.Disburtment;
import com.app.criatosoft.main.disburt.model.Document;
import com.app.criatosoft.main.disburt.model.LoanSanction;

@Repository
public interface HomeRepository extends JpaRepository<Applicant, Long> {

	List<Applicant> findByStatus(String string);
	
	 Applicant findByApplicantId(String applicantId);

	

	

	
}
