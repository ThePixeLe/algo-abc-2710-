# Explication détaillée de l'exercice de tri

## Analyse du problème

**Problème** : Nous avons deux nombres entiers `a` et `b`. Nous devons les afficher dans l'ordre croissant (du plus petit au plus grand).

**Analogies courantes utilisées par David J. Malan** :

- Imaginer que `a` et `b` sont deux personnes de différentes tailles
- Penser à les ranger comme on rangerait des livres par taille sur une étagère

## Décomposition du problème

### Étape 1 : Comprendre tous les cas possibles

Quand on compare deux nombres, il n'y a que 3 possibilités :

1. `a` est plus petit que `b`
2. `a` est plus grand que `b`
3. `a` est égal à `b`极

### Étape 2 : Déterminer l'action pour chaque cas

Pour chaque situation, que devons-nous faire ?

- Si `a < b` : afficher d'abord `a`, puis `b`
- Si `a > b` : afficher d'abord `b`, puis `a`
- Si `a = b` : l'ordre n'a pas d'importance, on peut afficher dans n'importe quel ordre

## Pseudo-code détaillé极

```pseudocode
DÉBUT
    // Étape 1 : Lire les deux nombres
    LIRE a
极    LIRE b
    
    // Étape 2 : Comparer avec une structure conditionnelle
    SI a < b ALORS
        // Cas où a est plus petit
        AFFICHER a
        AFFICHER b
    SINON SI a > b ALORS
        // Cas où b est plus petit
        AFFICHER b
        AFFICHER a
    SINON
        // Cas où ils sont égaux
        AFFICHER a
        AFFICHER b  // ou l'inverse, peu importe
    FIN SI
FIN
```

## Formules mathématiques utilisées

Les seules "formules" mathématiques ici sont les **opérateurs de comparaison** :

- `<` : inférieur à
- `>` : supérieur à
- `==` ou `=` : égal à (selon le langage)

## Exemples concrets pour vérifier la logique

**Exemple 1** : a = 极5, b = 3

- Comparaison : 5 > 3 → vrai
- Action : afficher b puis a → 3, 5

**Exemple 2** : a = 2, b = 7

- Comparaison : 2 < 7 → vrai
- Action : afficher a puis b → 2, 7

**Exemple 3** : a = 4, b = 4

- Comparaison : égalité
- Action : afficher dans n'importe quel ordre → 4, 4

## Réflexion supplémentaire

**Pourquoi cette approche fonctionne-t-elle ?**

- Nous couvrons tous les cas possibles avec notre structure conditionnelle
- Chaque branche de la condition gère un scénario spécifique
- Le programme est **déterministe** : pour toute paire d'entrées, il y a une sortie prévisible
