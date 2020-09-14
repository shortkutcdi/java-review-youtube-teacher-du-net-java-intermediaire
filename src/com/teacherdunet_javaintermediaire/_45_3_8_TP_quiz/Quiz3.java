package com.teacherdunet_javaintermediaire._45_3_8_TP_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz3 {

	private int score;
	private long timeElapse;

	public void start() {
		for (Question3 question : generate(5)) {
			System.out.println(question.getText() + ", capitale : " + question.getReponse() );
		}
	}

	public void displayResult() {
		// TODO: Complete this methode
	}

	public ArrayList<Question3> generate(int nombreDeQuestion) {
		// récupération des données
		String[][] data = getData();

		ArrayList<Question3> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays, reponseUtilisateur;
		long time = 0;

		// indexesAlreadyTaken.clear(); // inutile car à chaque fois qu'on exécute generate() on crée un nouveau tableau

		for (int i = 0; i < nombreDeQuestion; i++) {
			time = System.currentTimeMillis();

			do {
				// choisir pays de manière aléatoire - nombre aléatoire de 0 à sizeArrayData-1
				randomIndex = (int) (Math.random() * sizeArrayData);
				// System.out.println(random);
			} while (indexesAlreadyTaken.contains(randomIndex));// vérification si question posée déjà effectuée

			pays = data[randomIndex][0];
			capitale = data[randomIndex][1];

			indexesAlreadyTaken.add(randomIndex);
			
			String questionText = String.format("Quelle est la capitale de %s ? ", pays);
						
			questions.add(new Question3(questionText, capitale));
		}
		return questions;
	}

	private static String[][] getData() {
		String[][] data = { { "Senegal", "Dakar" }, { "France", "Paris" }, { "Nigeria", "Lagos" },
				{ "Gabon", "Libreville" }, { "Allemagne", "Berlin" }, { "Italie", "Rome" }, { "Monaco", "Monaco" },
				{ "Liberia", "Monrovia" }, { "Perou", "Lima" } };
		return data;
	}
}
