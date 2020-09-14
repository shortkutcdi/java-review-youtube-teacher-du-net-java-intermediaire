package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.utils.TimeConverter;
import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.generators.MathQuestionsGeneratorM;

public abstract class QuizM {
	
	private QuestionsGeneratorM generator;
	private int score;
	private long timeElapse;
	private boolean done = false;

	public QuizM(QuestionsGeneratorM generator) {
		this.generator = generator;
	}

	abstract public void displayMessage(String message);
	abstract public String retreiveAnswer(String prompt);
	
	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			askQuestions();

			done = true;
			// durée de la partie
			long endTime = System.currentTimeMillis() ;
			timeElapse = endTime- startTime;
		} catch (Exception e) {
			done = false;
			displayMessage(e.getMessage());
		}
		
		startClose();
	}

	private void askQuestions() throws Exception {
		for (QuestionM question : generator.generate()) {
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

	/**
	 * Méthode appelée pour fermer compléter la méthode start() ex: fermer un scanner 
	 */
	protected abstract void startClose();

	public void displayResult() {
		if (done) {
			displayScore();
		} 
	}

	private void displayScore() {
		displayMessage(String.format(
				"\nNombre de questions trouvées %d/%d\nTerminé en %d secondes.\n", 
				score, this.generator.getNbreQuestions(),  (int) TimeConverter.toSeconds(timeElapse)) );
		
		if (score == this.generator.getNbreQuestions()) {
			displayMessage("Félicitation sans fautes");
		} else if (score > (this.generator.getNbreQuestions() * 0.8)) {
			displayMessage("Bon score");
		} else if (score >= (this.generator.getNbreQuestions() * 0.5)) {
			displayMessage("Honorable");
		} else {
			displayMessage("Les révisions s'imposent");
		}
	}

}
