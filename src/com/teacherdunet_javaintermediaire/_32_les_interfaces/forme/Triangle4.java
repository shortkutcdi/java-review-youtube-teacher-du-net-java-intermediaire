package com.teacherdunet_javaintermediaire._32_les_interfaces.forme;

public class Triangle4 implements Forme4{

	protected int base = 4;
	protected int hauteur = 2;
	
	@Override // -- redéfinition de méthode --> existe ds parent redéfinit ds enfant (classe fille)
	public double aire() { // même signature que la classe parent
		return (double) ((base * hauteur) / 2);
	}
}
