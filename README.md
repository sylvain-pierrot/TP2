# ![](ressources/logo.jpeg) Bases de la programmation orientée objet 

### IUT Montpellier-Sète – Département Informatique

* **Cours:** [M2103](http://cache.media.enseignementsup-recherche.gouv.fr/file/25/09/7/PPN_INFORMATIQUE_256097.pdf) - support [ici](https://github.com/IUTInfoMontp-M2103/Ressources)
* **Enseignants:** [Marin Bougeret](mailto:marin.bougeret@umontpellier.fr), [Sébastien Gagné](mailto:sebastien.gagne@umontpellier.fr), [Jérôme Palaysi](mailto:jerome.palaysi@umontpellier.fr), [Victor Poupet](mailto:victor.poupet@umontpellier.fr), [Petru Valicov](mailto:petru.valicov@umontpellier.fr), [Bruno Yun](mailto:bruno.yun@umontpellier.fr) 
* Le [forum Piazza](https://piazza.com/class/jpv7gf0lltk4kc) de ce cours pour poser vos questions
* [Email](mailto:petru.valicov@umontpellier.fr) pour une question d'ordre privée concernant le cours.

## TP 2 : Prise en main de l'IDE et travail en mode TDD
Pendant les TP nous vous conseillons d'utiliser un environnement de développement intégré (IDE en anglais). Les avantages sont multiples : le refactoring du code, l'auto-complétion, la suggestion des méthodes/attributs/classes, la documentation intégrée, le debuggage, une bonne intégration de Git et GitHub, des tests unitaires etc. Dans ce cours nous utiliserons
**[IntelliJ IDEA](https://www.jetbrains.com/idea/)** de chez **[JetBrains](https://www.jetbrains.com)**. 
Il devrait donc vous faciliter la vie au quotidien dans la réalisation de vos TP. Bien évidement, rien ne vous empêche 
d'en utiliser un autre (Eclipse, NetBeans etc).

D'abord, et comme pour tous les tps de POO qui vont suivre, vous allez forker ce dépôt pour pouvoir commencer à travailler localement :

https://classroom.github.com/a/sOEtP2b1


### Découverte et prise en main de l'IDE


IntelliJ IDEA possède deux versions, la première dite *'communautaire'* est totalement open source et peut être utilisée 
gratuitement par n'importe qui et la seconde dite *'ultimate'* qui est plus riche en fonctionnalité et qui n'est pas 
gratuite pour les individus lambda. Par chance, comme dans le cas de GitHub, en tant qu'étudiant, vous avez la 
possibilité de pouvoir bénéficier d'une licence pour tous les produits JetBrains. Pour bénéficier de cette remise, il 
vous suffit de remplir [ce formulaire](https://www.jetbrains.com/shop/eform/students).

Quelques minutes après, vous recevrez un email de confirmation suivi d'un second email d'activation ou vous devrez accepter 
les conditions d'utilisation et choisir un nom d'utilisateur et un mot de passe. Conservez précieusement ces 
informations dans un coin identifié de votre cerveau car c'est grâce à elle que vous pourrez importer votre licence 
chez vous et dans les salles de TP.

#### Lancement de l'IDE

Ouvrir 'IntelliJ IDEA' (dans la section 'Programmation'/'Application').
Après le chargement, vous devriez tomber sur une première fenêtre vous proposant d'importer vos paramètres. Vous pouvez laisser sur 'Do not import settings' et valider :

![](ressources/complete_installation.png)

À partir de là vous allez tomber sur la partie de personnalisation de votre installation pour qu'elle corresponde à vos besoins. Sur l'aspect esthétique, choisissez ce qui vous convient le mieux. En ce qui concerne les différents plugins à intégrer, à priori, les options installées par défaut sont suffisantes, donc vous choisirez l'installation par défaut.

À la fin, vous allez saisir vos données de connexion pour terminer le paramétrage de votre IDE.

**Import du projet dans l'IDE**
Pour pouvoir maintenant travailler sur votre TP, il vous faut cloner votre dépôt GitHub et l'importer dans l'IDE.

![](ressources/ImportProjet.png)



### Workflow

Maintenant que vous savez utiliser Git en ligne de commande, que vous avez forké, importé et ouvert le TP dans votre IDE, 
vous êtes en capacité de travailler sur vos exercices. Pour vous faire découvrir le Test Driven Development (TDD), nous 
allons vous proposer de suivre un workflow particulier pour résoudre vos exercices progressivement et en consolidant 
progressivement un filet de sécurité qui vérifiera que votre code continue à bien faire ce qu'il doit.

Le TDD (Test-driven development) est une méthode de développement de logiciels qui consiste
à travailler sur des cycles de développement très courts. La conception apparaît au fur et à mesure du développement en encourageant une meilleure compréhension du problème en commençant à écrire les tests avant le code 
applicatif. Pour le développeur, les tests vont constituer une spécification technique exécutable et vérifiable à tout 
moment. Ainsi en rajoutant des tests, le développeur converge progressivement à la fois vers une spécification plus fine 
et un code fonctionnel associé.

Ci-dessous le déroulement d’un cycle :
1. Écrire un premier test automatique qui est censé définir une nouvelle fonctionnalité. Le test
doit s’écrire avant la fonctionnalité voulue, il est donc censé échouer initialement (normal, car vous n'avez encore rien programmé).
2. Écrire le code minimal suffisant pour passer le test.
3. Vérifier que le test passe.
4. __Réfactoriser__ (simplifier, améliorer, optimiser etc.) tous le code tout en gardant la fonctionnalité. Durant cette étape les tests écrits préalablement sont exécutés en permanence pour certifier la validité des changements.


Ce workflow se décrit par le triptyque "RED, GREEN, REFACTOR" dans le schéma suivant :

![](ressources/test-driven-development.png)

Le workflow que vous allez devoir suivre va reprendre la même structure, mis à part qu'au début, les tests vous seront donnés pour vous faire découvrir cette méthode sans trop de douleur.



### Exercice 2 : Fizz Buzz !

Le kata Fizz Buzz est un des kata les plus connus pour l'apprentissage du TDD.
Une série 'FizzBuzz' de taille `n` est une suite d'entiers positifs où les multiples de 3 doivent être remplacés par 'Fizz' et les multiples de 5 doivent être remplacés par 'Buzz'. Voici la série FizzBuzz de taille 20 :

1 ; 2 ; Fizz ; 4 ; Buzz ; Fizz ; 7 ; 8 ; Fizz ; Buzz ; 11 ; Fizz ; 13 ; 14 ; FizzBuzz ; 16 ; 17 ; Fizz ; 19 ; Buzz

#### L'objectif de cet exercice est :
- Implémentez une classe `FizzBuzzer` avec une fonction `getValues(int i)` qui vous permettra de générer toute la série 'FizzBuzz' jusqu'à la valeur passée en paramètre. 


Vous activerez les tests les un après les autres et soumettre votre solution après 
chaque itération du cycle principal du workflow.

### Exercice 3 : 

Vous trouverez d'autres katas qui vous permettront de mieux apprendre la programmation en mode TDD :

http://codingdojo.org/kata/
