package br.com.project.animalservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.project.animalservice.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
	@Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
	List<Animal> findNotAdopted();
	
	@Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
	List<Animal> findAdopted();
}