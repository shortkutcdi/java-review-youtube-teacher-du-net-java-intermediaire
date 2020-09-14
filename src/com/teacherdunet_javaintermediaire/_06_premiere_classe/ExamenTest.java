package com.teacherdunet_javaintermediaire._06_premiere_classe;

import java.util.Scanner;

public class ExamenTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer le matière concernée");
		String message = clavier.nextLine();
		
		Examen examen = new Examen();
		examen.afficherMessage();
		examen.afficherMessage(message);
		
	}

}
