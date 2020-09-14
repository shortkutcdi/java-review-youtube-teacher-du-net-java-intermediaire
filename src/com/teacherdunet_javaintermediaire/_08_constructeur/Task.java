package com.teacherdunet_javaintermediaire._08_constructeur;

public class Task {
	// this représente l'objet courant
	public String titre;
	public String description;
	public boolean completed = false; // valeur par défaut
	
	public Task(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}


	public void complete() {
		this.completed = true;
	}
	
	
}
