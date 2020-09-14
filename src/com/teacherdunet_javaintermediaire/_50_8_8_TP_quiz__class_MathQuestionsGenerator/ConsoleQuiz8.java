package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator;

import java.util.Scanner;

public class ConsoleQuiz8 extends Quiz8 {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz8(QuestionsGenerator generator) {
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
