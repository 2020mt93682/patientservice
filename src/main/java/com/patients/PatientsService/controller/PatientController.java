package com.patients.PatientsService.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patients.PatientsService.dto.PatientDto;
import com.patients.PatientsService.dto.PatientVaccineDataDto;
import com.patients.PatientsService.entities.PatientEnt;
import com.patients.PatientsService.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	//@GetMapping(path="/{phone}")
	//public PatientEnt getPatientData(@PathVariable("phone") long phone) {
	@GetMapping(value="/getphone/{phone}")
	public PatientEnt getPatientData(@PathVariable("phone") long phone) {
		PatientEnt ent = service.getPatientData(phone);
		return ent;
	}
	
	@PostMapping(value="/addvaccinedata",consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addPatientVaccineData( @RequestBody PatientDto dto) {
		boolean response = service.addPatientVaccineData(dto);
		return response;		
	}
	
	@PutMapping(value="/updatevaccinedata",consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean savePatientVaccineData( @RequestBody PatientDto dto) {
		boolean response = service.updatePatientVaccineData(dto);
		return response;		
	}
	
	

}
