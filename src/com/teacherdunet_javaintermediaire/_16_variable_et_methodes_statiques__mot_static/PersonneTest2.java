package com.teacherdunet_javaintermediaire._16_variable_et_methodes_statiques__mot_static;

public class PersonneTest2 {
	
	public static void main(String[] args) {
		Personne2 pers1 = new Personne2("Honoré Hounwanou");
		Personne2 pers2 = new Personne2("Toto");
		Personne2 pers3 = new Personne2("Tata");
		pers1.setAge(10); 
//		pers1.age++;
		
		System.out.printf("Nombre de personnes %s\n", Personne2.nbTotPersonnes);
		
		System.out.printf("Nombre de personnes %s", Personne2.getNombreTotalDePersonnes());
	}
}
