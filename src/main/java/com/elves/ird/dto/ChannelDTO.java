package com.elves.ird.dto;
import java.io.Serializable;

import com.elves.ird.entities.Channel;



public class ChannelDTO implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer sid;
	
	public ChannelDTO() {
		
	}

	public ChannelDTO(Channel obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.sid = obj.getSid();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	
	
}
