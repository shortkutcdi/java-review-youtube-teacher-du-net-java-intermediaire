package com.teacherdunet_javaintermediaire._30_TP3_une_classe_Calculatrice;

public class TestCalculatrice {
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.additionner(6, 6);
		calculatrice.soustaire(10, 2);
		calculatrice.additionner(4, 4);
		System.out.println(calculatrice.getResultat());
	}
}
