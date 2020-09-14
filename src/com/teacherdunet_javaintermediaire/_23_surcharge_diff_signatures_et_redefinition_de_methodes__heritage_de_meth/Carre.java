package com.teacherdunet_javaintermediaire._23_surcharge_diff_signatures_et_redefinition_de_methodes__heritage_de_meth;

public class Carre extends Forme {

	public Carre() {
	}
	
	public Carre(int cote) {
		super.cote = cote;
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
