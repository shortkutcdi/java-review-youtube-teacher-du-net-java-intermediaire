package com.teacherdunet_javaintermediaire._24_classes_abstraites_methodes_abstraites_classe_Forme;

public class Triangle1 extends Forme1{

	protected int base = 4;
	protected int hauteur = 2;
	
	@Override // -- redéfinition de méthode --> existe ds parent redéfinit ds enfant (classe fille)
	public double aire() { // même signature que la classe parent
		return (double) ((base * hauteur) / 2);
	}
}
