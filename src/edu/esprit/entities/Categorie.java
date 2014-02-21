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
public class Categorie {
    private int id_categorie;
    private String intervalle_age;
    private Administrateur id_ad;
    public Categorie()
    {
        
    }

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

    public Administrateur getId_ad() {
        return id_ad;
    }

    public void setId_ad(Administrateur id_ad) {
        this.id_ad = id_ad;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id_categorie=" + id_categorie + ", intervalle_age=" + intervalle_age + ", id_ad=" + id_ad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Categorie other = (Categorie) obj;
        if (!Objects.equals(this.id_categorie, other.id_categorie)) {
            return false;
        }
        return true;
    }
    
}
