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
public class Pourcentage {
    private int id_aliment;
    private int id_composition;
    private int id_pourcentage;
    
    public Pourcentage()
    {
        
    }

    public int getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(int id_aliment) {
        this.id_aliment = id_aliment;
    }

    public int getId_composition() {
        return id_composition;
    }

    public void setId_composition(int id_composition) {
        this.id_composition = id_composition;
    }

    public int getId_pourcentage() {
        return id_pourcentage;
    }

    public void setId_pourcentage(int id_pourcentage) {
        this.id_pourcentage = id_pourcentage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_aliment;
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
        final Pourcentage other = (Pourcentage) obj;
        if (this.id_aliment != other.id_aliment) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pourcentage{" + "id_aliment=" + id_aliment + ", id_composition=" + id_composition + ", id_pourcentage=" + id_pourcentage + '}';
    }
    
}
