package com.example.individualnurses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.individualnurses.Entity.Nurse;
import com.example.individualnurses.Repository.NurseRepository;

@RestController
@RequestMapping("/nurse")
public class NurseController {
	
	@Autowired
    private NurseRepository nurseRepository;
	
	@GetMapping("/index")
	public @ResponseBody ResponseEntity<List<Nurse>> getAll() {
		try {
			return ResponseEntity.ok(nurseRepository.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
		
	}
	
}