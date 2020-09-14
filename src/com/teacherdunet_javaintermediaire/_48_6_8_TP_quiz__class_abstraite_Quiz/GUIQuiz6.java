package com.teacherdunet_javaintermediaire._48_6_8_TP_quiz__class_abstraite_Quiz;

import javax.swing.JOptionPane;

public class GUIQuiz6 extends Quiz6 {

	public GUIQuiz6(int nbreQuestions) {
		super(nbreQuestions);
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
