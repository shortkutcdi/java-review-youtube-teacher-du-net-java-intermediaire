package com.teacherdunet_javaintermediaire._18_surcharge_methodes_overloading;

public class PersonneTest3 {
	
	public static void main(String[] args) {
		Personne3 pers1 = new Personne3("Hounwanou", "Honoré");
		
		System.out.println(pers1.getFullname());
		System.out.println(pers1.getFullname("Bonjour"));
	}
}
