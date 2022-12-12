package com.elves.ird;

public enum Polarization {
	
	HORIZONTAL(1),
	VERTICAL(2);
	
	private int code;
	
	private Polarization(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
}
