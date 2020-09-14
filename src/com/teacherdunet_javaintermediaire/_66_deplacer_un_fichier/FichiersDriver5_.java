package teacher_du_net_java_intermediaire2._fichiers._66_deplacer_un_fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichiersDriver5_ {
	public static void main(String[] args) throws IOException {
		
		/*
		 	utiliser la source pour définir la destination pour un dépacement dans le dossier nice
		 */
		Path source = Paths.get("momo/fichier_copie.txt");
		
		if (Files.exists(source)) {
			Files.move(source, source.resolve("../../nice/" + source.getFileName().toString()), 
					StandardCopyOption.REPLACE_EXISTING);
		} else {
			System.out.println("Pas de fichier à déplacer");
		}
	}
}
