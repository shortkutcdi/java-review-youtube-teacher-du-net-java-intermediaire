package com.teacherdunet_javaintermediaire._30_TP3_une_classe_Calculatrice;

public class Calculatrice {

	private double resultat; // par défaut à 0.0

	public void additionner(double... nombres) {
		effectuer('+', nombres);
	}

	public void soustaire(double... nombres) {
		effectuer('-', nombres);
	}
	
	private void effectuer(char operateur, double... nombres) {
		for (double nombre : nombres) {
			calculer(operateur, nombre);
		}
	}

	private void calculer(char operateur, double nombre) {
		switch (operateur) {
		case '+':
			resultat += nombre;
			break;
		case '-':
			resultat -= nombre;
			break;
		}
	}

	public double getResultat() {
		return resultat;
	}

}
