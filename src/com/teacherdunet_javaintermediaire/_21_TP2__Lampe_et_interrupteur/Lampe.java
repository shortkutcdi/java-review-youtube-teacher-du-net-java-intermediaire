package com.teacherdunet_javaintermediaire._21_TP2__Lampe_et_interrupteur;

public class Lampe {

	private boolean etat;

	public Lampe(boolean estAllume) {
		this.etat = estAllume;
	}
	
	public boolean estAllume() {
		return etat;
	}
	
	public void modifierEtat() {
		this.etat = !this.etat; // affiche le contraire
	}
	
	
}
