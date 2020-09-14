package com.teacherdunet_javaintermediaire._15_TP1_les_boites_de_dialogues_swing;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class SommeDeuxNombresIntTest2 {
	public static void main(String[] args) {

		int nbr1, nbr2, somme;
		boolean okNumber = false;
		do {
			try {
				nbr1 = Integer.valueOf(JOptionPane.showInputDialog("Entrer le premier nombre").trim());
				nbr2 = Integer.valueOf(JOptionPane.showInputDialog("Entrer le deuxième nombre").trim());
				somme = nbr1 + nbr2;
				// on a passé les lignes 14 à 16 --> pas d'exception ==> okNumber = true
				okNumber = true;
				String resultat = String.format("La somme de %d + %d = %d", nbr1, nbr2, somme);
				JOptionPane.showMessageDialog(null, resultat);
			} catch (NumberFormatException e) {
				okNumber = false;
				JOptionPane.showMessageDialog(null, "Vous devez renseigner un nombre");
			}
		} while (!okNumber);
	}
}
