/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class Composition {
    
    private int id_composition ;
    private int lipide ;
    private int glucide;
    private int proteine;
    private Modele_Aliment id_aliment;

    public Composition() {
    }

    public int getId_composition() {
        return id_composition;
    }

    public void setId_composition(int id_composition) {
        this.id_composition = id_composition;
    }

    public int getLipide() {
        return lipide;
    }

    public void setLipide(int lipide) {
        this.lipide = lipide;
    }

    public int getGlucide() {
        return glucide;
    }

    public void setGlucide(int glucide) {
        this.glucide = glucide;
    }

    public int getProteine() {
        return proteine;
    }

    public void setProteine(int proteine) {
        this.proteine = proteine;
    }

    public Modele_Aliment getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(Modele_Aliment id_aliment) {
        this.id_aliment = id_aliment;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_composition;
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
        final Composition other = (Composition) obj;
        if (this.id_composition != other.id_composition) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Composition{" + "id_composition=" + id_composition + ", lipide=" + lipide + ", glucide=" + glucide + ", proteine=" + proteine + ", id_aliment=" + id_aliment + '}';
    }
    
    
}
