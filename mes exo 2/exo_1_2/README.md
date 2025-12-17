📚 EXERCICE 1.2 - SPHÈRE : AIRE ET VOLUME

🎯 Objectif pédagogique:
Comprendre les variables, constantes et les opérations mathématiques de base.

🔍 Concept principal:
Variables et calculs mathématiques - Apprendre à stocker des données et effectuer des calculs précis.

🧮 Explication détaillée:
Une sphère est un objet géométrique parfait en 3D. Nous utilisons des formules mathématiques précises :

Aire = 4PIR² (surface externe)
Volume = (4/3)PIR³ (espace intérieur)

⚠️ Points d'attention:

Utiliser Math.PI pour une valeur précise de PI
Math.pow(rayon, 2) plutôt que rayon * rayon pour la précision
(4.0/3.0) au lieu de (4/3) pour éviter la division entière
🏗️ Architecture du code:
// 1. Importation des outils
// 2. Déclaration des variables  
// 3. Lecture de l'entrée utilisateur
// 4. Calculs mathématiques
// 5. Affichage des résultats


📝 PSEUDOCODE - TOUS LES EXERCICES

🧮 EXERCICE 1.2 - SPHÈRE : AIRE ET VOLUME:

DEBUT PROGRAMME Sphere
    // 📥 Phase de lecture
    ECRIRE "Veuillez saisir le rayon de la SPHERE"
    LIRE rayon
    
    // 🧮 Phase de calcul
    aire ← 4 × PI × rayon²
    volume ← (4 ÷ 3) × PI × rayon³
    
    // 📤 Phase d'affichage
    ECRIRE "La surface de la sphere est :", aire, "km2"
    ECRIRE "Son volume est de :", volume, "km3"

FIN PROGRAMME

🧮 EXERCICE 1.2 - SPHÈRE:

Formule de l'AIRE d'une sphère:

Aire = 4 × PI × R²
Explication :

PI  ≈ 3.14159 - rapport circonférence/diamètre
R² = R × R (rayon au carré)
4PIR² = surface totale de la sphère

En code Java :

aire = 4 * Math.PI * Math.pow(rayon, 2);
Formule du VOLUME d'une sphère
Volume = (4/3) × π × R³
Explication :

R³ = R × R × R (rayon au cube)
4/3 ≈ 1.3333 - constante pour les volumes sphériques
Formule d'Archimède (IIIe siècle av. J.-C.)
En code Java :

volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);
⚠️ Attention : (4.0/3.0) donne 1.3333, mais (4/3) donne 1 (division entière) !



