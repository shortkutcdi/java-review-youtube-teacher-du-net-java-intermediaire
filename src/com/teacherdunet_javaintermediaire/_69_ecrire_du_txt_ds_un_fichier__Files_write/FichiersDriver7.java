package teacher_du_net_java_intermediaire2._fichiers._69_ecrire_du_txt_ds_un_fichier__Files_write;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FichiersDriver7 {

	public static void main(String[] args) throws IOException {
		System.out.println(Charset.defaultCharset()); // UTF-8
		
		Path path = Paths.get("files", "momo", "cool.txt"); // file/momo/cool.txt
		
		String texte = "Je suis cool\nJe suis vraiment cool.\nNon ?";
		
		// Files.write(path, texte.getBytes());
		Files.write(path, texte.getBytes(StandardCharsets.UTF_8));
	}
}
