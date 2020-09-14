package com.teacherdunet_javaintermediaire._48_6_8_TP_quiz__class_abstraite_Quiz;

import java.util.ArrayList;
import java.util.List;

public abstract class Quiz6 {
	
	private int score;
	private long timeElapse;
	private boolean done = false;
	private int nbreQuestions;

	public Quiz6(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}

	abstract public void displayMessage(String message);
	abstract public String retreiveAnswer(String prompt);
	
	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			for (Question6 question : generate(nbreQuestions)) {
				String answerCapitale = retreiveAnswer(question.getText());
							
				// on compare les réponses
				if (answerCapitale.equalsIgnoreCase(question.getReponse())) {
					displayMessage("Bonne réponse");
					score++;
				} else {
					displayMessage(String.format(
							"Non, la capitale est %s\n\n", question.getReponse()) );
				}
				done = true;
			}
			// durée de la partie
			long endTime = System.currentTimeMillis() ;
			timeElapse = endTime- startTime;
		} catch (IllegalArgumentException e) {
			done = false;
			displayMessage(e.getMessage());
		}
		
		startClose();
	}

	/**
	 * Méthode appelée pour fermer compléter la méthode start() ex: fermer un scanner 
	 */
	protected abstract void startClose();

	private long getTimeInSeconds(long timeInMilliseconds) {
		return timeInMilliseconds / 1000;
	}

	public void displayResult() {
		if (done) {
			displayScore();
		} 
	}

	private void displayScore() {
		displayMessage(String.format(
				"\nNombre de questions trouvées %d/%d\nTerminé en %d secondes.\n", 
				score, nbreQuestions,  (int) getTimeInSeconds(timeElapse)) );
		
		if (score == nbreQuestions) {
			displayMessage("Félicitation sans fautes");
		} else if (score > (nbreQuestions * 0.8)) {
			displayMessage("Bon score");
		} else if (score >= (nbreQuestions * 0.5)) {
			displayMessage("Honorable");
		} else {
			displayMessage("Les révisions s'imposent");
		}
	}

	public ArrayList<Question6> generate(int nbrOfQuestions) {
		String[][] data = getData();
		
		// récupération des données
		if (nbrOfQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que " + data.length  + " questions disponibles.");
		}

		ArrayList<Question6> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays;

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
			questions.add(new Question6(questionText, capitale));
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
