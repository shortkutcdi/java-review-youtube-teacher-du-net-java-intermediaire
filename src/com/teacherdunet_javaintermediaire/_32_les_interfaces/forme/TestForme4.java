package com.teacherdunet_javaintermediaire._32_les_interfaces.forme;

public class TestForme4 {

	public static void main(String[] args) {
		
		Forme4 carre = new Carre4(3,"Toto");
		System.out.println(carre.aire()); // 9

		
		Forme4[] tab = new Forme4[3];
		tab[0] = new Carre4(4, "Tata");
		tab[1] = new Triangle4();
		tab[2] = new Cercle4();
		
		for (Forme4 forme : tab) {
			System.out.println(forme.aire());
		}
		// 16.0
		// 4.0
		// 50.26548245743669
	}

}
