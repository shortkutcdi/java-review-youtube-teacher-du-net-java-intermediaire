package com.teacherdunet_javaintermediaire._48_6_8_TP_quiz__class_abstraite_Quiz;

public class RunGame6 {

	public static void main(String[] args) {
		//ConsoleQuiz6 quiz = new ConsoleQuiz6(1);
		GUIQuiz6 quiz = new GUIQuiz6(2);
		quiz.start();
		quiz.displayResult();
	}
}
