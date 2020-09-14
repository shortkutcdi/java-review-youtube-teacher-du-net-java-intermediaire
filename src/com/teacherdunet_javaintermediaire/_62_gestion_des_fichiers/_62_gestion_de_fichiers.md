# Gestions de fichiers en Java

depuis Java 1.0 **API java.io** - IO Input Output

- gestion des fichiers et répertoires
 nombreux inconvenients (plusieurs classes qui ne lèvent pas les exceptions)
 le déplacement de fchier ou la copie ne sont pas disponibles
 
 depuis Java 1.4 **API NIO** (New IO)
 - résolutions des précédents problèmes
   non-blocking input/output, modèle non bloquant d'entrée/sortie
   --> pendant que l'est en train de lire un fichier, on peut faire autre chose
   
depuis Java 7 **API NIO2** version 2
package le plus recommandé

chemin absolu : chemin depuis la racine

	c:/rep1/rep2/fichier.txt

chemin relatif : chemin depuis l'endroit où on se trouve

	/rep1/rep2/fichier.txt

	

