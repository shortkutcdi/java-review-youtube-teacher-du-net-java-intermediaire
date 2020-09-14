# class Quiz trop de fonctionnalités

- génère les questions
- retourne le tableau de capitales
- conversion -- extraire getTimeInMillseconds() dans une nouvelle classe TimeConverter
- affichage -- extraire displayResults() dans une nouvelle classe (Prompter, Diplayer...) 

- si je veut générer des question de mathématique, devoir générer du code à l'intérieur

==> pouvoir générer un quiz basé sur une classe 

		ConsoleQuiz6 quiz = new ConsoleQuiz6(1); // 1 = nbre de questions
		GUIQuiz6 quiz = new GUIQuiz6(2);
		
à la place		

		ConsoleQuiz6 quiz = new ConsoleQuiz6(new CapitaleCityQuestionsGenerator(1); // 1 = nbre de questions
		GUIQuiz6 quiz = new GUIQuiz6(new  MathQuestionsGenerator(2));
		
## nouvelle classe TimeConverter dans package utils avec méthode statique	

````java
public class TimeConverter {
	
	public static int toSeconds(long timeInMilliseconds) {
		return (int) (timeInMilliseconds / 1000);
	}
}
````

màj Quiz -- suppression getTimeInSeconds() remplacé par TimeConverter.toSeconds()

````java
	private void displayScore() {
		displayMessage(String.format(
				"\nNombre de questions trouvées %d/%d\nTerminé en %d secondes.\n", 
				score, this.generator.getNbreQuestions(),  
				(int) TimeConverter.toSeconds(timeElapse)) );  //<<<<<<<<<<<<<<<<<

````
		
## nouvelle classe CapitaleCityQuestionsGenerator

on va déplacer les méthodes de Quiz : generate() et getData() dans la nouvelle classe CapitaleCityQuestionGenerator

````java
public class CapitalCityQuestionsGenerator {
	
	private int nbreQuestions;

	public CapitalCityQuestionsGenerator(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	public ArrayList<Question7> generate(int nbrOfQuestions) { //code... }
	private static String[][] getData() { //code... }
	
	//getters/setters
````

## màj classe Quiz

ajout attribut 

	private CapitalCityQuestionsGenerator generator;
	
màj constructeur

suppression attribut 

	private int nbreQuestions;
	
remplacé par

	generator.getNbreQuestions()
	
récupération méthode generate() via generator

	generator.generate(generator.getNbreQuestions())	
	

````java
public abstract class Quiz7 {
	
	private CapitalCityQuestionsGenerator generator;
	private int score;
	private long timeElapse;
	private boolean done = false;

	public Quiz7(CapitalCityQuestionsGenerator generator) {
		this.generator = generator;
	}
	//...
	
````

## màj constructeurs GUIQuiz et ConsoleQuiz

````java
public class ConsoleQuiz7 extends Quiz7 {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz7(CapitalCityQuestionsGenerator generator) {
		super(generator);
	}
````

````java
public class GUIQuiz7 extends Quiz7 {

	public GUIQuiz7(CapitalCityQuestionsGenerator capitalCityQuestionsGenerator) {
		super(capitalCityQuestionsGenerator);
	}
````