/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author MOHAMED
 */
public class Resultat_nutrition {
    private int id_nutrition;
    private String etat_nutrition;
    private String id_par;
    
    public Resultat_nutrition()
    {
        
    }

    public int getId_nutrition() {
        return id_nutrition;
    }

    public void setId_nutrition(int id_nutrition) {
        this.id_nutrition = id_nutrition;
    }

    public String getEtat_nutrition() {
        return etat_nutrition;
    }

    public void setEtat_nutrition(String etat_nutrition) {
        this.etat_nutrition = etat_nutrition;
    }

    public String getId_par() {
        return id_par;
    }

    public void setId_par(String id_par) {
        this.id_par = id_par;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id_nutrition;
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
        final Resultat_nutrition other = (Resultat_nutrition) obj;
        if (this.id_nutrition != other.id_nutrition) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resultat_nutrition{" + "id_nutrition=" + id_nutrition + ", etat_nutrition=" + etat_nutrition + ", id_par=" + id_par + '}';
    }
    
}
