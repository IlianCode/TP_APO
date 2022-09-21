package apobanque;

/**
 * Le sujet pour compléter ces fichiers se trouve ici:
 * http://l3miagelw.free.fr/apogrenoble/tp03/compte.html
 */
public class Banque {

    // Nom de la banque
    String nom;

    // Liste des comptes clients
    CompteBancaire[] comptes;

    Banque(String nom, CompteBancaire[] comptes) {
    this.comptes = comptes;
    this.nom = nom;
    }

    String description() {
        String s; 
        s="";
        System.out.println("Banque : " + nom + "[avoir total : " + avoirTotal() + "]" );
        for (CompteBancaire compteBancaire : comptes) {
            s += " " + compteBancaire.infos() + "\n";
        }
        return s;
    }

    double avoirTotal() {
        double avoir;
        avoir =0;
        for (CompteBancaire compteBancaire : comptes) {
            avoir = avoir + compteBancaire.getSolde();
        }
        return avoir;
    }

    void afficheNumeroComptesDebitsPlanchers() {
        for (CompteBancaire compteBancaire : comptes) {
            if((compteBancaire.getDecouvertAutorise() - (2*compteBancaire.getDecouvertAutorise()) )== compteBancaire.getSolde()){
                System.out.println(compteBancaire.getNumero());
            }
        }
    }
}
