package com.teacherdunet_javaintermediaire._48_6_8_TP_quiz__class_abstraite_Quiz;

import java.util.Scanner;

public class ConsoleQuiz6 extends Quiz6 {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz6(int nbreQuestions) {
		super(nbreQuestions);
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
