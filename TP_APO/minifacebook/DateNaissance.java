package minifacebook;

public class DateNaissance {
    int jour;
    int mois;
    int annee; 
    DateNaissance(){
    } 
    DateNaissance(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
   } 

   //accesseur de date de naissance
   public int getJour() {
       return jour;
   }
   public int getMois() {
       return mois;
   }
   public int getAnnee() {
       return annee;
   }

   //modificateur de date de naissance 
    public void setJour(int jour) {
        this.jour = jour;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    void ecritDate(){
        String s;
        s = getJour()+ "/" + getMois() + "/" + getAnnee();
        System.out.println(s);
    }
}
