package teacher_du_net_java_intermediaire2._fichiers._62_gestion_des_fichiers;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FichierDriver {

	public static void main(String[] args) {
		Path path = Paths.get("/momo/test.txt"); // pointe vers un fichier qui existe ou pas
		
		System.out.println(path.getFileName()); // test.txt
		System.out.println(path.getNameCount()); // 2
		
		Path path2 = Paths.get("/dossier1/dossier2/p3.txt");
		System.out.println(path2.getNameCount()); // 3
		System.out.println(path2.getName(0)); // dossier1
		
	// dernier élément de getName() --> path.getNameCount() -1
		System.out.println(path2.getName(path2.getNameCount()-1)); // p3.txt
		
		// retourner la racine
		Path path3 = Paths.get("c:/dossier1/dossier2/p3.txt");
		System.out.println(path3.getNameCount()); // 3 éléments --- c:\ n'est pas pris en compte
		System.out.println(path3.getRoot()); // c:\
		System.out.println(path2.getRoot()); // \
		
		// sous-partie d'un chemin
		System.out.println(path3.subpath(1, 2)); // dossier2 -- prends l'élément d'indice 1 jusqu'à l'élément d'indice 2 exclu
		System.out.println(path3.subpath(1, 3)); // dossier2/p3.txt
		
		// itérer avec un foreach
		for (Path partie : path3) {
			System.out.print(partie + " - "); // dossier1 - dossier2 - p3.txt --- c:\ n'est pas pris en compte
		}
	}

}
