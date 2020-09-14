package com.teacherdunet_javaintermediaire._11_encapsulation.personne;

public class Personne2 {
	private String nom;
	private int age;

	public Personne2(String nom) {
		this.nom = nom;
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
