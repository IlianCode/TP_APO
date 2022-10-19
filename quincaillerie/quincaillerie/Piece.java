package quincaillerie;

public abstract class Piece{
    protected String nom;
    protected String reference;

    public Piece(String nom, String reference){
        this.nom = nom;
        this.reference = reference;
    }

    @Override
    public String toString(){
        return  "nom : " + nom + "\n" +
                "reference : " + reference + "\n" +
                "prix : " + prix() + " euros\n" +
                "garantie : " + dureeGarantie() + " mois\n" +
                "durée de fabrication : " + dureeFabrication() + " jour(s)\n";
    }    

    protected abstract void setReference(String reference);
    public abstract void affiche();
    public abstract double prix();
    public abstract int dureeGarantie();
    public abstract int dureeGarantieDeBase();
    public abstract int dureeFabrication();
}