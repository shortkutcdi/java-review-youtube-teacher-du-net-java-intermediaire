package com.teacherdunet_javaintermediaire._49_7_8_TP_quiz__class_CapitalCityQuestionsGenerator;

public class RunGame7 {

	public static void main(String[] args) {
		// ConsoleQuiz7 quiz = new ConsoleQuiz7(new CapitalCityQuestionsGenerator(2));
		Quiz7 quiz = new GUIQuiz7(new CapitalCityQuestionsGenerator(2));
		quiz.start();
		quiz.displayResult();
	}
}
