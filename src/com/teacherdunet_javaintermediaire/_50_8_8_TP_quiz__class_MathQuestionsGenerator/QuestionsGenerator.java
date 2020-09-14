package com.teacherdunet_javaintermediaire._50_8_8_TP_quiz__class_MathQuestionsGenerator;

import java.util.ArrayList;

public abstract class QuestionsGenerator {
	protected int nbreQuestions;

	public QuestionsGenerator(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	public abstract ArrayList<Question8> generate() throws Exception;
	
	public int getNbreQuestions() {
		return nbreQuestions;
	}

	public void setNbreQuestions(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}	
}
