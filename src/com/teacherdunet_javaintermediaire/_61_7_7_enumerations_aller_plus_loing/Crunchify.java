package com.teacherdunet_javaintermediaire._61_7_7_enumerations_aller_plus_loing;

public class Crunchify {
	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
 
	Company cName;
 
	public Crunchify(Company cName) {
		this.cName = cName;
	}
 
	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
 
		default:
			System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}
 
	public static void main(String[] args) {
		Crunchify ebay = new Crunchify(Company.EBAY);
		ebay.companyDetails();
		Crunchify paypal = new Crunchify(Company.PAYPAL);
		paypal.companyDetails();
		Crunchify google = new Crunchify(Company.GOOGLE);
		google.companyDetails();
		Crunchify yahoo = new Crunchify(Company.YAHOO);
		yahoo.companyDetails();
		Crunchify att = new Crunchify(Company.ATT);
		att.companyDetails();
	}

}
