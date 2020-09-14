# Enum - Ajout d'un méthode abstraite

Quand on ajoute une méthode abstraite à un Enum il faut redéfinir pour chaque attributs la méthode


Ici on a créé une méthode abstraite alert(), on a du redéfinir la méthode pour tous les membres

````java
public enum Volume6 {
	LOW {
		@Override
		public void alert() { System.out.println("Vous risquez de ne rien entendre"); }
	}, MEDIUM {
		@Override
		public void alert() { System.out.println("Tout baigne. Volume normal !"); }
	}, HIGH {
		@Override
		public void alert() { System.out.println("Attention à vos oreilles"); }
	};
	
	public abstract void alert();
	
}
````

## Mise en application

LecteurMP3_6

quand on setVolume :

- définit le volume
- appel de la méthode alert()

````java
public class LecteurMP3_6 {
	private Volume6 volume;

	public Volume6 getVolume() { return volume; }

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
````

