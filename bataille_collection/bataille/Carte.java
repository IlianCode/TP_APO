package bataille;
public class Carte implements Comparable {
    private Valeur valeur; 
    private Couleur couleur;

    //constructeur de la classe Carte
    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    //retourne l'emplacement de l'image de la carte
    public String getFileName(){
        String s;
        s =   valeur.toString().toLowerCase() +"-de-" + couleur.toString().toLowerCase() + ".png";
        return s; 
    }

    //reecriture de la fonction toString
    public String toString(){
        return valeur.toString() + " de " + couleur.toString();
    }

    boolean equals(Carte carte){
        boolean res;
        res = false;

        if(valeur.equals(carte.valeur) && couleur.equals(carte.couleur)){
            res = true;
        }

        return res;
    }

    @Override
    public int compareTo(Carte carte) {
        int valParam =0;
        int valThis =0;
        int res;
        switch(carte.valeur.getNom()){
            case "as":
                valParam = 14;
                break;
            case "roi":
                valParam = 13;
                break;
            case "dame":
                valParam = 12;
                break;
            case "valet":
                valParam = 11;
                break;
            case "dix":
                valParam = 10;
                break;
            case "neuf":
                valParam = 9;
                break;
            case "huit":
                valParam = 8;
                break;
            case "sept":
                valParam = 7;
                break;
        }

        switch(this.valeur.getNom()){
            case "as":
                valThis = 14;
                break;
            case "roi":
                valThis = 13;
                break;
            case "dame":
                valThis = 12;
                break;
            case "valet":
                valThis = 11;
                break;
            case "dix":
                valThis = 10;
                break;
            case "neuf":
                valThis = 9;
                break;
            case "huit":
                valThis = 8;
                break;
            case "sept":
                valThis = 7;
                break;
        }
        if(valThis > valParam){
            res = 1;
        }else if(valThis < valParam){
            res = -1;
        }else{
            res = 0;
        }

        return res;
    }

    
}
