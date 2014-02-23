/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Parent extends Utilisateur {

    private String id_par;
    
    
    
    public Parent(){}

    public Parent(String id_par, String nom_par, String prenom_par, String pwd_par, int type_par) {

        this.id_par = id_par;

    }


    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parent other = (Parent) obj;
        if (this.id_par != other.id_par) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parent{" + "Nom " + super.getNom_util() + " Prenom " + super.getPrenom_util() + "}";
    }
}
