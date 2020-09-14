package com.teacherdunet_javaintermediaire._60_6_7_enumerations__ajout_classe_abstraite;

public enum Volume6 {
	LOW {
		@Override
		public void alert() {
			System.out.println("Vous risquez de ne rien entendre");
		}
	}, MEDIUM {
		@Override
		public void alert() {
			System.out.println("Tout baigne. Volume normal !");
		}
	}, HIGH {
		@Override
		public void alert() {
			System.out.println("Attention à vos oreilles");
		}
	};
	
	public abstract void alert();
	
}
