package com.teacherdunet_javaintermediaire._32_les_interfaces.forme;

public class Carre4 implements Forme4 {
	
	protected int cote = 4;
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

	@Override  // hérite d'une classe abstraite ==> doit redéfinir les méthodes abstraite comme aire()
	public double aire() {
		return cote * cote;
	}
	
	// surcharge de méthode
	public int toto() { // signature 1
		return 1;
	}

	// surcharge de méthode
	public int toto(int a) { // signature 2 -- différente de signature 1
		return 1 + a;
	}

	
	
	
}
