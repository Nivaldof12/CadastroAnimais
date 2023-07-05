package br.com.project.animalservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.animalservice.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}