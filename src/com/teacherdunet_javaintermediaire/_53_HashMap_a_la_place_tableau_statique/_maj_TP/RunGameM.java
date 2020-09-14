package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP;

import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.generators.CapitalCityQuestionsGeneratorM;

public class RunGameM {

	public static void main(String[] args) {
//		QuizM quiz = new GUIQuizM(new CapitalCityQuestionsGeneratorM(2));
		QuizM quiz = new GUIQuizM(new CapitalCityQuestionsGeneratorM(2));
		quiz.start();
		quiz.displayResult();
		
//		QuizM quizMath = new GUIQuizM(new MathQuestionsGeneratorM(3));
//		quizMath.start();
//		quizMath.displayResult();
	}
}
