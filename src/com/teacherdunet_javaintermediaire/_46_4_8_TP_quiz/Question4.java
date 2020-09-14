package com.teacherdunet_javaintermediaire._46_4_8_TP_quiz;

public class Question4 {

	private String text;
	private String reponse;

	public Question4(String text, String reponse) {
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
