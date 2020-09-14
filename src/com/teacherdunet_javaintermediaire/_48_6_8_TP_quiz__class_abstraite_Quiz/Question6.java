package com.teacherdunet_javaintermediaire._48_6_8_TP_quiz__class_abstraite_Quiz;

public class Question6 {

	private String text;
	private String reponse;

	public Question6(String text, String reponse) {
		this.text = text;
		this.reponse = reponse;
	}
	
	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}


	@Override
	public String toString() {
		return " [text= " + text + ", reponse= " + reponse + "]\n";
	}
}
