package com.teacherdunet_javaintermediaire._58_4_7_enumerations_ajout_methodes;

public class LecteurMP4 {

	private Volume4 volume;

	public Volume4 getVolume() {
		return volume;
	}

	public void setVolume(Volume4 volume) {
		//if (volume.equals(Volume4.HIGH)) {
		if (volume == Volume4.HIGH) {
			Volume4.alert();
		}
		this.volume = volume;
	}
	
	public static void main(String[] args) {
		LecteurMP4 lecteur = new LecteurMP4();
		lecteur.setVolume(Volume4.LOW);
		lecteur.setVolume(Volume4.HIGH);
	}

}
