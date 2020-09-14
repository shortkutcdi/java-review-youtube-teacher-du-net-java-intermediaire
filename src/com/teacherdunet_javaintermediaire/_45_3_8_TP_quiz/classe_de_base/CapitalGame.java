package com.teacherdunet_javaintermediaire._45_3_8_TP_quiz.classe_de_base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapitalGame {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5;
		Scanner clavier = new Scanner(System.in);
		
		String[][] data = getData();
		
		int sizeArrayData = data.length;
		int score = 0,randomIndex;
		char rejouer = 'n';
		String capitale, pays, reponseUtilisateur;
		long time = 0;
		// tableau enregistrant l'index pays sélectionnés pour ne pas les répéter
		List<Integer> indexesAlreadyTaken = new ArrayList<>();
		
		do {
			indexesAlreadyTaken.clear();
			
			for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
				time = System.currentTimeMillis();
				
				randomIndex = choisirPays(sizeArrayData, indexesAlreadyTaken);

				pays = data[randomIndex][0];
				capitale = data[randomIndex][1];

				indexesAlreadyTaken.add(randomIndex);

				// demander à l'utilisateur d'entrer la capitale du pays random
				System.out.printf("Quelle est le captitale de %s ?", pays);
				reponseUtilisateur = clavier.nextLine().toLowerCase().trim();

				// on compare les réponses
				if ((capitale.toLowerCase()).equals(reponseUtilisateur)) {
					System.out.println("Bonne réponse");
					score++;
				} else {
					System.out.printf("Non, la capitale de %s est %s\n\n", pays, capitale);
				}
			}
			
			time = (System.currentTimeMillis() - time)/1000;
			System.out.println("temps : " + time + " secondes" );
			
			afficherResultat(score, NUMBER_OF_QUESTIONS);
			
			
			do {
				System.out.println("Voulez-vous rejouer ? oui(o)/ non (n)");
				rejouer = clavier.next().toLowerCase().charAt(0);
				clavier.nextLine();
			} while (rejouer != 'o' && rejouer != 'n');
			
		} while (rejouer=='o' );
		
		System.out.println("Bye bye");
		System.out.println("Appuyer sur la touche <Entrée> pour quitter !");
		clavier.nextLine();
		clavier.close();
	}

	private static String[][] getData() {
		String[][] data = { { "Senegal", "Dakar" }, { "France", "Paris" }, 
				{ "Nigeria", "Lagos" }, { "Gabon", "Libreville" }, 
				{ "Allemagne", "Berlin" }, { "Italie", "Rome" },  
				{"Monaco", "Monaco" }, { "Liberia", "Monrovia" }, 
				{ "Perou", "Lima" } };
		return data;
	}

	private static void afficherResultat(int nbrBonneReponses, int NUMBER_OF_QUESTIONS) {
		System.out.printf("Terminé.\n Nombre de question trouvées %d/%d\n", nbrBonneReponses, NUMBER_OF_QUESTIONS);

		if (nbrBonneReponses == NUMBER_OF_QUESTIONS) {
			System.out.println("Félicitation sans fautes");
		} else if (nbrBonneReponses > (NUMBER_OF_QUESTIONS * 0.8)) {
			System.out.println("Bon score");
		} else if (nbrBonneReponses >= (NUMBER_OF_QUESTIONS * 0.5)) {
			System.out.println("Honorable");
		} else {
			System.out.println("Les révisions s'imposent");
		}
	}

	private static int choisirPays(int sizeArrayData, List<Integer> indexAlreadyTaken) {
		int randomIndex;
		do {
			// choisir pays de manière aléatoire - nombre aléatoire de 0 à sizeArrayData-1
			randomIndex = (int) (Math.random() * sizeArrayData);
			// System.out.println(random);
		} while (indexAlreadyTaken.contains(randomIndex));// vérification si question posée déjà effectuée
		return randomIndex;
	}
}
