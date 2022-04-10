package com.patients.PatientsService.service;

import java.util.Date;

import com.patients.PatientsService.dto.PatientDto;
import com.patients.PatientsService.entities.PatientEnt;

public interface PatientService {
	
	public PatientEnt getPatientData(long phone);
	public boolean addPatientVaccineData(PatientDto dto);
	public boolean updatePatientVaccineData(PatientDto dto);

}
