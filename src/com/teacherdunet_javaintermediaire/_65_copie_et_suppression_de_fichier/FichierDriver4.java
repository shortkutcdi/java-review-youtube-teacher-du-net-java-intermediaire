package teacher_du_net_java_intermediaire2._fichiers._65_copie_et_suppression_de_fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichierDriver4 {
	
	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("fichier_test.txt");
		Path destination = Paths.get("fichier_copie.txt");
		
		// copier un fichier -- attention si on relance le code une exception est lancée
		// il ne sait pas quoi faire remplacerle fichier
		// Files.copy(source, destination);
		
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING );
		
		// Files.delete(destination); // génère une exception si fichier inexistant
		Files.deleteIfExists(destination); // plus sûr
		
		
	}

}
