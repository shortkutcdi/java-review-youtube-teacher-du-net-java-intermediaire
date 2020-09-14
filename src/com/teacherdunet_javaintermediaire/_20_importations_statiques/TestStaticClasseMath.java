package com.teacherdunet_javaintermediaire._20_importations_statiques;

import static java.lang.Math.*; // ajout de static (pas trop conseillé)

public class TestStaticClasseMath {
	public static void main(String[] args) {
		// mot clé static dans import
		// ex : import static java.lang.Math.*;
		//--> on peut utiliser toutes les méthodes et variables statiques sans Math
		// **PB : on ne sait pas sur quelle classe on appelle la méthode**
		
		// méthodes statiques de la classe Math
		System.out.println(abs(-34));
		System.out.println(cos(0));
		System.out.println(sin(0));
		
		// constante statique de la classe Math
		// System.out.println(Math.PI);
		System.out.println(PI);
	}
}
