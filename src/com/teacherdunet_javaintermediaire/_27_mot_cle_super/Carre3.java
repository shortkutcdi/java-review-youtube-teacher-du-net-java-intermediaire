package com.teacherdunet_javaintermediaire._27_mot_cle_super;

public class Carre3 extends Forme3 {
	
	protected int cote = 4;

	public Carre3() {
		super(); // appelle le constructeur de la classe mère
		System.out.println("Je suis le constructeur de la classe Carre3 avec la propriété super.name : " + super.name);
		
		System.out.println("Appel de la méthode super.tata() : " + super.tata());
	}
	

	@Override  // hérite d'une classe abstraite ==> doit redéfinir les méthodes abstraite comme aire()
	public double aire() {
		return cote * cote;
	}
	


	
	
	
}
