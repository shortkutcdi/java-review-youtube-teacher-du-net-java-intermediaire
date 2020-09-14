package com.teacherdunet_javaintermediaire._16_variable_et_methodes_statiques__mot_static;

public class Personne2 {
	// variables d'instance
	private String nom;
	private int age;
	
	// variable de classe - initialisée
	private static int nombreTotalDePersonnes = 0; 
	public static int nbTotPersonnes = 0;

	public Personne2(String nom) {
		this.nom = nom;
		nombreTotalDePersonnes++;
		nbTotPersonnes++;
	}
	
	// méthode de classe (avec static -- et pas d'instance)
	public static int  getNombreTotalDePersonnes() {
		return nombreTotalDePersonnes;
	}

	// getters setters|
	public void setAge(int age) {
		if (age >= 15) {
			this.age = age;
		} else {
			System.out.println("Interdit aux moins de 15 ans");
		}
	}

	public int getAge() {
		return age * 365;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
