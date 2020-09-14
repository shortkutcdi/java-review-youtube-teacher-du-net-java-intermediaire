package com.teacherdunet_javaintermediaire._46_4_8_TP_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz4 {

	private int score;
	private long timeElapse;
	private boolean done = false;

	public static final int NUMBER_OF_QUESTIONS = 9;
	Scanner clavier = new Scanner(System.in);

	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			for (Question4 question : generate(NUMBER_OF_QUESTIONS)) {
				System.out.println(question.getText());
				String answerCapitale = clavier.nextLine().trim();
				// clavier.nextLine();
							
				// on compare les réponses
				if (answerCapitale.equalsIgnoreCase(question.getReponse())) {
					System.out.println("Bonne réponse");
					score++;
				} else {
					System.out.printf("Non, la capitale est %s\n\n", question.getReponse());
				}
				done = true;
			}
			// durée de la partie
			long endTime = System.currentTimeMillis() ;
			timeElapse = endTime- startTime;
		} catch (IllegalArgumentException e) {
			done = false;
			System.out.println(e.getMessage());
		}
		
		clavier.close();
	}

	private long getTimeInSeconds(long timeInMilliseconds) {
		return timeInMilliseconds / 1000;
	}

	public void displayResult() {
		if (done) {
			displayScore();
		} 
	}

	private void displayScore() {
		System.out.printf("\nNombre de questions trouvées %d/%d\n", score, NUMBER_OF_QUESTIONS);
		System.out.printf("Terminé en %s secondes.\n", getTimeInSeconds(timeElapse) );
		
		if (score == NUMBER_OF_QUESTIONS) {
			System.out.println("Félicitation sans fautes");
		} else if (score > (NUMBER_OF_QUESTIONS * 0.8)) {
			System.out.println("Bon score");
		} else if (score >= (NUMBER_OF_QUESTIONS * 0.5)) {
			System.out.println("Honorable");
		} else {
			System.out.println("Les révisions s'imposent");
		}
	}

	public ArrayList<Question4> generate(int nbrOfQuestions) {
		String[][] data = getData();
		
		// récupération des données
		if (nbrOfQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que " + data.length  + " questions disponibles.");
		}

		ArrayList<Question4> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays, reponseUtilisateur;

		// indexesAlreadyTaken.clear(); // inutile car à chaque fois qu'on exécute generate() on crée un nouveau tableau

		for (int i = 0; i < nbrOfQuestions; i++) {

			do {
				// choisir pays de manière aléatoire - nombre aléatoire de 0 à sizeArrayData-1
				randomIndex = (int) (Math.random() * sizeArrayData);
				// System.out.println(random);
			} while (indexesAlreadyTaken.contains(randomIndex));// vérification si question posée déjà effectuée

			pays = data[randomIndex][0];
			capitale = data[randomIndex][1];

			indexesAlreadyTaken.add(randomIndex);
			
			String questionText = String.format("Quelle est la capitale de %s ? ", pays);
						
			questions.add(new Question4(questionText, capitale));
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
