package quincaillerie;

import java.util.ArrayList;

// TODO Question 4: écrire la classe PieceComposite.
// 
public abstract class PieceComposite extends Piece{
    protected ArrayList<Piece> liste;

    public PieceComposite(String nom, String reference) {
        super(nom, reference);
    }

    public void ajoute(Piece piece){
        liste.add(piece);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int dureeGarantieDeBase() {
        int res; 
        res = liste.get(0).dureeGarantieDeBase();
        for(Piece piece : liste){
            if(piece.dureeGarantieDeBase() < res){
                res = piece.dureeGarantieDeBase();
            }
        }
        return res/2;
    }

    @Override
    public int dureeFabrication() {
        int res; 
        res = liste.get(0).dureeFabrication();
        for(Piece piece : liste){
            if(piece.dureeFabrication() > res){
                res = piece.dureeFabrication();
            }
        }
        
        return res;
    }
}
