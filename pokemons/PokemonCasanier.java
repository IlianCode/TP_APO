package pokemons;

// TODO Ecrire la classe PokemonTerrestre.
// 
public class PokemonCasanier extends PokemonTerrestre{
    private double nbHTele;

    public PokemonCasanier(String nom, double poids, int pattes, double taille, double nbHTele){
        super(nom, poids, pattes, taille);
        this.nbHTele = nbHTele;
    }

    @Override
    public String toString() {
        return super.toString() + "je regarde la télé " + nbHTele + "h par jour";
    }

}