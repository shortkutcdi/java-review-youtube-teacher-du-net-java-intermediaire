package com.teacherdunet_javaintermediaire._10_accesseur_et_mutateurs;

public class Personne {
	public String nom;
	public int age;

	public Personne(String nom) {
		this.nom = nom;
	}

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
	

}
