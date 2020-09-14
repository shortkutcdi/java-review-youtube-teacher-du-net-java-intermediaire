package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP;

import java.util.Scanner;

public class ConsoleQuizM extends QuizM {
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuizM(QuestionsGeneratorM generator) {
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
