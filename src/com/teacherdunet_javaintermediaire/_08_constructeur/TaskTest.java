package com.teacherdunet_javaintermediaire._08_constructeur;

public class TaskTest {

	public static void main(String[] args) {
		
		// créer plusieurs tâches
		Task tache1 = new Task("Fare un tutoriel", "Tutoriel vidéo, avec unr présentation au début");
		Task tache2 = new Task("Aller au cinéma", "Consulter les films d'actions à l'affiche et choisir un film");
		Task tache3 = new Task("Dire mamamiya à la fin", "Pour conclure en beauté avec un mamamiya");
		
		tache2.complete(); // mettre competed à true
		
		System.out.printf("%s, description : %s\n", tache2.titre, tache2.description);
		System.out.println("Tache 2 completed : " + tache2.completed );
		

	}

}
