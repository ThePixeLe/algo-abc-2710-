# EXERCICE 2.1 : COMPARAISON DE NOMBRES

L'objectif ici n'est pas de te donner la réponse, mais de te donner les outils pour la construire toi-même. On va suivre une logique de programmation.

---

## 1. Analyse du Problème (Comprendre "l'énoncé")

D'abord, décomposons ce que l'énoncé nous demande. Il faut gérer **trois scénarios distincts** en fonction de l'âge (`a`) saisi par l'utilisateur :

1. **Scénario A :** `a` est **négatif**. -> Message : "Vous n'êtes pas encore né".
2. **Scénario B :** `a` est **positif mais inférieur à 18**. -> Message : "Vous êtes mineur".
3. **Scénario C :** `a` est **positif et supérieur ou égal à 18**. -> Message : "Vous êtes majeur".

L'idée clé ici est que ces scénarios s'excluent mutuellement. Si vous n'êtes pas encore né, on ne se pose même pas la question de la majorité. Cette pensée nous mène directement à la structure de contrôle idéale : les **conditions "Si... Alors... Sinon"**.

---

## 2. Pseudo-code (Le Plan d'Action)

Le pseudo-code est une façon de décrire les étapes de notre programme en français (ou en presque-code), sans se soucier de la syntaxe exacte d'un langage de programmation. C'est notre plan.

**Formules/Opérateurs Mathématiques Utilisés :**

* **Comparaisons :** `<` (inférieur à), `>=` (supérieur ou égal à). C'est le cœur de l'exercice.
* **Structure logique :** `SI... ALORS... SINON SI... SINON...`. Ce n'est pas une formule mathématique pure, mais une structure logique fondamentale.

Voici le plan détaillé :

```pseudocode
// Étape 1 : Demander et récupérer l'information
DEMANDER à l'utilisateur "Quel est votre âge ?"
STORER la réponse dans une variable appelée `age`

// Étape 2 : Prendre uma décision basée sur cette information
SI age < 极0 ALORS
    // Scénario A : Le nombre est négatif
    AFFICHER "Vous n'êtes pas encore né"

SINON SI age < 18 ALORS
    // Scénario B : L'âge est positif mais insuffisant pour la majorité
    // Note : Ici, on est sûr que age >= 0, car le cas négatif a déjà été traité.
    A极FFICHER "Vous êtes mineur"

SINON
    // Scénario C : Tous les autres cas (age >= 18)
    AFFICHER "Vous êtes majeur"
FIN SI
```

**Pourquoi cet ordre est important ?**
L'ordre des conditions est crucial. On vérifie d'abord le cas le plus "spécial" (l'âge négatif, qui n'a pas de sens dans le contexte normal), puis on traite les cas normaux. Si on mettait `age < 18` en premier, un nombre négatif serait aussi considéré comme `mineur`, ce qui est incorrect selon l'énoncé.

---

## 3. À Toi de Jouer ! (Traduction en Code)

Maintenant, tu as le plan. Ton travail est de le traduire dans le langage de programmation de ton choix (Python, JavaScript, C++, etc.). Chaque langage a a syntaxe légèrement différente pour les instructions `if`, `else if` (`elif` en Python), et `else`, ainsi que pour lire l'entrée utilisateur et afficher un message.

**Indices pour la traduction :**

* Cherche comment faire un `input` (lire une entrée clavier).
* Cherche comment convertir cette entrée en nombre (souvent, ce qui est tapé au clavier est une chaîne de caractères qu'il faut transformer en nombre entier).
* Cherche la syntaxe exacte pour `极if`, `else if`, et `else`.
