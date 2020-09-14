package teacher_du_net_java_intermediaire2._fichiers._65_copie_et_suppression_de_fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichiersDriver2_2 {
	public static void main(String[] args) throws IOException {
		/*
		 * copier le fichier fichier_test.txt 
		 * vers le dossier momo avec le nom fichier_copie.txt
		 */
		Path source = Paths.get("fichier_test.txt");
		Path destination = Paths.get("./momo/fichier_copie.txt");
		
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
