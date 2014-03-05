/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Modele_Aliment {
    
    private int id_aliment;
    private String nom_aliment;
    private Double poids;
    private int calorie;

    public Modele_Aliment() {
    }

    public int getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(int id_aliment) {
        this.id_aliment = id_aliment;
    }

    public String getNom_aliment() {
        return nom_aliment;
    }

    public void setNom_aliment(String nom_aliment) {
        this.nom_aliment = nom_aliment;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id_aliment;
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
        final Modele_Aliment other = (Modele_Aliment) obj;
        if (this.id_aliment != other.id_aliment) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_Aliment{" + "id_aliment=" + id_aliment + ", nom_aliment=" + nom_aliment + ", poids=" + poids + ", calorie=" + calorie + '}';
    }
    
    
    
}
