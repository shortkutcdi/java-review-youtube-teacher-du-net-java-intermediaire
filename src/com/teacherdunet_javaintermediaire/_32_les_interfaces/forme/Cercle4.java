package com.teacherdunet_javaintermediaire._32_les_interfaces.forme;

public class Cercle4 implements Forme4 {
	
	protected int rayon = 4;

	@Override  // hérite d'une classe abstraite ==> doit redéfinir les méthodes abstraite comme aire()
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	
}
