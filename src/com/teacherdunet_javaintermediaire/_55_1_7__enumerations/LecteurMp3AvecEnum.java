package com.teacherdunet_javaintermediaire._55_1_7__enumerations;


public class LecteurMp3AvecEnum {


	private Volume volume;
	
	public enum Volume {
		LOW, MEDIUM, HIGH
	}

	public Volume getVolume() {
		return volume;
	}


	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	public static void main(String[] args) {

		LecteurMp3AvecEnum lecteur = new LecteurMp3AvecEnum();
		
		// objectif pouvoir sélectionner 3 type de volumes low, medium, high
		lecteur.setVolume(Volume.LOW); 
		System.out.println(lecteur.getVolume());
		lecteur.setVolume(Volume.MEDIUM); 
		System.out.println(lecteur.getVolume());
		lecteur.setVolume(Volume.HIGH); 
		System.out.println(lecteur.getVolume());
		// lecteur.setVolume("sdgghs"); // interdiction
	}

}
