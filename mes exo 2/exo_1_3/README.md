📐 EXERCICE 1.3 - SECTEUR CIRCULAIRE :

🎯 Objectif pédagogique
Application de formules mathématiques avec multiples variables.

🔍 Concept principal :

Variables multiples et formules complexes - Manipuler plusieurs données simultanément.

🧮 Explication détaillée :
Un secteur circulaire est comme une "part de pizza". Sa surface dépend de :

Rayon du cercle complet
Angle de la portion
Formule : (PI * R² * angle) / 360
Analogie : Aire complète × fraction d'angle = aire du secteur

💡 Insight pédagogique :

Comprendre que : πR² donne l'aire totale, (angle/360) donne la fraction représentée par le secteur.

🚀 Compétences développées :

Manipulation de variables doubles
Application de formules mathématiques
Compréhension des proportions



🍕 EXERCICE 1.3 - SECTEUR CIRCULAIRE :

DEBUT PROGRAMME SecteurCirculaire
    // 📥 Lecture des dimensions
    ECRIRE "Rayon du cercle :"
    LIRE rayon
    ECRIRE "Angle du secteur (degrés) :"
    LIRE angle
    
    // 🧮 Calcul de l'aire du secteur
    aire_secteur ← (π × rayon² × angle) ÷ 360
    
    // 📤 Affichage du résultat
    ECRIRE "Aire du secteur circulaire :", aire_secteur, "unités²"
    

🔍 Logique mathématique :

Aire_complète = PI × R²
Fraction_angle = angle ÷ 360
Aire_secteur = Aire_complète × Fraction_angle


🍕 EXERCICE 1.3 - SECTEUR CIRCULAIRE :

Formule de l'aire d'un secteur circulaire :

Aire_secteur = (π × R² × angle) / 360
Explication détaillée :

πR² = aire du cercle COMPLET :

angle/360 = fraction du cercle représentée par le secteur
Donc : Aire_complète × fraction_angle = Aire_secteur

En code Java :

aireSecteur = (Math.PI * Math.pow(rayon, 2) * angle) / 360.0;
Analogie : Comme calculer la part de pizza que vous mangez !


