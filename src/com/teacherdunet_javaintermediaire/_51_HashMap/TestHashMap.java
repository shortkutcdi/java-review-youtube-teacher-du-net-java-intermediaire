package com.teacherdunet_javaintermediaire._51_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		ArrayList<String> tab = new ArrayList<>();
		tab.add("Bob");
		tab.add("John");
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("France", "Paris");
		map.put("Italie", "Rome");
		map.put("Pérou", "Lima");
		map.put("Sénégal", "Dakar");
		System.out.println(map);
		
		System.out.println("map.get(\"Sénégal\") Récupérer la valeur dont la clé est \"Sénégal\" : "+ map.get("Sénégal")); // Dakar
		
		map.remove("Pérou");
		System.out.println(map); // {Italie=Rome, Sénégal=Dakar, France=Paris}
		
		
		System.out.println("map.isEmpty() : " + map.isEmpty()); // true

		System.out.println("map.containsKey(\"France\") : " + map.containsKey("France"));
		System.out.println("map.containsValue(\"Rome\") : " + map.containsValue("Rome"));

		System.out.println("map.size() : " + map.size());
		System.out.println("map.clear() - effacer tout le contenu");
		map.clear();
		System.out.println("map.size() : " + map.size());
	}

}
