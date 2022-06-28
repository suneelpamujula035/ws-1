package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Laptop;
import com.example.repository.LaptopRepository;

@RestController
public class LaptopController {

	@Autowired
	private LaptopRepository lRepo;
	
	@PostMapping("/laptop")
	public String save(@RequestBody Laptop laptop)
	{
		Laptop lap = lRepo.save(laptop);
		return "Laptop saved with id : "+lap.getId();
	}
	@PostMapping("/laptops")
	public String save(@RequestBody List<Laptop> laptops)
	{
		List<Laptop> laps = lRepo.saveAll(laptops);
		return "Number of laptops saved : "+laps.size();
	}
	
	@GetMapping("/allLaptops/field")
	public List<Laptop> getAllLaps(@PathVariable String field) {
		return lRepo.findAll(Sort.by(Direction.ASC, field));
	}
	
	@GetMapping("/laptops")
	public List<Laptop> getAll(@RequestParam String field) {
		return lRepo.findAll(Sort.by(Direction.ASC, field));
	}
}
