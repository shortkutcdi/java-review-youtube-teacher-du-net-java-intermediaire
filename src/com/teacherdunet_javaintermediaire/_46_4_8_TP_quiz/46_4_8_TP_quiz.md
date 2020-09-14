# Quiz start() -- utilisation des variables score et timeElapse

1- ajout des variables et constantes

````java
	public static int NUMBER_OF_QUESTIONS = 5; //<<<<<<<<<<<<<<<
	private int score;
	private long timeElapse;
	private boolean done = false;
	Scanner clavier = new Scanner(System.in);  //<<<<<<<<<<<<<<<
````

màj méthode start()

````java
	public void start() {
		score = 0;
		long currentTime = System.currentTimeMillis();
		
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
			
		}
		// durée de la partie
		long endTime = System.currentTimeMillis() ;
		timeElapse = endTime- currentTime;
		
		clavier.close();
	}
````


méthode displayResult()

````java
	private long getTimeInSeconds(long timeInMilliseconds) {
		return timeInMilliseconds / 1000;
	}

	public void displayResult() {
		
		System.out.printf("Nombre de question trouvées %d/%d\n", score, NUMBER_OF_QUESTIONS);
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
````

## màj generate() - gestion exception dépassement nombre de question

avec une variable boolean done à gfalse si exception

````java
	public ArrayList<Question4> generate(int nbrOfQuestions) {
		String[][] data = getData();
		
		// récupération des données
		if (nbrOfQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que " + data.length  + " questions disponibles.");
		}

		//suite du code...
		
		return questions;
	}
````

màj méthode start ajout try catch

````java
	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			for (Question4 question : generate(NUMBER_OF_QUESTIONS)) {
				//code...
			}
			
			done =true
			//code...
		} catch (IllegalArgumentException e) {
			done =false;
			e.printStackTrace();
		}
		
		clavier.close();
	}
````

refactor displayResult

````java
	public void displayResult() {
		if (done) {
			displayScore();
		} 
	}

	private void displayScore() {
		System.out.printf("Nombre de question trouvées %d/%d\n", score, NUMBER_OF_QUESTIONS);
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
````



