package com.teacherdunet_javaintermediaire._26_covariance_de_variables;

public class Carre2 extends Forme2 {
	
	protected int cote = 4;

	public Carre2() {
	}
	
	public Carre2(int cote) {
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
