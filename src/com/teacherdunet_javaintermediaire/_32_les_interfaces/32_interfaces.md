# Les interfaces

Une interface est une classe 100% abstraite --> méthodes abstraites qui n'ont pas de corps

- pas de constructeur 

- non instantiable

- pas d'attributs (à la différences des classes abstraites)

- champs static ou champs avec le mot-clé final

- **contrat** avec les classe qui l'implémentent

Les classes qui implémentent une interface doivent respecter le contrat qui les lie à celle-ci

==> implémenter toutes ses méthodes

- classe peut implémenter **plusieurs interfaces** (mais n'hérite que d'**une seule** classe)

- si une classe hérite d'un autre classe et qu'elle implémente une interface (ou plusieurs interfaces)
  il faut d'abort utiliser extends puis implements
  
A hérite (extends) de la classe B et implémente (implemets) les interfaces I1 et I2
  
````java
public class A extends B implements I1, I2 {} 
````

Interface Animal

````java
public interface Animal {
	public void communiquer();
}
````

implémentation de Animal dans Chat et Cien


````java
public class Chat implements Animal {

	@Override
	public void communiquer() {
		System.out.println("Miaou !");
	}
}
````

````java
public class Chien implements Animal {

	@Override
	public void communiquer() {
		System.out.println("Whaaf !");
	}
}
````

## Test

````java
public class InterfacesTest {
	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.communiquer(); // Miaou !
		
		Chien chien = new Chien();
		chien.communiquer(); // Whaaf !		
	}
}
````

A l'instantiation on peut déclarer le type de l'interface (polymorphisme)
Ici chat est de type Animal et est instanciée avec la classe Chat()

````jav
	Animal chat = new Chat();
````

