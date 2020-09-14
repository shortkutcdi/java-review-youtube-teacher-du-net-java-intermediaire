# Enum ajout constructeur et toString()

on ajoute une variable value qui est définie ds le constructeur et ds la méthode toString() 

````java
public enum Volume3 {
	LOW(10), MEDIUM(50), HIGH(100);

	private int value;

	// le constructeur d'une enum est toujours private
	private Volume3(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
````

Quand on demande à afficher une valeur de l'enum il nous retourne la valeur définie 10, 20 , 30

	System.out.println(Volume3.LOW); // affiche 10 -- et pas LOW
	