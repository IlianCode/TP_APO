package recherchePatient;

public class TestRecherchePatient {

    public static void main(String[] args) {
    // TODO Complétez ici le main pour tester vos méthodes.
        String noms[] = {"RICOT Léa",
                 "HONXA Cécile",
                 "ORAQ Anne",
                 "KUZBIDON Alex",
                 "MUDA Albert"};
        int[] naissances = {1924, 1954, 1943, 1915, 1987};
        ServiceCHU s = new ServiceCHU(noms, naissances);


        String p = "HONXA Cécile";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
        }
        else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
        }
        
        p = "OINTOUSSA Cécile";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
        }
        else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
        }
        
        p = "MUDA Albert";
        if (s.estPatient(p)) {
            System.out.println(p + " est un(e) patient(e) du service.");
        }
        else {
            System.out.println(p + " n'est pas un(e) patient(e) du service.");
        }

        System.out.println(s.getAnnee("KUZBIDON Alex"));
        System.out.println(s.getAnnee("OINTOUSSA Cécile"));
        System.out.println(s.getAnnee("MUDA Albert"));
        
        System.out.println(s.getGeneration(1940, 1960));
}}
