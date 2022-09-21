package recherchePatient;

public class ServiceCHU {
    String[] patients;
    int[] années;

    ServiceCHU(String[] patients, int[] annees){
        this.patients = patients.clone();
        this.années = annees.clone();
    }

    boolean estPatient(String nom){
        boolean res;
        res = false; 

        for (String p : patients) {
            if(p.equals(nom)){
                res= true;
            }
        }
        return res;
    }

    int getAnnee(String nom){

        int annee = -1; 
        for (int i=0; i < patients.length ; i++){
            if(patients[i].equals(nom)){
                annee= années[i];
            }
        }

        return annee;
    }

    String[] getGeneration(int a1, int a2){
        String[] res = new String[patients.length];
        int cpt;
        cpt=0;
        for(int i = 0; i <années.length; i++){
            if(a1 < années[i] && années[i] <=a2){
                res[cpt] = patients[i];
                cpt++;
            }
        }
        return res;
    }
}
