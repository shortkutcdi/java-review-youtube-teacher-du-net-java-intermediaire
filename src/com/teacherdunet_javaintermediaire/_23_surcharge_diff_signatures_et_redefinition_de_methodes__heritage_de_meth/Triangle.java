package com.teacherdunet_javaintermediaire._23_surcharge_diff_signatures_et_redefinition_de_methodes__heritage_de_meth;

public class Triangle extends Forme{

	protected int base = 4;
	protected int hauteur = 2;
	
	@Override // -- redéfinition de méthode --> existe ds parent redéfinit ds enfant (classe fille)
	public double aire() { // même signature que la classe parent
		return (double) ((base * hauteur) / 2);
	}
}
