package quincaillerie;

public class PieceDeBase extends Piece{
    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;

    public PieceDeBase(String nom, String reference, double prix, int dureeGarantie, int dureeFabrication){
        super(nom, reference);
        this.prix = prix;
        this.dureeGarantie = dureeGarantie;
        this.dureeFabrication = dureeFabrication;
    }

    @Override
    protected void setReference(String reference){
        this.reference = reference;
    }

    @Override
    public void affiche(){
        System.out.println(toString());
    }
    
    @Override
    public double prix(){
        return prix;
    }

    @Override
    public int dureeGarantie(){
        return dureeGarantie;
    }

    @Override
    public int dureeGarantieDeBase(){
        return dureeGarantie;
    }

    @Override
    public int dureeFabrication(){
        return dureeFabrication;
    }
}
