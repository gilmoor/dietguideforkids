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
public class Enfant {
    private String id_enf;
    private String nom_enf;
    private String prenom_enf;
    private String age_enf;
    private String poids_enf;
    private String taille_enf;
    private Parent id_par;
    
       
    public Enfant (){
        
    }

    public String getId_enf() {
        return id_enf;
    }

    public void setId_enf(String id_enf) {
        this.id_enf = id_enf;
    }

    public String getNom_enf() {
        return nom_enf;
    }

    public void setNom_enf(String nom_enf) {
        this.nom_enf = nom_enf;
    }

    public String getPrenom_enf() {
        return prenom_enf;
    }

    public void setPrenom_enf(String prenom_enf) {
        this.prenom_enf = prenom_enf;
    }

    public String getAge_enf() {
        return age_enf;
    }

    public void setAge_enf(String age_enf) {
        this.age_enf = age_enf;
    }

    public String getPoids_enf() {
        return poids_enf;
    }

    public void setPoids_enf(String poids_enf) {
        this.poids_enf = poids_enf;
    }

    public String getTaille_enf() {
        return taille_enf;
    }

    public void setTaille_enf(String taille_enf) {
        this.taille_enf = taille_enf;
    }

    public Parent getId_par() {
        return id_par;
    }

    public void setId_par(Parent id_par) {
        this.id_par = id_par;
    }

    @Override
    public String toString() {
        return "Enfant{" + "Id=" + id_enf + ", Nom=" + nom_enf + ", prenom_enf=" + prenom_enf + ", age_enf=" + age_enf + ", poids_enf=" + poids_enf + ", taille_enf=" + taille_enf + ", id_par=" + id_par + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id_enf);
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
        final Enfant other = (Enfant) obj;
        if (!Objects.equals(this.id_enf, other.id_enf)) {
            return false;
        }
        return true;
    }
    
    
    
}

