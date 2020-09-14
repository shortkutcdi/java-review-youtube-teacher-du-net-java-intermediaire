package com.teacherdunet_javaintermediaire._26_covariance_de_variables;

public class TestForme2 {
	
	public static void main(String[] args) {
		Forme2[] tab =  new Forme2[3]; // crée un tableau de Forme2
		
		// casting implicite - ou covariance de variable
		Forme2 form1 = new Cercle2();
		Forme2 form2 = new Triangle2();
		Forme2 form3 = new Carre2();
		
		//form3.toto(); // méthode de la classe Carre2 pas accessible -- car non présente dans Forme2
		Carre2 carre = new Carre2();
		System.out.println(carre.toto()); // ds ce cas accessible
		
		
		tab[0] = form1;
		tab[1] = form2;
		tab[2] = form3;
		
		for (Forme2 forme : tab) {
			System.out.println(forme.aire());
		}
	}

}
