package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.genrators;

import java.util.ArrayList;
import java.util.List;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.Question8;
import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.QuestionsGenerator;

public class CapitalCityQuestionsGenerato8 extends QuestionsGenerator {
	
	public CapitalCityQuestionsGenerato8(int nbreQuestions) {
		super(nbreQuestions);
	}

	public ArrayList<Question8> generate() {
		String[][] data = getData();
		
		// récupération des données
		if (nbreQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que " + data.length  + " questions disponibles.");
		}

		ArrayList<Question8> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays;

		for (int i = 0; i < nbreQuestions; i++) {

			do {
				// choisir pays de manière aléatoire - nombre aléatoire de 0 à sizeArrayData-1
				randomIndex = (int) (Math.random() * sizeArrayData);
				// System.out.println(random);
			} while (indexesAlreadyTaken.contains(randomIndex));// vérification si question posée déjà effectuée

			pays = data[randomIndex][0];
			capitale = data[randomIndex][1];

			indexesAlreadyTaken.add(randomIndex);
			
			String questionText = String.format("Quelle est la capitale de %s ? ", pays);
			questions.add(new Question8(questionText, capitale));
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
