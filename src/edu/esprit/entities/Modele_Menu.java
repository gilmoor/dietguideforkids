/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Modele_Menu {
    private int id_modele ;

    public int getId_modele() {
        return id_modele;
    }

    public void setId_modele(int id_modele) {
        this.id_modele = id_modele;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id_modele;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Modele_Menu other = (Modele_Menu) obj;
        if (this.id_modele != other.id_modele) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_Menu{" + "id_modele=" + id_modele + '}';
    }
    
    public Modele_Menu(){}
    
    
    
}
