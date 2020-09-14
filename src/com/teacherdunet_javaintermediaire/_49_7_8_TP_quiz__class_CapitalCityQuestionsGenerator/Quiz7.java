package com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator;

import com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator.utlis.TimeConverter;

public abstract class Quiz7 {
	
	private CapitalCityQuestionsGenerator generator;
	private int score;
	private long timeElapse;
	private boolean done = false;

	public Quiz7(CapitalCityQuestionsGenerator generator) {
		this.generator = generator;
	}

	abstract public void displayMessage(String message);
	abstract public String retreiveAnswer(String prompt);
	
	public void start() {
		done = false;
		try {
			score = 0;
			long startTime = System.currentTimeMillis();
			
			for (Question7 question : generator.generate(generator.getNbreQuestions())) {
				String answerCapitale = retreiveAnswer(question.getText());
							
				// on compare les réponses
				if (answerCapitale.equalsIgnoreCase(question.getReponse())) {
					displayMessage("Bonne réponse");
					score++;
				} else {
					displayMessage(String.format(
							"Non, la capitale est %s\n\n", question.getReponse()) );
				}
				done = true;
			}
			// durée de la partie
			long endTime = System.currentTimeMillis() ;
			timeElapse = endTime- startTime;
		} catch (IllegalArgumentException e) {
			done = false;
			displayMessage(e.getMessage());
		}
		
		startClose();
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
