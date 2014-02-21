/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author sahli
 */
public class Repas {
    private int id_repas;
    private  String nom_repas ;
    private int id_menu;
public Repas (){

    
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

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    @Override
    public String toString() {
        return "Repas{" + "id=" + id_repas + ", nom repas=" + nom_repas + ", id menu=" + id_menu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id_repas;
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
        final Repas other = (Repas) obj;
        if (this.id_repas != other.id_repas) {
            return false;
        }
        return true;
    }
    
    
}

