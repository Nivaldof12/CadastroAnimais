package br.com.project.animalservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.animalservice.entidades.Animal;
import br.com.project.animalservice.repository.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {
	private AnimalRepository repository;
	
	public AnimalController(AnimalRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	private List<Animal> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	private Animal create(@RequestBody Animal animal) {
		return repository.save(animal);
	}
}
