# classe abstraite générique QuestionGenerator

- remplace dans Quiz CapitalCityQuestionsGenerator dont celle-ci héritera


être capable de générer d'autres type de questions

- on a déjà CapitalCityQuestionsGenerator pour générer des question de capitales

- on peut utiliser une classe MathQuestionsGenerator pour gérer des questions de mathématiques

- ...

	abstract QuestionGenerator (parent)
				+ CapitalCityQuestionsGenerator
				+ MathQuestionsGenerator
				+ ...
				
déplacer code de CapitalCityQuestionsGenerator dans QuestionGenerator

- attribut nbreQuestions
- constructeur QuestionGenerator(int nbreQuestions)
- methode abstraite generate() - on enlève le param nbreQuestions
- getters/setters

````java
public abstract class QuestionGenerator {
	protected int nbreQuestions;  //<<<<<<<<<<<<<<<

	public QuestionGenerator(int nbreQuestions) {	//<<<<<<<<<<<<<<<<
		this.nbreQuestions = nbreQuestions;
	}
	
	public abstract ArrayList<Question8> generate(int nbrOfQuestions);	//<<<<<<<<<<<<<<<<
	
	//getters/setters
	public int getNbreQuestions() {
		return nbreQuestions;
	}

	public void setNbreQuestions(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}	
}
````

comme la méthode generate() peut lever une exception on rajoute un throws Exception

	public abstract ArrayList<Question8> generate() throws Exception;
	
	
## màj QUiz - attribut questionGenerateur, màj constructeur

````java
public abstract class Quiz8 {
	
	private QuestionsGenerator generator; //<<<<<<<<<<<<<<
	private int score;
	private long timeElapse;
	private boolean done = false;

	public Quiz8(QuestionsGenerator generator) { //<<<<<<<<<<<<<<
		this.generator = generator; 			 //<<<<<<<<<<<<<<
	}
	//code...
````

## màj GUIQuiz et ConsoleQuiz -- QuestionGenerator

GUIQuiz

````java
public class GUIQuiz8 extends Quiz8 {

	public GUIQuiz8(QuestionGenerator generator) { //<<<<<<<<<<<<
		super(capitalCityQuestionsGenerator);
	}
	
	// code...
````

````java
public class ConsoleQuiz8 extends Quiz8 {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz8(QuestionGenerator generator) { //<<<<<<<<<<<<
		super(generator);
	}
	
	// code...
````

## màj CapitalCityQuestionsGenerator hérite de QuestionsGenerator

````java
public class CapitalCityQuestionsGenerato8 extends QuestionsGenerator {
	
	public CapitalCityQuestionsGenerato8(int nbreQuestions) {
		super(nbreQuestions);
	}
	//...
````

## package generators - CapitalCityQuestionsGenerator et MathQuestionsGenerator

Ajout de la classe CapitalCityQuestionsGenerator ainsi qu'une nouvelle MathQuestionsGenerator

````java
public class MathQuestionsGenerator extends QuestionsGenerator {

	public MathQuestionsGenerator(int nbreQuestions) {
		super(nbreQuestions);
	}

	@Override
	public ArrayList<Question8> generate() {
		ArrayList<Question8> questions = new ArrayList<>();
		
		char[] operators = {'+', '-', '*', '/'}; 
		
		for (int i = 0; i < nbreQuestions; i++) {
			// opérateurs aléatoires
			int nbre1 = (int) (Math.random() * 15);
			int nbre2 = (int) (Math.random() * 15 + 1);
			char operator = operators[(int) ((Math.random() * operators.length))];
			String questionText = String.format("%d %c %d = ? ", nbre1, operator, nbre2);
			
			questions.add(new Question8(questionText, calculate(operator,nbre1, nbre2)));
		}
		return questions;
	}

	private String calculate(char operator, int nbre1, int nbre2) {
		String response = null;
		switch (operator) {
		case '+':
			response =  String.valueOf(nbre1 + nbre2);
			break;
		case '-':
			response =  String.valueOf(nbre1 - nbre2);
			break;
		case '*':
			response =  String.valueOf(nbre1 * nbre2);
			break;
		case '/':
			response =  String.valueOf(nbre1 / nbre2);
			break;
		}
		return response;
	}
}

````

## refactor Quiz ajout askQuestions()

````java
	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			askQuestions(); //<<<<<<<<<<<<<<<<<<<<

			done = true;
			// durée de la partie
			long endTime = System.currentTimeMillis() ;
			timeElapse = endTime- startTime;
		} catch (Exception e) {
			displayMessage(e.getMessage());
		}
		
		startClose();
	}

	private void askQuestions() throws Exception { 						//<<<<<<<<<<<<<<<<<
		for (Question8 question : generator.generate()) {
			String userAnswer = retreiveAnswer(question.getText());
						
			// on compare les réponses
			if (userAnswer.equalsIgnoreCase(question.getReponse())) {
				displayMessage("Bonne réponse");
				score++;
			} else {
				// System.out.println(question);
				displayMessage(String.format(
						"Non, la réponse est %s\n\n", question.getReponse()) );
			}
		}
	}
````


