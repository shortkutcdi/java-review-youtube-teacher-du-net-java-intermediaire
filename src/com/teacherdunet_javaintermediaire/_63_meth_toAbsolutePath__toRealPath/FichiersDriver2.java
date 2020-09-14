package teacher_du_net_java_intermediaire2._fichiers._63_meth_toAbsolutePath__toRealPath;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FichiersDriver2 {

	public static void main(String[] args) throws IOException {
		// chemin absolu  -- c:/momo/fichier.txt --- depuis la racine
		// chemin relatif -- /momo/fichier.txt --- relatif au dossier actuel en cours
	
		Path path1 = Paths.get("c:/momo/fichier_test.txt");
		Path path = Paths.get("fichier_test.txt"); // chemin absolu
		
		// récupérer le chemin absolu du fichier - EXISTANT OU PAS
		System.out.println(path.toAbsolutePath()); // H:\java-projects-2\teachersdunet-java_avance\teacher_du_net_java_intermediaire\fichier_test.txt
		System.out.println(path1.toAbsolutePath());
		
		// récupérer chemin de l'emplacement réel du fichier --> SI ABSENT  --> exception
		System.out.println(path.toRealPath());
		
		// ne pas suivre les liens symboliques
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		
	}
}
