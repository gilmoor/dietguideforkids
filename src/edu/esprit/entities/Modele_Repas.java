/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Modele_Repas {
    
    private int id_repas ;
    private String nom_repas ;

    public Modele_Repas() {
    }

    public int getId_repas() {
        return id_repas;
    }

    public void setId_repas(int id_repas) {
        this.id_repas = id_repas;
    }

    public String getNom_repas() {
        return nom_repas;
    }

    public void setNom_repas(String nom_repas) {
        this.nom_repas = nom_repas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id_repas;
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
        final Modele_Repas other = (Modele_Repas) obj;
        if (this.id_repas != other.id_repas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_Repas{" + "id_repas=" + id_repas + ", nom_repas=" + nom_repas + '}';
    }
    
    
    
}
