package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.generators;

import java.util.ArrayList;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.Question8;
import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.QuestionsGenerator;
import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.QuestionM;
import com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP.QuestionsGeneratorM;

public class MathQuestionsGeneratorM extends QuestionsGeneratorM {

	public MathQuestionsGeneratorM(int nbreQuestions) {
		super(nbreQuestions);
	}

	@Override
	public ArrayList<QuestionM> generate() {
		ArrayList<QuestionM> questions = new ArrayList<>();
		
		char[] operators = {'+', '-', '*', '/'}; 
		
		for (int i = 0; i < nbreQuestions; i++) {
			// opérateurs aléatoires
			int nbre1 = (int) (Math.random() * 15);
			int nbre2 = (int) (Math.random() * 15 + 1);
			char operator = operators[(int) ((Math.random() * operators.length))];
			String questionText = String.format("%d %c %d = ? ", nbre1, operator, nbre2);
			
			questions.add(new QuestionM(questionText, calculate(operator,nbre1, nbre2)));
		}
		return questions;
	}

	private String calculate(char operator, int nbre1, int nbre2) {
		String response = null;
		switch (operator) {
		case '+':
			response =  String.valueOf(nbre1 + nbre2);
			break;
		case '-':
			response =  String.valueOf(nbre1 - nbre2);
			break;
		case '*':
			response =  String.valueOf(nbre1 * nbre2);
			break;
		case '/':
			response =  String.valueOf(nbre1 / nbre2);
			break;
		}
		return response;
	}

}
