package pokemons;

// TODO Ecrivez la classe PokemonSportif.
// 

public class PokemonSportif extends PokemonTerrestre{
    private double frequence;

    public PokemonSportif(String nom, double poids, int pattes, double taille, double frequence){
        super(nom, poids, pattes, taille);
        this.frequence = frequence;
    }

    @Override
    public String toString() {
        return super.toString() + "ma fréquence cardiaque est de " + frequence + " pulsation à la minute";
    }
}