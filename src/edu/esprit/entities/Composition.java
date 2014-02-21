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
public class Composition {
    private int id_composition;
    private int lipide;
    private int glucide;
    private int proteine;
    
    public Composition()
    {
        
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_composition;
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
        return "Composition{" + "id_composition=" + id_composition + ", lipide=" + lipide + ", glucide=" + glucide + ", proteine=" + proteine + '}';
    }
            
}

