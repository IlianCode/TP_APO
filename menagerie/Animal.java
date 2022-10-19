package menagerie;

public abstract class Animal {
    protected String nom;
    
    public Animal(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    
    public abstract String cri();
}
