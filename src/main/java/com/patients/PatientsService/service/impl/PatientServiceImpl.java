package com.patients.PatientsService.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patients.PatientsService.dto.PatientDto;
import com.patients.PatientsService.dto.PatientVaccineDataDto;
import com.patients.PatientsService.entities.PatientEnt;
import com.patients.PatientsService.entities.PatientVaccineData;
import com.patients.PatientsService.repository.PatientRepository;
import com.patients.PatientsService.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository repo;
	
	
	@Override
	public PatientEnt getPatientData(long phone) {
		PatientEnt  ent =repo.findByPhone(phone);
		return ent;
	}
	
	@Override
	public boolean addPatientVaccineData(PatientDto dto) {
		
		PatientEnt ent = new PatientEnt();
		List<PatientVaccineData> vaccine_data_list = new ArrayList<>();
		
		ent.setPatient_id(dto.getPhone());
		ent.setPhone(dto.getPhone());
		ent.setName(dto.getName());
		
		
		PatientVaccineData vaccine_data = null;
		for(PatientVaccineDataDto vaccineDto: dto.getVaccine_data()) {
			vaccine_data = new PatientVaccineData();
			vaccine_data.setVaccine_name(vaccineDto.getVaccine_name());
			vaccine_data.setTaken_date(vaccineDto.getTaken_date());
			vaccine_data_list.add(vaccine_data);
		}	
		ent.setVaccine_data(vaccine_data_list);

		PatientEnt entSaved = repo.save(ent);
		if(entSaved != null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean updatePatientVaccineData(PatientDto dto) {
		
		List<PatientVaccineData> vaccine_data_list = null;
		PatientEnt ent = repo.findByPhone(dto.getPhone());
		
		if(ent.getVaccine_data().size() == 0) {
			vaccine_data_list = new ArrayList<>();
		}else {
			vaccine_data_list = ent.getVaccine_data();
		}
		
		PatientVaccineData vaccine_data = null;
		for(PatientVaccineDataDto vaccineDto: dto.getVaccine_data()) {
			vaccine_data = new PatientVaccineData();
			vaccine_data.setVaccine_name(vaccineDto.getVaccine_name());
			vaccine_data.setTaken_date(vaccineDto.getTaken_date());
			vaccine_data_list.add(vaccine_data);
		}
		
		ent.setVaccine_data(vaccine_data_list);

		PatientEnt entSaved = repo.save(ent);
		if(entSaved != null) {
			return true;
		}else {
			return false;
		}
	}

}
