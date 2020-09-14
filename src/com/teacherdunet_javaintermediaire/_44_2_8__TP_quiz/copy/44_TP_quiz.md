# Objectifs

- application de quiz ou on pourra poser un ensemble de questions
  auquelles l'utilisateur pourra donner des réponses
  
` on affichera par la suite les résultats (score & temps mis 
  pour répondre aux différentes questions)
  
  classes potentielles (ou variables)
  
  - Application (pas d'intéret)
  - Quiz (ok ***)
  - Question (peut-être **) 
  - Reponses (peut-être **) 
  - Resultat (propriété du Quiz)
  - score	 (propriété du Quiz)
  - temps 	 (propriété du Quiz)
  
  3 classes Quiz, Question, Reponse
  
  code final pour l'exécutions
  
  ````java
  Quiz quiz = new Quiz();
  quiz.start();
  quiz.displayResults();
  ````
  
  	Quiz
  		start()
  		displayResults()
  		-score
  		-timeElapse
  	
  	Question	
  	quelle est la capitale du Sénégal	?
  	- enonce
  	- reponse (sppr classe Reponse)
  	
  	