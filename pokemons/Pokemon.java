package pokemons;

// TODO Ecrire la classe Pokemon
// 
public abstract class Pokemon{
    private String nom;
    private double poids;

    public Pokemon(String nom, double poids){
        this.nom = nom;
        this.poids = poids;
    }

    public abstract double vitesse();

    @Override
    public String toString(){
        return "Je suis le pokemon"+ this.nom +"mon poids est de"+ getPoids()+"kg, ma vitesse est de";
    }

    protected double getPoids(){
        return poids;
    }
}