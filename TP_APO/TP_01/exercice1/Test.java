package exercice1;

public class Test {
    public static void main(String[] args) {
        Incrementeur menteur = new Incrementeur();
 
        int x = 1;
        System.out.println("x (main)= " + x);
 
        menteur.incremente(x);
        System.out.println("x (main)= " + x);
    }
}