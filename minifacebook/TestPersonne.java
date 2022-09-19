package minifacebook;

public class TestPersonne {

    public static void main(String[] args) {
        DateNaissance naissancePatty = new DateNaissance(10, 05, 1968);
        Personne patty = new Personne("Bullaire", "Patty", naissancePatty);
        DateNaissance naissanceJack = new DateNaissance();
        Personne jack = new Personne("Pottes", "Jacques", naissanceJack);
        
		patty.setAmi(jack);
		patty.setMeilleurAmi(jack);
		 
		jack.setAmi(patty);
		jack.setMeilleurAmi(patty);
		
        patty.ecritInfos();
        jack.ecritInfos();
    }
}
