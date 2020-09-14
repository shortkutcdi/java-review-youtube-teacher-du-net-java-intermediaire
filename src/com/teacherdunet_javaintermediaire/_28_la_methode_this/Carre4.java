package com.teacherdunet_javaintermediaire._28_la_methode_this;

public class Carre4 {
	protected int cote;
	protected String nom;
	protected String prenom;
	
	public Carre4(int cote, String nom) {
		this.cote = cote;
		this.nom = nom;
	}

	public Carre4(int cote, String nom, String prenom) {
		this(cote, nom); // appel du constructeur Carre4(int cote, String nom) avec this(cote, nom)
		this.prenom = prenom;
	}

	
	
}
