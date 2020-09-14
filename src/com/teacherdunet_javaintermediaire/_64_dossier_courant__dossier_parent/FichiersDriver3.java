package teacher_du_net_java_intermediaire2._fichiers._64_dossier_courant__dossier_parent;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FichiersDriver3 {
	public static void main(String[] args) throws IOException {
		/*
		 *  ./ le point signifie répertoire dans lequel on se trouve
		 *     ou encore le dossier courant
		 *     
		 *  ../fichier.txt -- .. est le dossier parent donc teachersdunet-java_avance
		 */

		Path path = Paths.get("./fichier_test.txt"); 
		Path pathParent = Paths.get("../fichier.txt");
		
		System.out.println(path.toAbsolutePath()); // fichier absent ou pas -- H:\java-projects-2\teachersdunet-java_avance\teacher_du_net_java_intermediaire2\.\fichier_test.txt
		// Rappel avec toRealPath() le fichier doit exister sinon exception
		System.out.println(pathParent.toRealPath(LinkOption.NOFOLLOW_LINKS)); // H:\java-projects-2\teachersdunet-java_avance\fichier.txt
	}
}
