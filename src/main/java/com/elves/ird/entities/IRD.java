package com.elves.ird.entities;

import java.io.Serializable;
import java.util.Objects;

public class IRD implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String model;
	private Long tid;
	private Long ua;
	private Polarization polarization;
	
	public IRD() {
		
	}
	
	

	public IRD(Long id, String model, Long tid, Long ua, Polarization polarization) {
		this.id = id;
		this.model = model;
		this.tid = tid;
		this.ua = ua;
		this.polarization = polarization;
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

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getUa() {
		return ua;
	}

	public void setUa(Long ua) {
		this.ua = ua;
	}

	public Polarization getPolarization() {
		return polarization;
	}

	public void setPolarization(Polarization polarization) {
		this.polarization = polarization;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IRD other = (IRD) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
