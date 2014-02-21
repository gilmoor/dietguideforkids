/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author sahli
 */
public class Aliment {
    private int id_aliment;
    private  double poids;
    private   double calorie;
    
    public Aliment(){
    
}

    public int getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(int id_aliment) {
        this.id_aliment = id_aliment;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
        
        
    }

    @Override
    public String toString() {
        return "Aliment{" + "id_aliment=" + id_aliment + ", poids=" + poids + ", calorie=" + calorie + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_aliment;
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
        final Aliment other = (Aliment) obj;
        if (this.id_aliment != other.id_aliment) {
            return false;
        }
        return true;
    }}
