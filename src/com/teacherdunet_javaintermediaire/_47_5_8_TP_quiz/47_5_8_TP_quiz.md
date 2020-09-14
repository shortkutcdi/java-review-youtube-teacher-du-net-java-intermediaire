# màj QUiz - ajout var nbreQuestions

- ajout attribut nbreQuestions
- ajout constructeur avec nbreQuestions
- suppression constante NUMBER_OF_QUESTIONS remplacée par la variable nbreQuestions

````java
public class Quiz5 {

	private int score;
	private long timeElapse;
	private boolean done = false;
	private int nbreQuestions;

	public Quiz5(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	//code...
````

màj classe de lancement

````java
public class RunGame5 {

	public static void main(String[] args) {
		Quiz5 quiz = new Quiz5(3);
		quiz.start();
		quiz.displayResult();
	}
}
````
