/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Administrateur extends Utilisateur {

    private String id_ad;
    
    public Administrateur(){}

    public Administrateur(String id_ad, String nom_ad, String prenom_ad, String pwd_ad, int type_ad) {

        this.id_ad = id_ad;


    }

    
    @Override
     public String getId() {
        return this.id_ad;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrateur other = (Administrateur) obj;
        if (this.id_ad != other.id_ad) {
            return false;
        }
        return true;


    }

    @Override
    public String toString() {
        return "Administrateur{" + "Nom " + super.getNom_util() + " Prenom " + super.getPrenom_util() + "}";
    }
}
