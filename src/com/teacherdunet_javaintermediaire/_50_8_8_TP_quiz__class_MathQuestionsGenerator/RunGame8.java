package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.genrators.MathQuestionsGenerator;

public class RunGame8 {

	public static void main(String[] args) {
//		Quiz8 quiz = new GUIQuiz8(new CapitalCityQuestionsGenerato8(2));
//		//Quiz8 quiz = new GUIQuiz8(new CapitalCityQuestionsGenerato8(2));
//		quiz.start();
//		quiz.displayResult();
		
		Quiz8 quizMath = new GUIQuiz8(new MathQuestionsGenerator(3));
		quizMath.start();
		quizMath.displayResult();
	}
}
