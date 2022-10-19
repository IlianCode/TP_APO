package quincaillerie;

// TODO Question 5: écrire la classe PieceCompositeEnKit.
// 
public class PieceCompositeEnKit extends PieceComposite{
    protected int dureeMontage;

    public PieceCompositeEnKit(String nom, String reference, int dureeMontage) {
        super(nom, reference);
        this.dureeMontage = dureeMontage;
    }

    protected void setReference(String reference){
        this.reference = reference;
    }

    @Override
    public double prix(){
        double res = 0;
        for(Piece piece : liste){
            res += piece.prix();
        }
        return res;
    }

    @Override
    public int dureeGarantie(){
        return dureeGarantieDeBase()/2;
    }

    @Override
    public void affiche(){
        System.out.println(toString());
    }
}