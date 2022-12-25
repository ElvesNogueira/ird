package com.elves.ird.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_IRD")
public class IRD implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private String tid;
	private String ua;

	@OneToOne
	private Polarization polarization;

	@OneToMany(mappedBy = "ird")
	private List<Channel> channels = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "IRD_id")
	private Satellite satellite;

	public IRD() {

	}

	public IRD(Long id, String model, String tid, String ua, Polarization polarization, Satellite satellite) {
		this.id = id;
		this.model = model;
		this.tid = tid;
		this.ua = ua;
		this.polarization = polarization;
		this.satellite = satellite;
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

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public Polarization getPolarization() {
		return polarization;
	}

	public void setPolarization(Polarization polarization) {
		this.polarization = polarization;
	}

	public List<Channel> getChannels() {
		return channels;
	}

	public Satellite getSatellite() {
		return satellite;
	}

	public void setSatellite(Satellite satellite) {
		this.satellite = satellite;
	}
	
	public void addChannel(Channel channel) {
		channels.add(channel);
	}
	
	public void removeChannel(Channel channel) {
		channels.remove(channel);
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
