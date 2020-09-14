package com.teacherdunet_javaintermediaire._29_la_classe_Object;

public class CompteBancaire {
	
	private String numeroCompte;
	private String nomProprietaire;
	private int solde = 0;
	

	public CompteBancaire(String nomProprietaire, int solde) {
		this.nomProprietaire = nomProprietaire;
		this.solde = solde;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	@Override
	public String toString() {
		return String.format("Compte bancaire de %s. Solde actuel : %.2f €", nomProprietaire, (double) solde);
	}
	
}
