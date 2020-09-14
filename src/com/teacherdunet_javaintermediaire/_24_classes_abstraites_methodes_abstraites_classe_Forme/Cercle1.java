package com.teacherdunet_javaintermediaire._24_classes_abstraites_methodes_abstraites_classe_Forme;

public class Cercle1 extends Forme1 {
	
	protected int rayon = 4;

	@Override  // hérite d'une classe abstraite ==> doit redéfinir les méthodes abstraite comme aire()
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	
}
