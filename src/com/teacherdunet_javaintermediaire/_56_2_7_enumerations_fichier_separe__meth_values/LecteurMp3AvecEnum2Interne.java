package com.teacherdunet_javaintermediaire._56_2_7_enumerations_fichier_separe__meth_values;

import com.teacherdunet_javaintermediaire._55_1_7__enumerations.LecteurMp3AvecEnum.Volume;

public class LecteurMp3AvecEnum2Interne {


	private VolumeInterne volume;
	
	public enum VolumeInterne {
		LOW, MEDIUM, HIGH
	}

	public VolumeInterne getVolume() {
		return volume;
	}


	public void setVolume(VolumeInterne volume) {
		this.volume = volume;
	}

	public static void main(String[] args) {

		for (VolumeInterne volume : VolumeInterne.values()) {
			System.out.println(volume);
		}
	}

}
