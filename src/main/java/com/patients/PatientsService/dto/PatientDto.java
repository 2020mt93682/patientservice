package com.patients.PatientsService.dto;

import java.util.List;

public class PatientDto {
	private int patient_id;
	private long phone;
	private String name;
	private List<PatientVaccineDataDto> vaccine_data;	
	
	
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PatientVaccineDataDto> getVaccine_data() {
		return vaccine_data;
	}
	public void setVaccine_data(List<PatientVaccineDataDto> vaccine_data) {
		this.vaccine_data = vaccine_data;
	}
	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
