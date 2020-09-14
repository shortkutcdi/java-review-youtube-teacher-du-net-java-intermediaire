package com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator;

import javax.swing.JOptionPane;

public class GUIQuiz7 extends Quiz7 {

	public GUIQuiz7(CapitalCityQuestionsGenerator capitalCityQuestionsGenerator) {
		super(capitalCityQuestionsGenerator);
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
