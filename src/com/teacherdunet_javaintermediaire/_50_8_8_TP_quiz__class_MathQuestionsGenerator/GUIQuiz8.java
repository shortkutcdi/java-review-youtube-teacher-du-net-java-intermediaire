package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator;

import javax.swing.JOptionPane;

public class GUIQuiz8 extends Quiz8 {

	public GUIQuiz8(QuestionsGenerator generator) {
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
