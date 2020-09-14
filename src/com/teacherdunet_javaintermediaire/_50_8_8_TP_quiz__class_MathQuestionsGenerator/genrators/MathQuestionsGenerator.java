package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.genrators;

import java.util.ArrayList;

import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.Question8;
import com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator.QuestionsGenerator;

public class MathQuestionsGenerator extends QuestionsGenerator {

	public MathQuestionsGenerator(int nbreQuestions) {
		super(nbreQuestions);
	}

	@Override
	public ArrayList<Question8> generate() {
		ArrayList<Question8> questions = new ArrayList<>();
		
		char[] operators = {'+', '-', '*', '/'}; 
		
		for (int i = 0; i < nbreQuestions; i++) {
			// opérateurs aléatoires
			int nbre1 = (int) (Math.random() * 15);
			int nbre2 = (int) (Math.random() * 15 + 1);
			char operator = operators[(int) ((Math.random() * operators.length))];
			String questionText = String.format("%d %c %d = ? ", nbre1, operator, nbre2);
			
			questions.add(new Question8(questionText, calculate(operator,nbre1, nbre2)));
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
