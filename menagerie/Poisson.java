package menagerie;

// TODO Question 7: Créez la classe Poisson...
// 
public class Poisson extends Animal {
    public Poisson(String nom) {
        super(nom);
    }
    
    @Override
    public String cri() {
        return "Gloup !";
    }
    /*@Override
    public String toString() {
        return "Je m'appelle " + getNom()+ " et je peux faire : " + cri();
    }*/
}