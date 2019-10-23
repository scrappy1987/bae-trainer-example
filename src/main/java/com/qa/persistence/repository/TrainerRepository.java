package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long>  {
	
	
}
