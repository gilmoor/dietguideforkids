/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author AvBack
 */
public class Categorie_Modele_Menu {
    
    private Modele_Menu id_modele;
    private Categorie id_categorie;
    
    public Categorie_Modele_Menu(){}

    public Modele_Menu getId_modele() {
        return id_modele;
    }

    public void setId_modele(Modele_Menu id_modele) {
        this.id_modele = id_modele;
    }

    public Categorie getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(Categorie id_categorie) {
        this.id_categorie = id_categorie;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_modele);
        hash = 97 * hash + Objects.hashCode(this.id_categorie);
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
        final Categorie_Modele_Menu other = (Categorie_Modele_Menu) obj;
        if (!Objects.equals(this.id_modele, other.id_modele)) {
            return false;
        }
        if (!Objects.equals(this.id_categorie, other.id_categorie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categorie_Modele_Menu{" + "id_modele=" + id_modele + ", id_categorie=" + id_categorie + '}';
    }
    
    
    
}
