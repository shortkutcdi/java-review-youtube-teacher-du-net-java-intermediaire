package com.teacherdunet_javaintermediaire._24_classes_abstraites_methodes_abstraites_classe_Forme;

public class Carre1 extends Forme1 {
	
	protected int cote = 4;

	public Carre1() {
	}
	
	public Carre1(int cote) {
		cote = cote;
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
