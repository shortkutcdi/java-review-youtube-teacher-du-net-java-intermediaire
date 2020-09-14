package com.teacherdunet_javaintermediaire._11_encapsulation.personne;

public class PersonneTest1 {
	
	public static void main(String[] args) {
		Personne2 pers1 = new Personne2("Honoré Hounwanou");
		pers1.setAge(10); 
//		pers1.age++;
		
		System.out.println(pers1.getAge());
		
		pers1.setAge(15);
		System.out.println(pers1.getAge() + " jours");
	}
}
