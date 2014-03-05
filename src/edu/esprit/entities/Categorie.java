/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Categorie {
    private int id_categorie ;
    private String intervalle_age;
    
    public Categorie(){}

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getIntervalle_age() {
        return intervalle_age;
    }

    public void setIntervalle_age(String intervalle_age) {
        this.intervalle_age = intervalle_age;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id_categorie;
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
        final Categorie other = (Categorie) obj;
        if (this.id_categorie != other.id_categorie) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id_categorie=" + id_categorie + ", intervalle_age=" + intervalle_age + '}';
    }
    
    
}
