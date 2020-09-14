package com.teacherdunet_javaintermediaire._31_le_polymorphisme__plusieurs_formes;

import java.util.ArrayList;

public class TestEtreHumain {

	public static void main(String[] args) {
		
		EtreHumain eh = new Femelle();
		eh.uriner(); // S'abaisser
		
		// polymorphisme : aptitude d'un objet à prendre plusieurs formes
		// ici EtreHumain peut soit être un Male ou un Femelle
		
		// EtreHumain[] etreHumains = new EtreHumain[3];
		ArrayList<EtreHumain> humains = new ArrayList<EtreHumain>();
		humains.add(new Male());
		humains.add(new Femelle());
		humains.add(new Femelle());
		humains.add(new Male());
		
		for (EtreHumain humain : humains) {
			humain.uriner();
		}
		/*
		 	Etre debout
			S'abaisser
			S'abaisser
			Etre debout
		 */
	}

}
