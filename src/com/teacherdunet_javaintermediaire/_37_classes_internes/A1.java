package com.teacherdunet_javaintermediaire._37_classes_internes;

public class A1 {
	private int attr1;
	private String attr2;
	
	public A1(int entier, String chaine) {
		this.attr1 = entier;
		this.attr2 = chaine;
		
		new B1().rire();
	}
	
	//classe interne dans classe A
	// accès de attribut et méthode de sa classe externe A 
	class B1  extends C1 implements D1 {
		
		public B1() {// exécuté à l'instantiation
			super(); // appel du constructeur C1
			System.out.printf("2- attr1 vaut %d et attr2 vaut %s.\n", attr1, attr2);
		}

		@Override
		public void rire() {
			System.out.println("3- Je ris");
		}
	}
	
	class C1 {
		public C1() {
			System.out.println("1- Dans le construteur de C1");
		}
	}
}
