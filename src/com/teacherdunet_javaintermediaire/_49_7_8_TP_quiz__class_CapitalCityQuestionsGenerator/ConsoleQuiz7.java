package com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator;

import java.util.Scanner;

public class ConsoleQuiz7 extends Quiz7 {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz7(CapitalCityQuestionsGenerator generator) {
		super(generator);
	}
	
	@Override
	public void displayMessage(String message) {
		System.out.println(message);
	}

	@Override
	public String retreiveAnswer(String prompt) {
		displayMessage(prompt);
		return clavier.nextLine();
	}

	@Override
	protected void startClose() {
		clavier.close();
	}
}
