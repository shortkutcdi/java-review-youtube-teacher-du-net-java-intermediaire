package com.teacherdunet_javaintermediaire._28_la_methode_this;

public class CarreTest {

	public static void main(String[] args) {
		
		Carre4 carre = new Carre4(5, "Toto");
		System.out.println(carre.cote);
		System.out.println(carre.prenom);
		
		Carre4 carre2 = new Carre4(5, "Bobo", "Bob");
		System.out.println(carre2.nom);
		System.out.println(carre2.prenom);
		
		

	}

}
