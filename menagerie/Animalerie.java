package menagerie;

public class Animalerie {

    public String getChenil() {
        String s ="";
    // TODO Créez un tableau de 3 animaux et renvoyez une chaîne de carractère qui contient ce qui est demandé dans l'énoncé. Contrainte: utilier un foreach...
        Animal animaux [] = new Animal[3];
        animaux[0] = new Poisson("Nemo");
        animaux[1] = new Chien("Medor");
        animaux[2] = new Chat("Tom");
        for (Animal animal : animaux) {
            s += animal.toString() ;
            if(!animal.getNom().equals("Tom")){
                s+="\n";
            }
        }
        return s;
    }



    public static void main(String[] args) {
        Animalerie an = new Animalerie();
        System.out.println(an.getChenil());
    }
}
