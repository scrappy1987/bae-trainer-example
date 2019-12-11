package com.qa.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Trainer;
import com.qa.service.TrainerService;

@RestController
public class TrainerController {
	
	private TrainerService service;
	
	public TrainerController(TrainerService service) {
		this.service = service;
	}
	
	@GetMapping("/trainer")
	public List<Trainer> getAllTrainer(){
		return service.getAllTrainers();
	}
	
	@PostMapping("/trainer")
	public Trainer addTrainer(@RequestBody Trainer trainerToAdd) {
		return service.addNewTrainer(trainerToAdd);
	}
	
	@DeleteMapping("/trainer/{id}")
	public String deleteTrainer(@PathVariable Long id) {
		return service.deleteTrainer(id);
	}

}
