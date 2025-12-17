EXERCICE 1.5 - INVERSION DE VALEURS

🎯 Objectif pédagogique :

Maîtriser la manipulation des variables et l'échange de valeurs.

🔍 Concept principal :

Variable temporaire et échange - Résoudre le problème classique de l'échange.

🧪 Analogie des verres :

Imaginons deux verres : jus d'orange et jus de pomme. Comment les échanger sans mélanger ?

🔄 Processus en 3 étapes :

temp = a → Sauvegarde de la valeur A
a = b → Transfert de B vers A
b = temp → Restauration de l'ancien A dans B
⚠️ Erreur courante
Sans variable temporaire : a = b puis b = a donne a = b et b = b → perte de valeur !

🏆 Compétence fondamentale :

Cette technique est utilisée dans tous les algorithmes de tri et de manipulation de données.

Psuedo-code :

DEBUT PROGRAMME Inversion
    // 📥 Lecture des valeurs initiales
    ECRIRE "Première valeur (a) :"
    LIRE a
    ECRIRE "Deuxième valeur (b) :"
    LIRE b
    
    // 🎯 Affichage avant inversion
    ECRIRE "AVANT : a =", a, ", b =", b
    
    // 🔄 Processus d'échange avec variable temporaire
    temporaire ← a    // Sauvegarde de a
    a ← b             // Transfert de b vers a
    b ← temporaire    // Restauration de a dans b
    
    // 🎯 Affichage après inversion
    ECRIRE "APRÈS : a =", a, ", b =", b
FIN PROGRAMME

🧪 Analogie des trois verres :

Verre A = Orange, Verre B = Pomme, Verre T = Temporaire
T ← A  (sauvegarde Orange)
A ← B  (Pomme va dans Orange)  
B ← T  (Orange va dans Pomme)

Algorithme d'échange avec variable temporaire:

ÉTAPE 1 : temporaire = a
ÉTAPE 2 : a = b  
ÉTAPE 3 : b = temporaire
Analogie des trois verres :

Verre A = orange, Verre B = pomme, Verre T = temporaire :

T ← A (sauvegarde orange)
A ← B (pomme va dans orange)
B ← T (orange va dans pomme)

En code Java :

int temp = a;
a = b;
b = temp;

⚠️ Pourquoi ça marche pas sans temporaire : a = b puis b = a donne a = b et b = b → perte de la valeur originale !
