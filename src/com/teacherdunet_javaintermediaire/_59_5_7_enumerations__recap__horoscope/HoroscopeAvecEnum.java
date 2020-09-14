package com.teacherdunet_javaintermediaire._59_5_7_enumerations__recap__horoscope;

public class HoroscopeAvecEnum {
	
	private Day day;
	
	public void setDay(Day days) {
		this.day = days;
	}
	
	public void getInfo() {
		switch (day) {
		case MONDAY:
			System.out.println("Great day!");
			break;
		case TUESDAY:
		case WEDNESDAY:
			System.out.println("Your day will be fun!");
			break;
		case SATURDAY:
			System.out.println("Nothing to say!");
			break;
		case FRIDAY:
		case SUNDAY:
			System.out.println("You will be lucky!");
			break;
		}
	}


	public static void main(String[] args) {
		HoroscopeAvecEnum h = new HoroscopeAvecEnum();
		h.setDay(Day.MONDAY);
		h.getInfo();
		h.setDay(Day.FRIDAY);
		h.getInfo();
		h.setDay(Day.WEDNESDAY);
		h.getInfo();

	}

}
