package com.teacherdunet_javaintermediaire._36_bloc_d_initialisation_statiques__bloc_ini_instances;

public class MainTest {
	
	public static void main(String[] args) {
		Test test = new Test();
		/*
		 	Je suis unconstructeur
			Je suis un constructeur qui ne prend pas de paramètre
		 */
		System.out.println();
		
		Test test2 = new Test(10);
		/*
		 	Je suis unconstructeur
			Je suis un constructeur qui ne prend en paramètre un entier
		 */
	}

}
