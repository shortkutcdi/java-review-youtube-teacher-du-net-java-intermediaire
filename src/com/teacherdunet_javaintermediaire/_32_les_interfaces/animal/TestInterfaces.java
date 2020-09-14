package com.teacherdunet_javaintermediaire._32_les_interfaces.animal;

public class TestInterfaces {
	public static void main(String[] args) {
		Animal chat = new Chat();
		chat.communiquer(); // Miaou !
		
		Animal chien = new Chien();
		chien.communiquer(); // Whaaf !		
	}
}
