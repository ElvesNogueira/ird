package com.elves.ird.dto;

import java.io.Serializable;

import com.elves.ird.entities.IRD;
import com.elves.ird.entities.Polarization;
import com.elves.ird.entities.Satellite;

public class IRDDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String model;
	private String ua;
	private String tid;
	private Polarization polarization;
	private Satellite satellite;
	
	public IRDDTO() {
	}

	public IRDDTO(IRD obj) {
		this.id = obj.getId();
		this.model=obj.getModel();
		this.ua = obj.getUa();
		this.tid = obj.getTid();
		this.polarization=obj.getPolarization();
		this.satellite=obj.getSatellite();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Polarization getPolarization() {
		return polarization;
	}

	public void setPolarization(Polarization polarization) {
		this.polarization = polarization;
	}

	public Satellite getSatellite() {
		return satellite;
	}

	public void setSatellite(Satellite satellite) {
		this.satellite = satellite;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	
	
	
}
