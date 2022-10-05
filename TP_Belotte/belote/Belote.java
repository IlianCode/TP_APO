package belote;

public class Belote {

    Belote(String nomNord, String nomOuest, String nomSud, String nomEst) {
    // TODO Le constructeur de Belote initialise les attributs et détermine l'atout.
    }

    void distribue() {
    /* TODO la méthode distribue s'assure à chaque carte donnée à un joueur que les joueurs précédent n'ont pas la même.
La distribution se fait dans l'ordre du jeu: nord, ouest, sud et est.*/
    }

    Carte joueurJoue(String nomJoueur) {
        return null;
    // TODO renvoie la carte du joueur dont le nom est passé en paramètre.
    }

    Joueur gagnant() {
        return null;
    /* TODO Détermine et renvoie le gagnant du tour.
Donne également les points (méthode remporter) aux 2 joueurs de l'équipe du gagnant.*/
    }

    void changeAtout() {
    // TODO Choisi l'atout au hasard parmi les couleurs possibles.
    }

    Joueur remporte(Joueur joueur1, Joueur joueur2) {
        return null;
    // TODO Détermine parmi les joueurs en paramètre, lequel remporte a la carte la plus forte en tenant compte de l'atout et de la carte demmandée.
    }

    int points() {
        return 0;
    // TODO Retourne le nombre de points dans le pli total (les 4 cartes jouées) en tenant compte de l'atout.
    }

    String mains() {
        String s;
        s = "<html>";
        s += "La couleur d'atout est " + atout.getNom() + "<br/>";
        s += "La couleur demandée est " + joueurNord.carte.couleur.getNom() + "<br/>";
        s += "Le joueur nord  " + joueurNord.nom + " a un(e) " + joueurNord.carte.toString() + "<br/>";
        s += "Le joueur est   " + joueurEst.nom + " a un(e) " + joueurEst.carte.toString() + "<br/>";
        s += "Le joueur sud   " + joueurSud.nom + " a un(e) " + joueurSud.carte.toString() + "<br/>";
        s += "Le joueur ouest " + joueurOuest.nom + " a un(e) " + joueurOuest.carte.toString() + "<br/>";
        s += "</html>";
        System.out.println(s);
        return s;
    }
    // TODO Déclarez les attributs.
    // 
}
