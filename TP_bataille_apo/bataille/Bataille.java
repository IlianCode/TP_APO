package bataille;

/* TODO Écrivez la classe Bataille
0-Attributs: suivre à la lettre les indications du diagramme UML de classes
1- Constructeur:		en plus d'initialiser les attributs, ici, le constructeur distribue une carte à chaque joueur.
2- Méthode distribue:
		donne une carte à chaque joueur. Attention, cette méthode doit vérifier que les joueurs		n'ont pas la même carte: elle re-tire une carte au hasard, tant que les 2 cartes sont les même.
3- Méthode gangnant:
		Renvoie la référence vers le joueur qui a la carte de plus haute valeur. Renvoie null s'il y a bataille.
		Tip: Pour récupérer la valeur (ordre dans lequel est classé une constante dans une énumération), vous pouvez			utiliser enum.ordinal où enum est une référence vers une valeur d'énumération.
*/
// 

public class Bataille{
	Joueur joueurGauche;
	Joueur joueurDroite;
	

	Bataille(){
		joueurGauche =new Joueur();
		joueurDroite = new Joueur();

		Carte carteGauche =new Carte();
		Carte carteDroite=new Carte();
		joueurGauche.donnerCarte(carteGauche);
		joueurDroite.donnerCarte(carteDroite);
	}

	Bataille(String nomGauche, String nomDroite){
		joueurGauche =new Joueur();
		joueurDroite = new Joueur();

		joueurGauche.nom =nomGauche;
		joueurDroite.nom = nomDroite;

		Carte carteGauche =new Carte();
		Carte carteDroite=new Carte();
		joueurGauche.donnerCarte(carteGauche);
		joueurDroite.donnerCarte(carteDroite);
	}
	Joueur gagnant(){
		Joueur res; 
		res = joueurDroite;
		int valDroite ;
		int valGauche;
		switch(joueurDroite.carte.valeur.getNom()){
			case "sept": valDroite =1;
			break;
			case "huit": valDroite =2;
			break;
			case "neuf": valDroite =3;
			break;
			case "dix": valDroite =4;
			break;
			case "valet": valDroite =5;
			break;
			case "dame": valDroite =6;
			break;
			case "roi": valDroite =7;
			break;
			default: valDroite =8;
			break;
		}
		

		switch (joueurGauche.carte.valeur.getNom()){
			case "sept": valGauche =1;
			break;
			case "huit": valGauche =2;
			break;
			case "neuf": valGauche =3;
			break;
			case "dix": valGauche =4;
			break;
			case "valet": valGauche =5;
			break;
			case "dame": valGauche =6;
			break;
			case "roi": valGauche =7;
			break;
			default: valGauche =8;
			break;
		}
		if(valDroite < valGauche){
			res = joueurGauche;
		}else if(valDroite == valGauche){
			res= null;
		}

	
		return res; 
	}

	void distribue(){
		do{
			Carte carteGauche =new Carte();
			Carte carteDroite=new Carte();
			joueurGauche.carte = carteGauche;
			joueurDroite.carte = carteDroite;	
		}while (joueurDroite.carte.equals(joueurGauche.carte));
			
	}
}
