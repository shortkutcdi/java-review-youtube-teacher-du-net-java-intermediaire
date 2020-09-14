package com.teacherdunet_javaintermediaire._57_3_7_enumerations__constructeur;

public enum Volume3 {
	LOW(10), MEDIUM(50), HIGH(100);

	private int value;

	// le constructeur d'une enum est toujours private
	private Volume3(int value) {
		this.value = value;
	}

//	public int getValue() {
//		return value;
//	}
//
//	public void setValue(int value) {
//		this.value = value;
//	}
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
