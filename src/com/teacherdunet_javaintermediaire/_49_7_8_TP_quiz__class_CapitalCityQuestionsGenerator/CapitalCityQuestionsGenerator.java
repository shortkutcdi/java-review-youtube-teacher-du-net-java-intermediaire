package com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator;

import java.util.ArrayList;
import java.util.List;

public class CapitalCityQuestionsGenerator {
	
	private int nbreQuestions;

	public CapitalCityQuestionsGenerator(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}

	public ArrayList<Question7> generate(int nbrOfQuestions) {
		String[][] data = getData();
		
		// récupération des données
		if (nbrOfQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que " + data.length  + " questions disponibles.");
		}

		ArrayList<Question7> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays;

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
			questions.add(new Question7(questionText, capitale));
		}
		return questions;
	}

	private static String[][] getData() {
		String[][] data = { { "Senegal", "Dakar" }, { "France", "Paris" }, { "Nigeria", "Lagos" },
				{ "Gabon", "Libreville" }, { "Allemagne", "Berlin" }, { "Italie", "Rome" }, { "Monaco", "Monaco" },
				{ "Liberia", "Monrovia" }, { "Perou", "Lima" } };
		return data;
	}

	public int getNbreQuestions() {
		return nbreQuestions;
	}

	public void setNbreQuestions(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}	

	
	
}
