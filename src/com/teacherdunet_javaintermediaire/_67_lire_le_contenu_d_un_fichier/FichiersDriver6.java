package teacher_du_net_java_intermediaire2._fichiers._67_lire_le_contenu_d_un_fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FichiersDriver6 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("files/momo/fichier_test.txt");
		// équivalent à
		Path path2 = Paths.get("files", "momo", "fichier_test.txt");
		
		// lire toutes les lignes Files.readAllLines(path); // retourne une List<String>
		List<String> lignes = Files.readAllLines(path); 
		
		// itérer sur la List<String>
		for (String ligne : lignes) {
			System.out.println(ligne);
		}
		
		System.out.println("--------------------------------------");

//		List<String> lignes2 = Files.readAllLines(path2, Charset.forName("UTF-8"));
		List<String> lignes2 = Files.readAllLines(path2, StandardCharsets.UTF_8);
		// itérer sur la List<String>
		for (String ligne : lignes2) {
			System.out.println(ligne);
		}
	}
}
