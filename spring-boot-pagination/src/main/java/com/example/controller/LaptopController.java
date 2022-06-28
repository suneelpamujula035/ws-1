package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
	public String save(@RequestBody Laptop laptop) {
		Laptop lap = lRepo.save(laptop);
		return "Laptop saved with id : " + lap.getId();
	}

	@PostMapping("/laptops")
	public String save(@RequestBody List<Laptop> laptop) {
		List<Laptop> laps = lRepo.saveAll(laptop);
		return "Number of laptops saved: " + laps.size();
	}

	@GetMapping("/laptops/{page}/{size}")
	public List<Laptop> getAll(@PathVariable Integer page, @PathVariable Integer size) {
		PageRequest pages = PageRequest.of(page, size);
		List<Laptop> listOfLaps = lRepo.findAll(pages).toList();
		return listOfLaps;
	}
	
	@GetMapping("/sorting")
	public List<Laptop> getLaptopsSorting(@RequestParam String field) {
		return lRepo.findAll(Sort.by(Direction.ASC, field));
	}

//	@GetMapping("/sorting/field")
//	public List<Laptop> getLaptopsSorting(@PathVariable String field) {
//		return lRepo.findAll(Sort.by(Direction.ASC, field));
//	}
//	@GetMapping("/laptops")
//	public List<Laptop> getAll (@RequestParam Integer page, @RequestParam Integer size) {
//		PageRequest pages = PageRequest.of(page, size);
//		return lRepo.findAll(pages).toList();
//	}
}
