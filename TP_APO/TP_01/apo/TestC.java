package apo;

public class TestC {
    
    /**
     * L'objectif de ce lab est de compléter les 2 fichiers C.java et TestC.java.
     * Pour cela, téléchargez le document http://l3miagelw.free.fr/apogrenoble/ressources/diagAPO2JavaC.pdf
     * Faite défiler ce document page par page (ne pas faire glisser les pages, mais les supperposer les unes aux autres).
     * Il se dessine alors les étapes d'un diagramme APO (cf poly de cours chapitres I et II).
     * A partir de ce diagramme APO, complétez les fichiers C.java et la méthode main qui est dans le fichier TestC.java.
     */
    
    public static void main(String[] args) {
        C c1 = new C(4.5, 8.2, 7.3);
        
        C c2 = new C(5.5, 1.8, 2.7);

        c2.m(c1);
        
        C c3 = new C(10.0, 10.0, 10.0);
        C c4 = c1;
        
        boolean c1Equalsc3 = c1 == c3;
        boolean c1Equalsc4 = c1 == c4;
        boolean c3Equalsc4 = c3 == c4;

        System.out.println("c1 == c3 ? -> " + c1Equalsc3);
        System.out.println("c1 == c4 ? -> " + c1Equalsc4);
        System.out.println("c3 == c4 ? -> " + c3Equalsc4);

        c1Equalsc3 = c1.isEqual(c3);
        c1Equalsc4 = c1.isEqual(c4);
        c3Equalsc4 = c3.isEqual(c4);
        
        System.out.println("c1.isEqual(c3) ? -> " + c1Equalsc3);
System.out.println("c1.isEqual(c4) ? -> " + c1Equalsc4);
System.out.println("c3.isEqual(c4) ? -> " + c3Equalsc4);
    }
}

