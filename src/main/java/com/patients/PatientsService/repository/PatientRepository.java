package com.patients.PatientsService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.patients.PatientsService.entities.PatientEnt;

public interface PatientRepository extends MongoRepository<PatientEnt, Integer> {
	
	public PatientEnt findByPhone(long phone);

}
