package com.patients.PatientsService.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection="patient")
public class PatientEnt {

	@Id
	private long patient_id;
	
	@Field
	@Indexed(unique=true)
	private long phone;
	
	private String name;
	
	private List<PatientVaccineData> vaccine_data;
	
	public long getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(long patient_id) {
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
	public List<PatientVaccineData> getVaccine_data() {
		return vaccine_data;
	}
	public void setVaccine_data(List<PatientVaccineData> vaccine_data) {
		this.vaccine_data = vaccine_data;
	}
	public PatientEnt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientEnt(long patient_id, long phone, String name, List<PatientVaccineData> vaccine_data) {
		super();
		this.patient_id = patient_id;
		this.phone = phone;
		this.name = name;
		this.vaccine_data = vaccine_data;
	}
	
	
	
	
	
	
}
