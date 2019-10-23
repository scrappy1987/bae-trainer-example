package com.qa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.TrainerService;
import com.qa.persistence.domain.Trainer;

@RestController
@RequestMapping("/trainerapp")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("/trainer")
	public List<Trainer> getAllTrainer() {
		return trainerService.getAllTrainer();
	}
	
	@PostMapping("/trainer")
	public Trainer addNewTrainer(@RequestBody Trainer trainer) {
		return trainerService.addNewTrainer(trainer);
	}
	
	@PutMapping("/trainer")
	public Trainer updateTrainer(@RequestBody Trainer trainer) {
		return trainerService.updateTrainer(trainer);
	}
	
	@DeleteMapping("/trainer/{id}")
	public String deleteTrainer(@PathVariable(value = "id") Long id) {
		return trainerService.deleteTrainer(id);
	}

}
