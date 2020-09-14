# Bloc d'initialisation d'instance

Un bloc d'instance est un code qui est automatiquement appellé à l'instantiation d'une classe
avant le constructeur

````java
public class MaClasse {
	{
		// un bloc de code avec du code à l'intérieur
	}
	
	//constructeurs/méthodes
	
	// getters/setters
}
````

On a une classe test qui appelle 2 constructeurs mais qui répètent les même code 

````java
public class Test {
	
	public Test() {
		System.out.println("Je suis unconstructeur");		////////<<<<<<<<<< répétion
		System.out.println("Je suis un constructeur qui ne prend pas de paramètre");
	}

	public Test(int a) {
		System.out.println("Je suis unconstructeur");		////////<<<<<<<<<< répétion
		System.out.println("Je suis un constructeur qui ne prend en paramètre un entier");
	}
}
````

==> créer un bloc d'intialisation d'instance; il suffit d'écrire du code entre des accolades



````java
public class Test {

	// bloc d'intitialisation d'instance	
	{
		System.out.println("Je suis unconstructeur");		////////<<<<<<<<<< répétion
	}

	public Test() {
		System.out.println("Je suis un constructeur qui ne prend pas de paramètre");
	}

	public Test(int a) {
		System.out.println("Je suis un constructeur qui ne prend en paramètre un entier");
	}
}
````

## Bloc d'initialisation statique - de classe

c'est un bloc d'instance avec le mot clé static devant l'accolade d'ouverture
le code dans ce bloc est **appelé une et une seule fois** lorsque la classe Test est chargée

Ce bloc est intéressant si on veut charger des données complexes au chargement de la classe

Dans l'exemple ci-dessous on va récupérer dans une variable static des données d'internet au chargement de la classe Test dans le bloc static

````java
public class Test {
	
	public static ArrayList<String> importatData; // variable de classe
	public int b; // variable d'instance
	
	// bloc d'initialisation statique- appelé une seule foie Lors du chargement de Test
	static {
		importatData = getDataFromInternet();
	}
	
	// bloc d'initialisation d'instance
	{
		System.out.println("Je suis unconstructeur"); // appellé à chaque instatiation
	}
	
	private static ArrayList<String> getDataFromInternet() {
		System.out.println("Downloading data from internet...");
		ArrayList<String> data = new ArrayList<String>();
		data.add("Google");
		data.add("Facebook");
		data.add("twitter");
		return data;
	}
	
}
````

Exécution de Test

````java
public class MainTestBlocSTatic {

	public static void main(String[] args) {
		for (String dataWebsite : Test.importantData) { 			// ici se charge la classe Test
			System.out.println("Tous les jour je visite " + dataWebsite);
		}
		/*
		 	Downloading data from internet...
			Tous les jour je visite Google
			Tous les jour je visite Facebook
			Tous les jour je visite Twitter
		 */
	}
}
````
