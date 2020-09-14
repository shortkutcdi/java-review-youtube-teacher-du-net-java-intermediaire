package com.teacherdunet_javaintermediaire._51_HashMap._maj_TP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapitalCityQuestionsGenerator9_HashMap extends QuestionsGenerator {
	
	public CapitalCityQuestionsGenerator9_HashMap(int nbreQuestions) {
		super(nbreQuestions);
	}

	public ArrayList<Question8> generate() {
		Map<String, String> data = getData();
		int sizeMapData = data.size();
		
		// récupération des données
		if (nbreQuestions > data.size()) {
			throw new IllegalArgumentException("Il n'y a que " + sizeMapData  + " questions disponibles.");
		}

		ArrayList<Question8> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int randomIndex;
		String capitale, pays;

		
		for (int i = 0; i < nbreQuestions; i++) {

			do {
				// choisir pays de manière aléatoire - nombre aléatoire de 0 à sizeArrayData-1
				randomIndex = (int) (Math.random() * sizeMapData);
				// System.out.println(random);
			} while (indexesAlreadyTaken.contains(randomIndex));// vérification si question posée déjà effectuée
			
			
			
//			pays = data[randomIndex][0];
//			capitale = data[randomIndex][1];

			indexesAlreadyTaken.add(randomIndex);
			
//			String questionText = String.format("Quelle est la capitale de %s ? ", pays);
//			questions.add(new Question8(questionText, capitale));
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
