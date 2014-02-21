/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author MOHAMED
 */
public class Modele_menu_journalier_categorie {
    private Modele_menu_journalier id_modele;
    private Categorie id_categorie;
    
    public Modele_menu_journalier_categorie()
    {
        
    }

    public Modele_menu_journalier getId_modele() {
        return id_modele;
    }

    public void setId_modele(Modele_menu_journalier id_modele) {
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
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id_modele);
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
        final Modele_menu_journalier_categorie other = (Modele_menu_journalier_categorie) obj;
        if (!Objects.equals(this.id_modele, other.id_modele)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_menu_journalier_categorie{" + "id_modele=" + id_modele + ", id_categorie=" + id_categorie + '}';
    }
    
}
