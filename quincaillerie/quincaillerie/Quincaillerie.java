package quincaillerie;

/*import clients.Civilite.java;
import clients.Entreprise;
import clients.Particulier;
*/
public class Quincaillerie {

    public static void main(String[] args) {
    /* TODO Question 3: Afficher les caractéristiques de pneu, chambre à air e, disque de jante et rayon
    */
        Piece pneu = new PieceDeBase("pneu", "004741", 12.5, 60, 2);
        //pneu.affiche();
        Piece chambreAir = new PieceDeBase("chambre à air", "004565", 4.0, 20, 2);
       // chambreAir.affiche();
        Piece disqueJante = new PieceDeBase("disque de jante", "001214", 4.5, 60, 2);
       // disqueJante.affiche();
        Piece rayon = new PieceDeBase("rayon", "004748", 1.0, 20, 1);
        //rayon.affiche();
        
//    Question 6: Afficher les fiches caractéristiques des 2 piièces composites jantes en kit et brouette en kit décrites dans l'énoncé.
        PieceCompositeEnKit jantesEnKit = new PieceCompositeEnKit("jantes en kit", "014541", 10);
        jantesEnKit.ajoute(disqueJante);
        jantesEnKit.ajoute(rayon);
        jantesEnKit.ajoute(rayon);
        jantesEnKit.ajoute(rayon);

        jantesEnKit.affiche();

    /*Question 14: Afficher les fiches caractéristiques des 2 piièces composites jantes montée et brouette montée décrites dans l'énoncé.
 Question 27: Ajouter un client particulier et une entreprise et afficher le résultat.*/
    }
}
