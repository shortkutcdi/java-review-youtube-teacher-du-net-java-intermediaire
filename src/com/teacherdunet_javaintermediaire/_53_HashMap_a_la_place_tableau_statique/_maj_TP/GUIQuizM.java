package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP;

import javax.swing.JOptionPane;

import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.generators.MathQuestionsGeneratorM;

public class GUIQuizM extends QuizM {

	public GUIQuizM(QuestionsGeneratorM generator) {
		super(generator);
	}

	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public String retreiveAnswer(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}

	@Override
	protected void startClose() {
	}


}
