package com.teacherdunet_javaintermediaire._36_bloc_d_initialisation_statiques__bloc_ini_instances;

public class MainTestBlocSTatic {

	public static void main(String[] args) {
		for (String dataWebsite : Test.importantData) { // ici se charge la classe Test
			System.out.printf("Tous les jour, je visite %s.\n", dataWebsite);
		}
		/*
		 	Downloading data from internet...
			Tous les jour je visite Google
			Tous les jour je visite Facebook
			Tous les jour je visite Twitter
		 */
	}
}
