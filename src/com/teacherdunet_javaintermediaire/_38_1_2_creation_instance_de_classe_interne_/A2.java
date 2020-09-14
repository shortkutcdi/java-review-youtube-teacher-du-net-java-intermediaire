package com.teacherdunet_javaintermediaire._38_1_2_creation_instance_de_classe_interne_;

public class A2 {
	private int attr1;
	private String attr2;
	
	public A2(int entier, String chaine) {
		this.attr1 = entier;
		this.attr2 = chaine;
		
		new B2().rire();
	}
	
	//classe interne dans classe A2
	// accès de attribut et méthode de sa classe externe A2
	class B2  extends C2 implements D2 {
		
		public B2() {// exécuté à l'instantiation
			super(); // appel du constructeur C2
			System.out.printf("2- attr1 vaut %d et attr2 vaut %s.\n", attr1, attr2);
		}

		@Override
		public void rire() {
			System.out.println("3- Je ris");
		}
	}
	
	class C2 {
		public C2() {
			System.out.println("1- Dans le construteur de C2");
		}
	}
	
	class Z {
		
	}
}
