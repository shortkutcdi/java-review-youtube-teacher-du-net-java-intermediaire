# Gestions de fichiers en Java

depuis Java 1.0 **API java.io** - IO Input Output

- gestion des fichiers et répertoires
 nombreux inconvenients (plusieurs classes qui ne lèvent pas les exceptions)
 le déplacement de fichier ou la copie ne sont pas disponibles
 
 depuis Java 1.4 **API NIO** (New IO)
 - résolutions des précédents problèmes
   non-blocking input/output, modèle non bloquant d'entrée/sortie
   --> pendant que l'est en train de lire un fichier, on peut faire autre chose
   
depuis Java 7 **API NIO2** version 2
package le plus recommandé

chemin absolu : chemin depuis la racine

	c:/rep1/rep2/fichier.txt

chemin relatif : chemin depuis l'endroit où on se trouve

	/rep1/rep2/fichier.txt

## Fichier/dossier - chemin absolu ou chemin réel

	Path path1 = Paths.get("c:/momo/fichier_test.txt");
	
``path.get()`` récupère un fichier qui existe ou pas
	
 chemin absolu  -- c:/momo/fichier.txt --- depuis la racine
 	
	path.toAbsolutePath() -- fichier existant ou pas
 
 chemin relatif -- /momo/fichier.txt --- relatif au dossier actuel en cours
 
 chemin réel -- attention si absent génère une exception
 
	// récupérer chemin de l'emplacement réel du fichier --> SI ABSENT  --> exception
	System.out.println(path.toRealPath());
 

````java
	public static void main(String[] args) throws IOException { //<<<<<<<<<<<<<<<<< ajout d'un throws
	
		Path path1 = Paths.get("c:/momo/fichier_test.txt");
		Path path = Paths.get("fichier_test.txt"); // chemin absolu
		
		// récupérer le chemin absolu du fichier - EXISTANT OU PAS
		System.out.println(path.toAbsolutePath()); // H:\java-projects-2\tdn-java_avance\tdn_java_intermediaire\fichier_test.txt
		System.out.println(path1.toAbsolutePath());
		
		// récupérer chemin de l'emplacement réel du fichier --> SI ABSENT  --> exception
		System.out.println(path.toRealPath());
		
		// ne pas suivre les liens symboliques
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
````

## Dossier courant, dossier parent

   ./ le point signifie répertoire dans lequel on se trouve
      ou encore le dossier courant
      
   ../fichier.txt -- .. est le dossier parent donc teachersdunet-java_avance

		Path path = Paths.get("./fichier_test.txt"); 
		Path pathParent = Paths.get("../fichier.txt");

## copie et suppression de fichier - Files.copy() - Files.deleteIfExists()

Copie ``Files.copy(source, destination);``

		Path source = Paths.get("fichier_test.txt");
		Path destination = Paths.get("fichier_copie.txt");
		
		// copier un fichier
		Files.copy(source, destination)
		
Attention si on relance le code une deuxième fois un exception est lancée FileAlreadyExistsException 
- solution :

		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING );

Suppression ``Files.deleteIfExists(destination)``
		
		// Files.delete(destination); // génère une exception si fichier inexistant
		Files.deleteIfExists(destination); // plus sûr

## Créer un dossier - !Files.exists() - Files.createDirectory()

- On vérifier au préalable si le dossier existe pour éviter une exception
- on le crée s'il n'existe pas

	// dossier nice
	Path dossierNice = Paths.get("nice");
	
	// vérifier si le dossier exist sinon le créer
	if (!Files.exists(dossierNice)) {
		Files.createDirectory(dossierNice);
	}

## Déplacer un fichier - Files.move()

	// dossier nice
	Path dossierNice = Paths.get("nice");

définir un fichier dans un chemin avec path.resolve("fichier.txt") == /nice/fichier.txt

Déplacer un fichier 

````java
		Path dossierNice = Paths.get("nice");
		
		// vérifier si le dossier exist sinon le créer
		if (!Files.exists(dossierNice)) {
			Files.createDirectory(dossierNice);
		} 
		
		Path source = Paths.get("fichier_test.txt");
		
		// déplacer s'il existe sinon exception
		if (Files.exists(source)) {
			Files.move(source, dossierNice.resolve("go.txt"), 
					StandardCopyOption.REPLACE_EXISTING);
		}
````

## Déplacer un fichier en utilisant la source uniquement

````java
		/*
		 * utiliser la source pour définir la destination pour un dépacement dans le dossier nice
		 */
		Path source = Paths.get("momo/fichier_copie.txt");
		
		if (Files.exists(source)) {
			Files.move(source, source.resolve("../../nice/" + source.getFileName().toString()), 
					StandardCopyOption.REPLACE_EXISTING);
		} else {
			System.out.println("Pas de fichier à déplacer");
		}
````

