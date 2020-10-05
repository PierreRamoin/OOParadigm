# OOParadigm_1
### English (French version follow)

The program gives no output, and it is on purpose.

If you still want to compile the project, run this command from this folder: 

```mvn compile assembly:single```


Then, to launch it, run 

```java -jar target/OOParadigm_1-1.0-SNAPSHOT-jar-with-dependencies.jar```

---
Your goal is to browse the program to understand what it does on several levels.

To do that, you should start on the entry class ```com.pierreramoin.example1.ToyExample```,
and follow the project tree to answer the following questions:
- At the highest level (the entry class), what is the program doing ?
- Try to describe, how the```ToyCompany``` ```produce``` a toy ?
- How many ```Transaction``` are listed in the ```BankAccount```, at the end of the execution ?
- Does the company earn some money ?

### French

Le programme ne produit aucune sortie, c'est volontaire.

Si vous souhaitez malgré tout compiler, exécutez la commande suivante depuis ce répertoire :

```mvn compile assembly:single```


Puis pour lancer le programme, lancer la commande suivante :

```java -jar target/OOParadigm_1-1.0-SNAPSHOT-jar-with-dependencies.jar```

---

Votre objectif et de parcourir les sources du programme pour comprendre ce qu'il fait à différents niveaux.


Pour cela, vous devriez commencer par regarder la fonction ```main``` qui se trouve dans la classe 
```com.pierreramoin.example1.ToyExample```, puis en suivant l'exécution, essayez de répondre aux questions suivantes :

- Au niveau le plus haut (la classe ```ToyExample```), que fait le programme ?
- Essayez de décrire comment la ```ToyCompany``` produit (```produce```) un ```Toy```
- Combien de ```Transaction``` se trouvent dans le compte bancaire (```BankAccount```), à la fin de l'exécution ?
- Est-ce que l'entreprise a gagné de l'argent à la fin de l'exécution ?
