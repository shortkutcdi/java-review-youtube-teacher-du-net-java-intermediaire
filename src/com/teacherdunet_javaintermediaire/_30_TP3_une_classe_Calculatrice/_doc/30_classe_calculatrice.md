# Calculatrice

## varargs -- Nombre variable de paramètres -- int... nombres

````java
	public void additionner(double... nombres) {
		for (double nombre : nombres) {
			resultat += nombre;
		}
	}
````

exécution

````java
public class CalculatriceTest {
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.additionner(6, 2, -2, 4); // 10 (6 + 2+ (-2) +4)
		calculatrice.additionner(-2); // 8
		calculatrice.additionner(8); // 16
		System.out.println(calculatrice.getResultat()); // 16
	}

````

## Ajout soustraire() à Calculatrice

````java
	public void additionner(double... nombres) {
		for (double nombre : nombres) {
			resultat += nombre;
		}
	}

	public void soustaire(double... nombres) {
		for (double nombre : nombres) {
			resultat -= nombre;
		}
	}	
````

## Refactoring DRY 

DRY Dont Repeat Yourself

Il y a du code qui se répète

````java
	private double resultat; // par défaut à 0.0

	public void additionner(double... nombres) {
		effectuer('+', nombres);
	}

	public void soustaire(double... nombres) {
		effectuer('-', nombres);
	}
	
	private void effectuer(char operateur, double... nombres) {
		for (double nombre : nombres) {
			calculer(operateur, nombre);
		}
	}

	private void calculer(char operateur, double nombre) {
		switch (operateur) {
		case '+':
			resultat += nombre;
			break;
		case '-':
			resultat -= nombre;
			break;
		}
	}
````