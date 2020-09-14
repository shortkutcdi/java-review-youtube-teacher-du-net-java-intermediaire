package com.teacherdunet_javaintermediaire._21_TP2__Lampe_et_interrupteur;

public class Interrupteur {
	
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe) {
		this.lampe = lampe;
		this.position = this.lampe.estAllume();
	}
	
	public String getPosition() {
		return this.position? "On" : "Off";
	}
	
	public void changerPosition() {
		this.lampe.modifierEtat();
		this.position = lampe.estAllume();
	}

	
}
