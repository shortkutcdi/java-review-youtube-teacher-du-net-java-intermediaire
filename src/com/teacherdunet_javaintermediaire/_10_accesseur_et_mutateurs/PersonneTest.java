package com.teacherdunet_javaintermediaire._10_accesseur_et_mutateurs;

public class PersonneTest {
	
	public static void main(String[] args) {
		Personne pers1 = new Personne("Honoré Hounwanou");
		pers1.setAge(10); 
//		pers1.age++;
		
		System.out.println(pers1.getAge());
		
		pers1.setAge(15);
		System.out.println(pers1.getAge() + " jours");
	}
}
