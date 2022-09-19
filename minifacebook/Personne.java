package minifacebook;

public class Personne{
    String nom;
    String prenom;
    DateNaissance dateDeNaissace; 
    Personne ami;
    Personne meilleurAmi;

    Personne(String nom,String prenom, DateNaissance dateDeNaissace){

        this.nom = nom; 
        this.prenom = prenom;
        this.dateDeNaissace = dateDeNaissace;
    }

    //accesseur de la calsse personne 
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public DateNaissance getDateDeNaissace() {
        return dateDeNaissace;
    }
    public Personne getAmi() {
        return ami;
    }
    public Personne getMeilleurAmi() {
        return meilleurAmi;
    }

    //modificateur de la classe personne
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateDeNaissace(DateNaissance dateDeNaissace) {
        this.dateDeNaissace = dateDeNaissace;
    }
    public void setAmi(Personne ami) {
        this.ami = ami;
    }
    public void setMeilleurAmi(Personne meilleurAmi) {
        this.meilleurAmi = meilleurAmi;
    }

    void ecritInfos(){
        System.out.println("-----------------------------------");
        System.out.println(getPrenom() + " " + getNom() );
        System.out.println("Né(e) le : " );
        dateDeNaissace.ecritDate();
        System.out.println("(" + dateDeNaissace.age() + " ans)");
        System.out.println("Meilleur ami : " + getMeilleurAmi().getPrenom() + " " + getMeilleurAmi().getNom());
        System.out.println("Ami : " + getAmi().getPrenom() + " " + getAmi().getNom());
        System.out.println("-----------------------------------");
    }
}