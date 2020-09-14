# Création 2 classes ConsoleQuiz et GUIQuiz

ConsoleQuiz qui fait la même chose que la précédente classe Quiz
--> affiche un message via la console

GUIQuiz utilise Swing pour afficher une interface graphique avec 
JOptionPane.showMessageDialog() qui remplace System.out.println()

Là où on utilisait Sytem.out.printf() remplacé par JOptionPane.showMessageDialog(null, String.format())

exemple :

````java
	System.out.printf("Non, la capitale est %s\n\n", question.getReponse());
````

devient

````java
	JOptionPane.showMessageDialog(null, 
							String.format("Non, la capitale est %s\n\n", question.getReponse()));
````

## Dans GUIQuiz remplacer classe Scanner par JOptionPane.showInputDiaog(mess)

````java
	Scanner clavier = new Scanner(System.in);
	
	//...
	
	System.out.println(question.getText());
	String answerCapitale = clavier.nextLine().trim();
	
	clavier.close();
````

remplacé par 

````java
	String answerCapitale = JOptionPane.showInputDialog(null, question.getText());
````

## refactoring _ principe DRY - nouvelle class Quiz

Les classes GUIQuiz et ConsoleQuiz utilisent le même code --> refactoriser dans une nouvelle classe Quiz

Choix entre interface et classe abstraite

--> **classe abstraite** Quiz; car on veut récupérer des méthodes avec du contenu méthode start()
avec 2 méthodes abstraites displayMessage() et retreiveAnswer()

La classe Quiz on prend tout le contenu de ConsoleQuiz et on fait des modifications

dans start() on remplacera System.out... par displayMessage()
et clavier.nextLine() par retreiveAnswer()

	System.out.println("Bon score");
 
 devient
 
	displayMessage("Bon score");
	
et

	System.out.printf("Non, la capitale est %s\n\n", question.getReponse());
	
devient

	displayMessage( String.format("Non, la capitale est %s\n\n", question.getReponse()) );


Récupération des données saisies par l'utilisateur

	System.out.println(question.getText());
	String answerCapitale = clavier.nextLine().trim();
	
devient
	
	String answerCapitale = retreiveAnswer(question.getText());

les classes ConsoleQuiz et GUIQuiz sont modifiées --> on efface tout le contenu et fait hériter de Quiz

## ConsoleQuiz

Pour fermer le scanner on ajoute à la fin de start() une methode abstraite startClose()
que l'on définira dans ConsoleQuiz pour fermer le scanner - on la laissera vide dans GUIQuiz

