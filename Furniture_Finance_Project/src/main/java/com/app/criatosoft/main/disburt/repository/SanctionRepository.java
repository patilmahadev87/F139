package com.app.criatosoft.main.disburt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.criatosoft.main.disburt.model.LoanSanction;

public interface SanctionRepository extends JpaRepository<LoanSanction,Long>
{

}
