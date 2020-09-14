# Hashmap à la place d'un tabeau

CapitalCityQuestionsGeneratorM 

avant 

````java

	private static String[][] getData() {
		String[][] data = { 
		{ "Senegal", "Dakar" }, { "France", "Paris" }, 
		{ "Nigeria", "Lagos" }, { "Gabon", "Libreville" }, 
		{ "Allemagne", "Berlin" }, { "Italie", "Rome" }, 
		{ "Monaco", "Monaco" }, { "Liberia", "Monrovia" }, { "Perou", "Lima" } };
		return data;
	}
````

après

````java
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
````

## alimenter un arraylist à l'instantiation

data est un HashMap contenant des valeurs, pour récupérer l'arraylist des clés 
il suffit de récupérer les clés ds les arguments du tableau data.keySet()

	HashMap<String, String> data = getData();
	ArrayList<String> tabPays = new ArrayList<String>(data.keySet());


## màj generate - ajouter set à un arraylist

	HashMap<String, String> data = getData();
	ArrayList<String> tabPays = new ArrayList<String>(data.keySet());

màj generate()

````java
	public ArrayList<QuestionM> generate() {
		HashMap<String, String> data = getData();
		int sizeMapData = data.size();
				
		List<String> countries = new ArrayList<String>(data.keySet()); //<<<<<<<<<<<<< tableau des pays
		//code...
		
		int randomIndex;
		String capitale, pays;
		
		for (int i = 0; i < nbreQuestions; i++) {
			//...
			randomIndex = (int) (Math.random() * sizeMapData);
			
			pays = countries.get(randomIndex); 	//<<<<<<<<<<<<<<<<<<<<<
			capitale = data.get(pays); 		//<<<<<<<<<<<<<<<<<<<<<
						
			// suppression du pays utilisé
			tabPays.remove(randomIndex);
			//...
		}
		return questions;
	}
````
