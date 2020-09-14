package com.teacherdunet_javaintermediaire._27_mot_cle_super;

// classe abstraite non instantiable
abstract public class Forme3 {
	
	protected String name = "Forme";
	
	public Forme3() {
		System.out.println("Je suis le constructeur de la classe Forme");
	}
	
	public Forme3(String chaine) {
		System.out.println(chaine);
	}
	
	public double tata() {
		return 2.5;
	}
	
	// méthode abstraite == contrat avec les classes filles 
	abstract public double aire(); 
}
