package com.teacherdunet_javaintermediaire._24_classes_abstraites_methodes_abstraites_classe_Forme;

public class TestForme1 {
	public static void main(String[] args) {
		
		// Forme1 forme = new Forme1(); // une classe abstraite n'est pas instantiable
		
		System.out.println(new Carre1().aire()); // 16 - 4 * 4
		
		System.out.println(new Triangle1().aire()); // 4 -- (b*h)/2  -- (2*4)/2
		
		System.out.println(new Cercle1().aire()); // 50.26548245743669

	}
}
