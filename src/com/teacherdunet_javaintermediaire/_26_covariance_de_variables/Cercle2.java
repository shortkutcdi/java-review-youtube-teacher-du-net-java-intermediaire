package com.teacherdunet_javaintermediaire._26_covariance_de_variables;

public class Cercle2 extends Forme2 {
	
	protected int rayon = 4;

	@Override  // hérite d'une classe abstraite ==> doit redéfinir les méthodes abstraite comme aire()
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	
}
