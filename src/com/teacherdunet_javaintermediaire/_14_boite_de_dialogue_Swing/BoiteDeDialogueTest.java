package com.teacherdunet_javaintermediaire._14_boite_de_dialogue_Swing;

import javax.swing.JOptionPane;

public class BoiteDeDialogueTest {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Quel est ton nom ?");
		
		String message = String.format("Salut %s. Java est cool, n'est-ce pas ?", nom);
		JOptionPane.showMessageDialog(null, message);
	}

}
