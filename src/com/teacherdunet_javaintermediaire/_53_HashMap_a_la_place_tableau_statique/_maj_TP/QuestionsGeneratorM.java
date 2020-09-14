package com.teacherdunet_javaintermediaire._53_HashMap_a_la_place_tableau_statique._maj_TP;

import java.util.ArrayList;

public abstract class QuestionsGeneratorM {
	protected int nbreQuestions;

	public QuestionsGeneratorM(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	public abstract ArrayList<QuestionM> generate() throws Exception;
	
	public int getNbreQuestions() {
		return nbreQuestions;
	}

	public void setNbreQuestions(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}	
}
