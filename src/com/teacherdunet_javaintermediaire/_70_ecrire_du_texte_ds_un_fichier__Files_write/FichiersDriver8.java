package teacher_du_net_java_intermediaire2._fichiers._70_ecrire_du_texte_ds_un_fichier__Files_write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FichiersDriver8 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("files", "momo", "cool.txt"); // file/momo/cool.txt
		String texte = "Serieux";
		
		Files.write(path, texte.getBytes(), 
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE, 
				StandardOpenOption.APPEND);
	}
		
	
}
