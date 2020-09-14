package com.teacherdunet_javaintermediaire._36_bloc_d_initialisation_statiques__bloc_ini_instances;

import java.util.ArrayList;

public class Test {
	
	public static ArrayList<String> importantData; // variable de classe
	public int b; // variable d'instance
	
	// bloc d'initialisation statique- appelé une seule foie Lors de l'appel de Test
	static {
		importantData = getDataFromInternet(); // quand Test est appelé
	}
	
	// bloc d'initialisation d'instance
	{
		System.out.println("Je suis unconstructeur");
	}
	
	public Test() {
		System.out.println("Je suis un constructeur qui ne prend pas de paramètre");
	}
	
	public Test(int a) {
		System.out.println("Je suis un constructeur qui ne prend en paramètre un entier");
	}

	private static ArrayList<String> getDataFromInternet() {
		System.out.println("Downloading data from internet...");
		
		ArrayList<String> data = new ArrayList<String>();
		data.add("Google");
		data.add("Facebook");
		data.add("twitter");
		return data;
	}
	
}
