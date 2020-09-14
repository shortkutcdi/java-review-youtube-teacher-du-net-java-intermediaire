package com.teacherdunet_javaintermediaire._26_covariance_de_variables;

public class Triangle2 extends Forme2{

	protected int base = 4;
	protected int hauteur = 2;
	
	@Override // -- redéfinition de méthode --> existe ds parent redéfinit ds enfant (classe fille)
	public double aire() { // même signature que la classe parent
		return (double) ((base * hauteur) / 2);
	}
}
