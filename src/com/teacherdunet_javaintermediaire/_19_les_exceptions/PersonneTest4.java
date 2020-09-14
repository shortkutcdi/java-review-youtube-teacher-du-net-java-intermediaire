package com.teacherdunet_javaintermediaire._19_les_exceptions;

public class PersonneTest4 {

	public static void main(String[] args) {
		Personne4 pers1 = new Personne4("Hounwanou", "Honoré");

		// pers1.setAge(14);

		try {
			pers1.setAge(14);
		} catch (IllegalArgumentException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Cette phrase est affichée même en cas d'exception (avec try/catch");
	}
}
