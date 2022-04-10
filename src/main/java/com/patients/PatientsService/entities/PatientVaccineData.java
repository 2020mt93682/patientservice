package com.patients.PatientsService.entities;

import java.util.Date;

public class PatientVaccineData {

	private String vaccine_name;
	private Date taken_date;

	
	
	public String getVaccine_name() {
		return vaccine_name;
	}



	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}



	public Date getTaken_date() {
		return taken_date;
	}



	public void setTaken_date(Date taken_date) {
		this.taken_date = taken_date;
	}



	public PatientVaccineData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
