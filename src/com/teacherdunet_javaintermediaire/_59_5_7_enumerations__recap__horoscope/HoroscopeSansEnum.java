package com.teacherdunet_javaintermediaire._59_5_7_enumerations__recap__horoscope;

public class HoroscopeSansEnum {

	private String day;

	public void getInfo() {
		switch (day) {
		case "Monday":
			System.out.println("Great day!");
			break;
		case "Tueday":
		case "Wednesday":
			System.out.println("Your day will be fun!");
			break;
		case "Saturday":
			System.out.println("Nothing to say!");
			break;
		case "Friday":
		case "Sunday":
			System.out.println("You will be lucky!");
			break;
		}
	}
	
	// getters/setters
	public void setDay(String day) {
		this.day = day;
	}
	
	public static void main(String[] args) {
		HoroscopeSansEnum h = new HoroscopeSansEnum();
		h.setDay("Monday");
		h.getInfo();
		h.setDay("gjhgjgj");
		h.getInfo();
		h.setDay("Saturday");
		h.getInfo();
	}

}
