package com.teacherdunet_javaintermediaire._55_1_7__enumerations;

public class LecteurMp3 {

	private String volume;


	public String getVolume() {
		return volume;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public static void main(String[] args) {

		LecteurMp3 lecteur = new LecteurMp3();
		
		// objectif pouvoir sélectionner 3 type de volumes low, medium, high
		lecteur.setVolume("low"); // ici on peut mettre n'importe quelle valeur
		System.out.println(lecteur.getVolume());
		lecteur.setVolume("medium"); // ici on peut mettre n'importe quelle valeur
		System.out.println(lecteur.getVolume());
		lecteur.setVolume("high"); // ici on peut mettre n'importe quelle valeur
		System.out.println(lecteur.getVolume());
		lecteur.setVolume("sdgghs"); // ici on peut mettre n'importe quelle valeur
		System.out.println(lecteur.getVolume());
	}

}
