/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
package edu.uha.miage;

/**
 * Une classe horaire pour gérer des horaires (heures, minutes, secondes).
 *
 * Les horaires appartiennent à l'un des deux formats 24h ou 12h
 *
 * Le format 24h signifie que les heures sont dans [0, 23] Le format 12h
 * signifie que les heures sont dans [0, 11]
 *
 * La responsabilité de cette classe est de garantir un horaire cohérent,
 *
 * c'est-à-dire
 *
 * 1. dont les secondes sont dans [0, 59]
 *
 * 2. dont les minutes sont dans [0, 59]
 *
 * 2. dont les heures sont dans [0, 11] au format 12h ou dans [0,23] au format
 * 24h
 *
 * @author yvan
 */
public class Horaire {
    private boolean h24;
    private int h;
    private int m;
    private int s;
    /**
     * Construit un nouvel horaire à partir des arguments.
     *
     * @param h24 vrai => format 24h, faux => format 12h
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     *
     * @param m les minutes de cet horaire. Si m n'est pas dans [0, 59], il est
     * considéré égal à 0.
     *
     * @param s les secondes de cet horaire. Si s n'est pas dans [0, 59], il est
     * considéré égal à 0.
     */

    public Horaire(boolean h24, int h, int m, int s) {
    // TODO 1.02. Écrire ce constructeur
        this.h24= h24;
        if(h24){
            if((h >= 0) && (h<= 23)){
                this.h = h;
            }else{
                this.h = 0;
            }
        }else{
            if((h>11)&&(h<=23)){
                this.h = h-12;
            }else if((h>= 0) && (h<=11)){
                this.h = h;
            }else {
                this.h = 0;
            }
        }

        if((m>= 0) && (m<= 59)){
            this.m = m;
        }else {
            this.m = 0;
        }
        if((s>=0)&&(s<= 59)){
            this.s = s;          
        }else{
            this.s = 0;          
        }

    }

    /**
     * Construit un nouvel horaire à partir des arguments (les secondes sont
     * nulles).
     *
     * @param h24 vrai => format 24h, faux => format 12h
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     *
     * @param m les minutes de cet horaire. Si m n'est pas dans [0, 59], il est
     * considéré égal à 0.
     */
    public Horaire(boolean h24, int h, int m) {
    // TODO 1.03. Écrire ce constructeur
        this(h24 ,h, m, 0);
        
    }

    /**
     * Construit un nouvel horaire à partir des arguments (les secondes et les
     * minutes sont nulles).
     *
     * @param h24 vrai => format 24h, faux => format 12h
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     */
    public Horaire(boolean h24, int h) {
    // TODO 1.04. Écrire ce constructeur
        this(h24,h, 0, 0);

    } 

    /**
     * Construit l'horaire 00:00:00 au format 24h ou 12h.
     *
     * @param h24 vrai => format 24h, faux => format 12h
     */
    public Horaire(boolean h24) {
    // TODO 1.05. Écrire ce constructeur
        this(h24, 0,0,0);

    }

    /**
     * Construit un nouvel horaire au format 24h à partir des arguments.
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     *
     * @param m les minutes de cet horaire. Si m n'est pas dans [0, 59], il est
     * considéré égal à 0.
     *
     * @param s les secondes de cet horaire. Si s n'est pas dans [0, 59], il est
     * considéré égal à 0.
     */
    public Horaire(int h, int m, int s) {
    // TODO 1.06. Écrire ce constructeur
        this(true, h,m,s);
    }

    /**
     * Construit un nouvel horaire au format 24h à partir des arguments (les
     * secondes sont nulles).
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     *
     * @param m les minutes de cet horaire. Si m n'est pas dans [0, 59], il est
     * considéré égal à 0.
     */
    public Horaire(int h, int m) {
    // TODO 1.07. Écrire ce constructeur
        this(true,h,m,0);
    }

    /**
     * Construit un nouvel horaire au format 24h à partir des arguments (les
     * secondes et les minutes sont nulles).
     *
     * @param h les heures de cet horaire. Si h n'est pas dans l'intervalle
     * requis, il est considéré égal à 0.
     */
    public Horaire(int h) {
        this(true,h,0,0);
    }

    /**
     * Construit l'horaire 00:00:00 au format 24h .
     */
    public Horaire() {
    // TODO 1.09. Écrire ce constructeur
         this(true,0,0,0);
    }

    /**
     * @return les heures de cet horaire
     */
    public int getHeures() {
        return this.h;
    }

    /**
     * @return les minutes de cet horaire
     */
    public int getMinutes() {
        return this.m;
    // TODO 1.11. Écrire ce getter
    }

    /**
     * @return les secondes de cet horaire
     */
    public int getSecondes() {
        return this.s;
    // TODO 1.12. Écrire ce getter
    }

    /**
     * @return vrai si format 24h, faux sinon.
     */
    public boolean isH24() {
        return this.h24;
    // TODO 1.13. Écrire ce getter
    }

    /**
     * Met à jour les heures
     * @param heures les heures du nouvel horaire
     */
    public void setHeures(int heures) {
        if(h24){
            if((heures >= 0)&& (heures <=23)){
                this.h =heures;
            }
        }else {
            if((heures >= 0)&& (heures <=11)){
                this.h =heures;
    
            }
        }
        
    }

    /**
     * Met à jour les minutes
     * @param minutes les minutes du nouvel horaire
     */
    public void setMinutes(int minutes) {
        if((minutes >= 0)&& (minutes <=59)){
            this.m =minutes;
        }
    // TODO 1.15. Écrire ce setter
    }

    /**
     * Met à jour les secondes
     * @param secondes les secondes du nouvel horaire
     */
    public void setSecondes(int secondes) {
    // TODO 1.16. Écrire ce setter
        if((secondes >= 0)&& (secondes <=59)){
            this.s =secondes;
        }
    }

    /**
     * Met à jour le format 24h ou 12h
     *
     * @param h24 vrai => format 24h , faux sinon.
     */
    public void setH24(boolean h24) {
        if(h24 == false){
            this.h24 = h24;
            if(this.h >=12){
                this.h -=12;

            }
        }
        else{
            this.h24 = h24;

        }
    // TODO 1.17. Écrire ce setter
    }

    /**
     * Retourne un horaire sous la forme d'une chaîne de caractères sous la
     * forme "hh:mm:ss" où hh, mm, ss sont les heures, les minutes et les
     * secondes sur deux chiffres.
     *
     * Par exemple "00:00:00", "02:33:59"
     *
     * Conseil : lire la javadoc de String.format() :
     * https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
     *
     * @return un horaire de la forme "hh:mm:ss"
     */
    @Override
    public String toString() {
        String y="";
        
        if(h < 10 ){
            y+= "0" + h +":";
        }else{
            y+= "" +h+":";
        }
        if(m < 10 ){
            y+= "0" + m +":";
        }else{
            y+= "" +m+":";
        }
        if(s < 10 ){
            y+= "0" + s;
        }else{
            y+= "" +s;
        }


        
        
        return y;
    // TODO 1.18. Écrire toString()
    }

    /**
     * Augmente cet horaire d'une heure.
     */
    public void uneHeureDePlus() {
    // TODO 1.19. Écrire uneHeureDePlus()
        if(h24){
            if(h<23){
                this.setHeures(h+1);
            }else if(h==23){
                this.setHeures(0);
            }
        }else {
            if(h<11){
                this.setHeures(h+1);
            }else if(h==11){
                this.setHeures(0);
            }
        }
        
    }
    
    /**
     * Augmente cet horaire d'une minute.
     */
    public void uneMinuteDePlus() {
    // TODO 1.20. Écrire uneMinuteDePlus()
        
            if(this.m<59){
                this.setMinutes(m+1);
            }else if(m==59){
                this.setMinutes(0);
                uneHeureDePlus();
                
            }
        
    }

    /**
     * Augmente cet horaire d'une seconde.
     */
    public void uneSecondeDePlus() {
    // TODO 1.21. Écrire uneSecondeDePlus()
        if(this.s<59){
            this.setSecondes(s+1);
        }else if(this.s==59){
            this.setSecondes(0);
            uneMinuteDePlus();
        }
    }
    // TODO 1.01. Déclarer les attributs utiles à votre classe.
    // 
}
