package bataille;

import java.util.*;

public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private TreeSet<Carte> jeuDeCartes = new TreeSet<Carte>();

    public Jeu(String nomJoueur1, String nomJoueur2) {
        initialiseJeuDeCartes();
        this.joueur1.setNom(nomJoueur1);
        this.joueur2.setNom(nomJoueur2);
    }

    //print du tas du joueur en parametre 
    public void printTasJoueur(int joueur){
        switch(joueur){
            case 1:
                joueur1.printTas();
                break;
            case 2:
                joueur2.printTas();
                break;
            default:
                System.out.println("Erreur, joueur inexistant");
                break;
        }
    }
    //print du nombre de carte dans le tas du joueur en parametre 
    public int getNbCartesJoueur(int joueur){
        switch(joueur){
            case 1:
                return joueur1.nbCartes();
            case 2:
                return joueur2.nbCartes();
            default:
                System.out.println("Erreur, joueur inexistant");
                return -1;
        }
    }
    //print du nom du joueur en parametre
    public String getNomJoueur(int joueur){
        switch(joueur){
            case 1:
                return joueur1.getNom();
            case 2:
                return joueur2.getNom();
            default:
                System.out.println("Erreur, joueur inexistant");
                return null;
        }
    }

    //methode pour initialiser le jeu de carte
    private void initialiseJeuDeCartes(){
        for(Couleur couleur : Couleur.values()){
            for(Valeur valeur : Valeur.values()){
                jeuDeCartes.add(new Carte(couleur, valeur));
            }
        }
    }

    //print le jeu de carte 
    public void printJeuDeCarte(){
        for(Carte carte : jeuDeCartes){
            System.out.println(carte.toString());
        }
    }
}
