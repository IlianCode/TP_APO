package figures;

/**
 * Le sujet et les explications pour remplir ce fichier se trouvent
 * ici: http://l3miagelw.free.fr/apogrenoble/tp03/figuresSimples.html
 */
class DessinateurFigures {

    void rectangle(int largeur, int hauteur) {
        for(int i = 0; i<hauteur; i++){
            for (int j = 0; j<largeur; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    void triangleGauche(int hauteur) {
        for(int i =0; i<=hauteur; i++){
            for(int j =0; j!=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangleDroite(int hauteur) {
       for(int i =0; i<hauteur; i++){
            for(int j =hauteur-i; j>0; j--){
                System.out.print(" ");
            }
            for(int y =hauteur-1-i; y<hauteur; y++){
                System.out.print("*");
            }
            System.out.println();
       }
    }   

    
            

    void triangleIso(int hauteur) {
        for(int j =(hauteur/2)+2; j>0 ;j-- ){
            System.out.print(" ");
        }

        System.out.println("*");

        for(int i =1; i<hauteur; i++){
            for(int j =hauteur-1-i; j>0 ;j-- ){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int y =1; y<(hauteur*2)-3; y=y+2){
                System.out.print(" ");
            }
            System.out.println("*");





        }
    }
}
