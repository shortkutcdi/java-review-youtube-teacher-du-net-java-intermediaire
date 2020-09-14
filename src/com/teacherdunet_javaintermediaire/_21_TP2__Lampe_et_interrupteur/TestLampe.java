package com.teacherdunet_javaintermediaire._21_TP2__Lampe_et_interrupteur;

public class TestLampe {

	public static void main(String[] args) {
		Lampe lampe = new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllume()); // false
		System.out.println(interrupteur.getPosition()); // off
		
		interrupteur.changerPosition();

		System.out.println(lampe.estAllume()); // true
		System.out.println(interrupteur.getPosition()); // On

	}

}
