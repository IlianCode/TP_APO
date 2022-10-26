package bataille;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Joueur {
    
    private String nom;
    private Deque<Carte> tas;

    public Joueur(String nom) {
        this.nom = nom;
        tas = new ArrayDeque<Carte>();
    }

    public String getNom() {
        return nom;
    
    }

    //retourne le nombre de Carte dans le tas
    public int nbCartes() {
        return tas.size();
    }
    //liste les elements du tas
    public void printTas(){
        System.out.println(" --- Tas du joueur: "+getNom() +" ---");
        for(Carte carte : tas){
            System.out.println(carte.toString());
        }
    }

    //methode pour ajouter une carte a la fin du tas
    public void remporte(Carte carte ){
        tas.addLast(carte);
    }
    //methode pour ajouter une collection de carte à la fin du tas 
    public void remporte(List<Carte> cartes){
        for(Carte carte : cartes){
            remporte(carte);
        }
    }

    //methode pour jouer une carte, renvoie la carte jouee et la supprime du tas
    public Carte joue(){
        Carte premiere = tas.getFirst();
        tas.removeFirst();
        return premiere;
    }
    
    //setteur nom
    public void setNom(String nom) {
        this.nom = nom;
    }


}

