package com.teacherdunet_javaintermediaire._40classe_interne_statique__dans_un_bloc_une_methode;

public class A3 {
	protected  static int attr1; // attribut static
	private String attr2;
	
	public A3(int entier, String chaine) {
		this.attr1 = entier;
		this.attr2 = chaine;
	}
	
	public void toto() {
		class B3 {
			public B3() {
				System.out.println("Je suis le constructeur de B3 " + attr1);
			}
		}
		class D extends B3 {
			
		}
		new B3();
	}

	

	
	static class C3 {// classe interne statique
		static{ phrase = "Hello dans la variable de classe C3"; }
		
		public static String phrase;
		
		public C3() {
			System.out.println("Je suis dns le constructeur de C3");
		}		
		
		
		public static void methodeSTatiqueDeC3() {
			System.out.println("Dans la méthode statique de la classe interne statique C3");
		}
	}
	
	class Z {
		
	}
}
