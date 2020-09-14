package com.teacherdunet_javaintermediaire._60_6_7_enumerations__ajout_classe_abstraite;

public class LecteurMP3_6 {

	private Volume6 volume;

	public Volume6 getVolume() {
		return volume;
	}

	public void setVolume(Volume6 volume) {
		this.volume = volume;
		volume.alert();
	}

	public static void main(String[] args) {
		LecteurMP3_6 lecteur = new LecteurMP3_6();
		lecteur.setVolume(Volume6.LOW);
		lecteur.setVolume(Volume6.HIGH);
		lecteur.setVolume(Volume6.MEDIUM);

	}
}
