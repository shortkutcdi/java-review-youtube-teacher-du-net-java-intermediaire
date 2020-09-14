package com.teacherdunet_javaintermediaire._52_iterator_;

import java.util.HashMap;
import java.util.Iterator;

public class TestIterator_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("toto", "kiki");
		
		
		map.put("toto", "momo");
		map.put("tata", "momo");
		map.put("tete", "meme");
		map.put("titi", "mimi");
		
		// récupérer les valeurs seules
		// si deux mêmes clés enregistrées seulement la dernière ajoutée
		Iterator<String> values = map.values().iterator();
		
		System.out.println("-------------------------valeurs  ");
		while (values.hasNext()) {
			System.out.println((String) values.next());;
		}
		System.out.println("--------------------------clés    ");
		
		// récupérer les clés seules
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			System.out.println((String) keys.next());
		}
		
		System.out.println("--------------------------clés    ");
		
		// ou un foreach classique
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}
}
