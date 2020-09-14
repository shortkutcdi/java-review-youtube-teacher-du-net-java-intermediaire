package com.teacherdunet_javaintermediaire._20_importations_statiques;

public class TestStaticPerso {

	public static void main(String[] args) {
		System.out.println(TestStaticPerso.abs(12));

		System.out.println(abs(15)); //dans la classe on peut omettre TestStatic.abs(15)
		System.out.println(abs(-15));

	}

	public static int abs(int value) {
		return (value >= 0) ? value : -value;
	}

}
