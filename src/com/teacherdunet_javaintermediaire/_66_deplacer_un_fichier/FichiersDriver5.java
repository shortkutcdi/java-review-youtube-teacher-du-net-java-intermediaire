package teacher_du_net_java_intermediaire2._fichiers._66_deplacer_un_fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichiersDriver5 {
	public static void main(String[] args) throws IOException {
		
		Path dossierNice = Paths.get("nice");
		
		// vérifier si le dossier exist sinon le créer
		if (!Files.exists(dossierNice)) {
			Files.createDirectory(dossierNice);
		} 
		
		Path source = Paths.get("fichier_test.txt");
		
		// déplacer s'il existe sinon exception
		if (Files.exists(source)) {
			Files.move(dossierNice.resolve("go.txt"), source, 
					StandardCopyOption.REPLACE_EXISTING);
		}
		
	}
}
