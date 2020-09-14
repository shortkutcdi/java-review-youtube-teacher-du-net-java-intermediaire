package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.Question8;
import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.QuestionsGenerator;
import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.QuestionM;
import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.QuestionsGeneratorM;

public class CapitalCityQuestionsGeneratorM extends QuestionsGeneratorM {

	public CapitalCityQuestionsGeneratorM(int nbreQuestions) {
		super(nbreQuestions);
	}

	public ArrayList<QuestionM> generate() {
		HashMap<String, String> data = getData();
		int sizeMapData = data.size();

		ArrayList<String> tabPays = new ArrayList<String>(data.keySet());

		// récupération des données
		if (nbreQuestions > data.size()) {
			throw new IllegalArgumentException("Il n'y a que " + sizeMapData + " questions disponibles.");
		}

		ArrayList<QuestionM> questions = new ArrayList<>();
		
		// tableau enregistrant l'index pays sélectionnés -- plus nécessaire
		// List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int randomIndex;
		String capitale, pays;

		for (int i = 0; i < nbreQuestions; i++) {

			randomIndex = (int) (Math.random() * sizeMapData);

			pays = tabPays.get(randomIndex);
			capitale = data.get(pays);
			
			// suppression du pays utilisé
			tabPays.remove(randomIndex);

			String questionText = String.format("Quelle est la capitale de %s ? ", pays);
			questions.add(new QuestionM(questionText, capitale));
		}
		return questions;
	}

	private static HashMap<String, String> getData() {
		HashMap<String, String> map = new HashMap<>();
		map.put("Senegal", "Dakar");
		map.put("France", "Paris");
		map.put("Nigeria", "Lagos");
		map.put("Gabon", "Libreville");
		map.put("Allemagne", "Berlin");
		map.put("Italie", "Rome");
		map.put("Monaco", "Monaco");
		map.put("Liberia", "Monrovia");
		map.put("Perou", "Lima");
		return map;
	}

}
