/*
 * Copyright (C) 2020 Yvan Maillot <yvan.maillot@uha.fr>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.uha.miage.horaire;

import edu.uha.miage.exceptions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Une classe horaire pour gérer des horaires (heures, minutes, secondes).
 *
 * La responsabilité de cette classe est de garantir un horaire cohérent,
 *
 * c'est-à-dire
 *
 * 1. dont les heures sont dans [0, 23]
 *
 * 2. dont les secondes sont dans [0, 59]
 *
 * 3. dont les minutes sont dans [0, 59]
 *
 * @author Yvan Maillot <yvan.maillot@uha.fr>
 */
public class Horaire {

    private int heures, minutes, secondes;

    /**
     * TODO 1.02 Ecrire le constructeur qui construit un nouvel horaire à partir
     * des arguments h m et s.
     *
     * @param h les heures de cet horaire. Les heures correctes sont dans [0,
     * 23]
     *
     * @param m les minutes de cet horaire. Les minutes correctes sont dans [0,
     * 59]
     *
     * @param s les secondes de cet horaire. Les secondes correctes sont dans
     * [0, 59]
     *
     * @throws edu.uha.miage.exceptions.BadHoraireException si l'horaire donnée
     * est incorrect.
     */

    public Horaire(int h, int m, int s) throws BadHoraireException   {
        if (h < 0 || h > 23) {
            throw new BadHoraireException("Heures incorrectes");
        }
        if (m < 0 || m > 59) {
            throw new BadHoraireException("Minutes incorrectes");
        }
        if (s < 0 || s > 59) {
            throw new BadHoraireException("Secondes incorrectes");
        }
        heures = h;
        minutes = m;
        secondes = s;
    }

    /**
     * TODO 1.03. Ecrire le constructeur qui construit un nouvel horaire à
     * partir des arguments h et m (les secondes sont nulles).
     *
     * @param h les heures de cet horaire. Les heures correctes sont dans [0,
     * 23]
     *
     * @param m les minutes de cet horaire. Les minutes correctes sont dans [0,
     * 59]
     *
     * @throws edu.uha.miage.exceptions.BadHoraireException si l'horaire donnée
     * est incorrect.
     */
    public Horaire(int h, int m) throws BadHoraireException {
        if(h < 0 || h > 23) {
            throw new BadHoraireException("Heures incorrectes");
        }
        if(m < 0 || m > 59) {
            throw new BadHoraireException("Minutes incorrectes");
        }
        setHeures(h);
        setMinutes(m);
        setSecondes(0);
    }
    /**
     * TODO 1.04. Ecrire le constructeur qui construit un nouvel horaire à
     * partir d'un seul argument : l'heure (les secondes et les minutes sont nulles).
     *
     * @param h les heures de cet horaire. Les heures correctes sont dans [0,
     * 23]
     *
     * @throws edu.uha.miage.exceptions.BadHoraireException si l'horaire donnée
     * est incorrect.
     */
    public Horaire(int h) throws BadHoraireException {
        if(h < 0 || h > 23) {
            throw new BadHoraireException("Heures incorrectes");
        }
        heures = h;
        
    }
    /**
     * TODO 1.05. Ecrire le constructeur par défaut qui construit l'horaire
     * 00:00:00.
     */
    public Horaire() {
        heures = 0;
        minutes = 0;
        secondes = 0;
    }
    /**
     * @return les heures de cet horaire
     */
    public int getHeures() {
        return heures;
    }

    /**
     * @return les minutes de cet horaire
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @return les secondes de cet horaire
     */
    public int getSecondes() {
        return secondes;
    }

    /**
     * Retourne un horaire sous la forme d'une chaîne de caractères sous la
     * forme "hh:mm:ss" où hh, mm, ss sont les heures, les minutes et les
     * secondes sur deux chiffres.
     *
     * Par exemple "00:00:00", "02:33:59"
     *
     * @return un horaire de la forme "hh:mm:ss"
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }

    /**
     * Augmente cet horaire d'une heure.
     */
    public void uneHeureDePlus() {
        ++heures;
        if (heures > 23) {
            heures = 0;
        }
    }

    /**
     * Augmente cet horaire d'une minute.
     */
    public void uneMinuteDePlus() {
        ++minutes;
        if (minutes > 59) {
            minutes = 0;
            uneHeureDePlus();
        }
    }

    /**
     * Augmente cet horaire d'une seconde.
     */
    public void uneSecondeDePlus() {
        ++secondes;
        if (secondes > 59) {
            secondes = 0;
            uneMinuteDePlus();
        }
    }
    // 
    // 
    // 
    // 
    // TODO 1.06. Écrire les setters pour les heures, les minutes et les secondes
    // 
    public void setHeures(int h) throws BadHoraireException {
        if(h < 0 || h > 23) {
            throw new BadHoraireException("Heures incorrectes");
        }
        this.heures = h;
    }
    public void setMinutes(int m) throws BadHoraireException {
        if(m < 0 || m > 59) {
            throw new BadHoraireException("Minutes incorrectes");
        }
        minutes = m;
    }
    public void setSecondes(int s) throws BadHoraireException {
        if(s < 0 || s > 59) {
            throw new BadHoraireException("Secondes incorrectes");
        }
        secondes = s;
    }
    /* TODO 1.07 Méthode publique de classe qui retourne un horaire à partir
		d'une chaîne de caractères selon le principe suivant :
		
		Un horaire peut s'écrire sous la forme <hh:mm> ou encore <hh:mm:ss> où
		<hh> sont les heures, <mm> les minutes et <ss> les secondes
		qui valent 0 en cas d'absence.
		
		<hh> doit être une chaîne qui représente un entier dans [0,23]
		<mm> doit être une chaîne qui représente un entier dans [0,59]
		<ss> doit être une chaîne qui représente un entier dans [0,59]
		<hh>, <mm>, <ss> peuvent s'écrire avec 1 ou 2 chiffres, avec 
		un éventuel 0 devant.
		Par exemple,
		sont admis "02:25" "2:25" "2:2" "12:25:02" "15:00:00" "0:0:0"
		Ne sont pas admis : "25:00" "2h2" "13:45:62"
		*/
    // 

    public void of(String horaire) throws BadHoraireException {
        String[] tab = horaire.split(":");

        if(tab.length == 2){
            setHeures(Integer.parseInt(tab[0]));
            setMinutes(Integer.parseInt(tab[1]));
            setSecondes(0);
        }
        else if(tab.length == 3){
            setHeures(Integer.parseInt(tab[0]));
            setMinutes(Integer.parseInt(tab[1]));
            setSecondes(Integer.parseInt(tab[2]));
        }
        else{
            throw new BadHoraireException("Format incorrect");
        }
    }
}
