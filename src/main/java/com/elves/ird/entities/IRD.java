package com.elves.ird.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IRD implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private Long tid;
	private Long ua;
	//private Polarization polarization;
	
//	@OneToMany(mappedBy ="id")
	//List<Channel> list = new ArrayList<>();
	
	
//	@OneToOne
	private Satellite satellite;
	
	

	public IRD() {

	}

	public IRD(Long id, String model, Long tid, Long ua) {
		this.id = id;
		this.model = model;
		this.tid = tid;
		this.ua = ua;
//		this.polarization = polarization;
//		this.satellite = satellite;
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

//	public Polarization getPolarization() {
//		return polarization;
//	}
//
//	public void setPolarization(Polarization polarization) {
//		this.polarization = polarization;
//	}
	
//	public List<Channel> getList() {
//		return list;
//	}

	public Satellite getSatellite() {
		return satellite;
	}

	public void setSatellite(Satellite satellite) {
		this.satellite = satellite;
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
