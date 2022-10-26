package tests;
 
import bataille.Jeu;
 
public class TestJeu {
    public static void main(String[] args) {
        Jeu jeu = new Jeu("Pocker Face", "Eddy Moitou");
        jeu.printJeuDeCarte();
    }
}