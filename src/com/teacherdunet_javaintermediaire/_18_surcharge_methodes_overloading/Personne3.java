package com.teacherdunet_javaintermediaire._18_surcharge_methodes_overloading;

public class Personne3 {
	// variables d'instance
	private String nom;
	private String prenom;
	private int age;
	
	// variable de classe - initialisée
	public static int nombreTotalDePersonnes = 0; 

	public Personne3(String nom, String pernom) {
		this.nom = nom;
		this.prenom = pernom;
		nombreTotalDePersonnes++;
	}
	
	// surcharge de méthode
	public String getFullname() {
		return String.format("%s %s", prenom, nom);
	}
	
	// surcharge de méthode
	public String getFullname(String debut) {
		return String.format("%s %s %s",debut, prenom, nom);
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
