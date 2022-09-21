package apobanque;

/**
 * Le sujet pour compléter ces fichiers se trouve ici:
 * http://l3miagelw.free.fr/apogrenoble/tp03/compte.html
 */
class CompteBancaire {
    int numero;
    String client; 
    double solde; 
    double decouvertAutorise;

    CompteBancaire(){
        this.numero =0;
        this.client ="John Doe";
        this.solde=0;
        this.decouvertAutorise =0;
    }

    CompteBancaire(int numero, String client){
        this.numero = numero;
        this.client = client;
        this.solde = 100;
        this.decouvertAutorise =50;
    }
    
    CompteBancaire(int numero, String client, double solde){
        this.numero = numero; 
        this.client = client;
        this.solde = solde;
        this.decouvertAutorise = (solde/2);
    }


    void depot(double solde) {
        if(solde>0){
            this.solde += solde;
        }
    }
    boolean retrait(double x){
        boolean res;
        res = false; 
        if (x<0){
            res =false;
        }
        else if (x<= solde){
            this.solde -= x;
            res =true;
        }else if(x>solde){
            if (x <= solde + decouvertAutorise){
                this.solde -=x;
                res = true;
            }else if (x> solde+decouvertAutorise){
                this.solde -= (solde+decouvertAutorise);
                res = false;
            }
        }
        return res; 
    }

    boolean estADecouvert(){
        boolean res;
        res = false; 
         
        if(solde <0){
            res = true;
        }
        return res; 
    }

    int getNumero() {
        return numero;
    }
    String getClient() {
        return client;
    }
    double getSolde() {
        return solde;
    }
    double getDecouvertAutorise() {
        return decouvertAutorise;
    }
    String infos(){
        String s;
        s="";
        s+= "-----------------------------------------\n";
        s+="Client : " + getClient() +"\n";
        s+="Numéro du compte: " + getNumero()+"\n";
        if(solde<0){
            s+= "Solde débiteur: " + getSolde() + "\n";

        }else{
            s+= "Solde créditeur : " + getSolde() + "\n";

        }
        s+="Découvert autorisé : " + getDecouvertAutorise() +"\n";
        s+="-----------------------------------------";
        return s;
    }
}
