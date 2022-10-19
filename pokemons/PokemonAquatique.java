package pokemons;

// TODO Ecrire la classe PokemonAquatique
// 

public abstract class PokemonAquatique extends Pokemon{
    private int nbNageoires;

    public PokemonAquatique(String nom, double poids, int nbNageoires){
        super(nom, poids);
        this.nbNageoires = nbNageoires;
    }
    
    @Override
    public double vitesse() {
        return getPoids()/25*nbNageoires;
    }

    @Override
    public String toString() {
        return super.toString() + vitesse() + "km/h, j'ai " + nbNageoires + " nageoires";
    }
}