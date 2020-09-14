package com.teacherdunet_javaintermediaire._38_1_2_creation_instance_de_classe_interne_;

public class MainTest3 {

	public static void main(String[] args) {
		
		// avec la classe B interne instantie dans le constructeur de la classe A
		A2 a2 = new A2(45, "toto");
		
		//instance de C2
		a2.new C2();
		
		//B2 b2 = new B2();	// ne marche pas car classe interne 
							// --> il faut passe par sa classe extene A2
		// instance de B2 via a2 (A2)
		A2.B2 b2 =  a2.new B2();
	}

}
