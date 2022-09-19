package minifacebook;

public class DateNaissance {
    int jour;
    int mois;
    int annee; 
    
    DateNaissance(){
        jour=23;
        mois=06;
        annee=1912;
        
    } 
    DateNaissance(int jour, int mois, int annee){

      
        if(mois<=0 || mois >12){
            setMois(1);
        }else{
            setMois(mois);
        }

        setAnnee(annee);

        if(jour<1 || jour >31 ){
            setJour(1);
        }else{
            setJour(jour);
        }

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

        if(jour > 31 || jour <1){
            System.out.println("Saisie incorrecte.");
            this.jour=1;
            

            //année bisextile
        }else if ((annee%4 == 0 && annee %100 !=0) || annee % 400 ==0){
            if(mois == 2 && jour<= 29 ){
                this.jour=jour;
            }
            else if(mois ==4 || mois == 6 || mois == 9 || mois == 11){
                if(jour <31 ){
                    this.jour=jour;
                }else{
                    this.jour =1;
                }
            }
            else if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois== 8 || mois == 10 || mois == 12){
                if(jour <=31){
                    this.jour=jour;       
                }else{
                    this.jour =1;
                }
            }
        }
        else if(mois == 2 && jour <= 28){
            this.jour=jour;        }
        else if(mois ==4 || mois == 6 || mois == 9 || mois == 11){
            if(jour <31 ){
                this.jour=jour;
            }
        }
        else if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois== 8 || mois == 10 || mois == 12){
            if(jour <=31){
                this.jour=jour;       
            }
        }
        else {
            this.jour=1; 
        }
    }


    public void setMois(int mois) {
        if(mois == 0){
            this.mois=1;
        }
        if(mois >=1 && mois <=12){
            this.mois = mois;
        }else{
            System.out.println("Le mois saisis n'éxiste pas.");
            this.mois=1;
        }
    }
    public void setAnnee(int annee) {
        if(annee > 0 && annee < 2015){
            this.annee = annee;
        }else{
            System.out.println("L'année saisie n'est pas réaliste");
        }
    }

    void ecritDate(){
        String s = Integer.toString(jour)+ "/" + Integer.toString(mois) + "/" + Integer.toString(annee);
        System.out.print(s);
    }

    int age() {
        int resultat;
        resultat = 2015 - getAnnee();
        return resultat;
    }
}
