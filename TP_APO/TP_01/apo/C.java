package apo;

public class C {
    double a; 
    double b;
    double c;

    public C(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void m(C c){
        c.a =this.a + c.a;
        c.b =this.b + c.b;
        c.c =this.c + c.c;
    }
    boolean isEqual(C c) {
        if(c.a == this.a && c.b == this.b && c.c == this.c){
            return true;
        }else {
            return false;
        }
    }

    /**
     * L'objectif de ce lab est de compléter les 2 fichiers C.java et TestC.java.
     * Pour cela, téléchargez le document http://l3miagelw.free.fr/apogrenoble/ressources/diagAPO2JavaC.pdf
     * Faite défiler ce document page par page (ne pas faire glisser les pages, mais les supperposer les unes aux autres).
     * Il se dessine alors les étapes d'un diagramme APO (cf poly de cours chapitres I et II).
     * A partir de ce diagramme APO, complétez les fichiers C.java et la méthode main qui est dans le fichier TestC.java.
     */
    // 
}
