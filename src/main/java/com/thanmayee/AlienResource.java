package com.thanmayee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

	@Autowired
	AlienRepository alienRepository;

	@GetMapping("/aliens")
	public List<Alien> getAliens() {
		return (List<Alien>) alienRepository.findAll();
	}
}
