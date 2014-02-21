/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author sahli
 */
public class Regime {
    private int id_regime;
    private String nom_regime;
    private String detaille_regime;
    private Pediatre id_ped;
    
    public Regime(){
}

    public int getId_regime() {
        return id_regime;
    }

    public void setId_regime(int id_regime) {
        this.id_regime = id_regime;
    }

    public String getNom_regime() {
        return nom_regime;
    }

    public void setNom_regime(String nom_regime) {
        this.nom_regime = nom_regime;
    }

    public String getDetaille_regime() {
        return detaille_regime;
    }

    public void setDetaille_regime(String detaille_regime) {
        this.detaille_regime = detaille_regime;
    }

    public Pediatre getId_ped() {
        return id_ped;
    }

    public void setId_ped(Pediatre id_ped) {
        this.id_ped = id_ped;
    }

    @Override
    public String toString() {
        return "Regime{" + "id_regime=" + id_regime + ", nom_regime=" + nom_regime + ", detaille_regime=" + detaille_regime + ", id_ped=" + id_ped + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id_regime;
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
        final Regime other = (Regime) obj;
        if (this.id_regime != other.id_regime) {
            return false;
        }
        return true;
    }
    
}
