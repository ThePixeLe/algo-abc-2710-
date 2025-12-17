EXERCICE 1.4 - CALCUL D'INTÉRÊTS :

🎯 Objectif pédagogique
Découvrir la différence entre croissance linéaire et exponentielle.

🔍 Concept principal :

Calculs financiers et exponentiation - Math.pow() pour les calculs exponentiels.

💡 Deux types de croissance :

Intérêt simple : Croissance linéaire → S(1 + N×i)
Intérêt composé : Croissance exponentielle → S(1 + i)^N
🧠 Insight important :

Les intérêts composés créent un "effet boule de neige" : les intérêts rapportent des intérêts !

📊 Comparaison pédagogique :

// Simple : ajout constant chaque année
// Composé : multiplication chaque année → croissance accélérée
🎓 Application réelle
Comprendre cet exercice, c'est comprendre comment fonctionnent les épargnes et les investissements !

DEBUT PROGRAMME Interets
    // 📥 Lecture des paramètres financiers
    ECRIRE "Somme initiale :"
    LIRE capital
    ECRIRE "Taux d'intérêt (ex: 0.05) :"
    LIRE taux
    ECRIRE "Nombre d'années :"
    LIRE annees
    
    // 🧮 Calcul des deux types d'intérêts
    interet_simple ← capital × (1 + annees × taux)
    interet_compose ← capital × (1 + taux) ^ annees
    
    // 📤 Affichage comparatif
    ECRIRE "Intérêt simple :", interet_simple, "€"
    ECRIRE "Intérêt composé :", interet_compose, "€"
    ECRIRE "Différence :", interet_compose - interet_simple, "€"
FIN PROGRAMME



Formule des INTÉRÊTS SIMPLES :

Valeur_finale = Capital × (1 + Années × Taux)

Explication :

Croissance linéaire - même gain chaque année
Les intérêts ne rapportent pas d'intérêts
Comme une ligne droite sur un graphique

En code Java :

interetSimple = capital * (1 + annees * taux);

Formule des INTÉRÊTS COMPOSÉS :

Valeur_finale = Capital × (1 + Taux)^Années

Explication :

Croissance exponentielle - effet "boule de neige"
Les intérêts rapportent des intérêts !
Comme une courbe qui monte de plus en plus vite

En code Java :

interetCompose = capital * Math.pow(1 + taux, annees);

💡 Différence cruciale :

Simple : 100€ à 5% sur 10 ans = 100 × (1 + 10×0.05) = 150€
Composé : 100€ à 5% sur 10 ans = 100 × (1.05)^10 ≈ 162.89€