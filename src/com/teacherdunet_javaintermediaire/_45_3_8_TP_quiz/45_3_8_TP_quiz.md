# classe Question

````java
public class Question3 {

	private String text;
	private String reponse;

	public Question3(String text, String reponse) {
		this.text = text;
		this.reponse = reponse;
	}

	// getters/setters
	
	@Override
	public String toString() {
		return " [text= " + text + ", reponse= " + reponse + "]\n";
	}
}
````

## classes Quiz

ajout méthode **getData** pour récupérer les données

- methode **generate(int nbreQuestion)** qui va générer les questions qui seront stockées dans un ArrayList de Question

````java
	public ArrayList<Question3> generate(int nombreDeQuestion) {
		// récupération des données
		String[][] data = getData();

		ArrayList<Question3> questions = new ArrayList<>();
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		int sizeArrayData = data.length;
		int randomIndex;
		String capitale, pays;

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
````

- ajout de generate() dans start()

````java
	public void start() {
		// Rappel generate() est un ArrayList de Question3
		for (Question3 question : generate(5)) { 
			System.out.println(question.getText() + ", capitale : " + question.getReponse() );
		}
	}
````

## lancement du programme - résultat

````java
public class RunGame3 {

	public static void main(String[] args) {
		Quiz3 quiz = new Quiz3();
		quiz.start();
		quiz.displayResult();
	}
	
	/* Affichage de la console
		Quelle est la capitale de France ? , capitale : Paris
		Quelle est la capitale de Monaco ? , capitale : Monaco
		Quelle est la capitale de Perou ? , capitale : Lima
		Quelle est la capitale de Allemagne ? , capitale : Berlin
		Quelle est la capitale de Nigeria ? , capitale : Lagos
]	*/
	
}
````
