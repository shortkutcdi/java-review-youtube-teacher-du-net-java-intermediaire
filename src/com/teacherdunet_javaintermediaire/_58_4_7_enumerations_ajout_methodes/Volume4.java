package com.teacherdunet_javaintermediaire._58_4_7_enumerations_ajout_methodes;

public enum Volume4 {
	LOW(10), MEDIUM(50), HIGH(100);

	private int value;

	// le constructeur d'une enum est toujours private
	private Volume4(int value) {
		this.value = value;
	}

	public static void alert( ) {
		System.out.println("Attention à vos oreilles");
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
