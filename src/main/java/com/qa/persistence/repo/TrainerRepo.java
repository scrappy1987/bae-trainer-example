package com.qa.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Trainer;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Long>  {

}
