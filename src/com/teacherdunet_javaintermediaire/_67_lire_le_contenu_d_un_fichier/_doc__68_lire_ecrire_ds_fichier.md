# Lire dans un fichier avec Files.readAllLines()

**Important** : mettre eclipse en utf-8 pref/general/workspace/text file encoding utf-8

		Path path = Paths.get("files/momo/fichier_test.txt");
		// équivalent à
		Path path2 = Paths.get("files", "momo", "fichier_test.txt");
		
		// lire toutes les lignes Files.readAllLines(path); // retourne une List<String>
		List<String> lignes = Files.readAllLines(path); 
		
		// itérer sur la List<String>
		for (String ligne : lignes) {
			System.out.println(ligne);
		}
		
## définir l'encodage param Charset.forName()

		List<String> lignes2 = Files.readAllLines(path2, Charset.forName("UTF-8"));

ou en définisant l'encodage

		List<String> lignes2 = Files.readAllLines(path2, StandardCharsets.UTF_8);
				
		// itérer sur la List<String>
		for (String ligne : lignes2) {
			System.out.println(ligne);
		}
		
## écrire du texte dans un fichier Files.write(path, string.getBytes())

		Path path = Paths.get("files", "momo", "cool.txt");
		String texte = "Je suis cool\nJe suis vraiment cool.";
		
		Files.write(path, texte.getBytes());	
		
ou en définisant l'encodage

		Files.write(path, texte.getBytes(StandardCharsets.UTF_8));	
		
## options d'écriture CREATE, WRITE, APPEND

CREATE crée un fichier s'il n'existe pas 
WRITE ouvre pour accéder en écriture
APPEND ajouter du contenu à la fin du fichier

TRUNCATE_EXISTING supprime le contenu précédent le remplace par le nouveau
CREATE_NEW crée un nouveau fichier, génère erreur si fichier déjà présent

exemple

		Path path = Paths.get("files", "momo", "cool.txt"); // file/momo/cool.txt
		String texte = "Serieux";
		
		Files.write(path, texte.getBytes(), 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE, 
				StandardOpenOption.APPEND);