package pokemons;

// TODO Complétez la classe PokemonTerrestre
// 

public abstract class PokemonTerrestre extends Pokemon{
    private int pattes;
    private double taille;

    public PokemonTerrestre(String nom, double poids, int pattes, double taille){
        super(nom, poids);
        this.pattes = pattes;
        this.taille = taille;
    }

    @Override 
    public double vitesse(){
        return pattes*taille*3;
    }
    
    @Override
    public String toString(){
        return super.toString() + vitesse() + " km/h, j'ai " + pattes + " pattes, ma taille est de " + taille + "m,";
    }
}