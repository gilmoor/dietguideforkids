/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author AvBack
 */
public class Modele_Aliment_Modele_Repas {
    
    private Modele_Aliment id_aliment;
    private Modele_Repas id_repas;

    public Modele_Aliment_Modele_Repas() {
    }

    public Modele_Aliment getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(Modele_Aliment id_aliment) {
        this.id_aliment = id_aliment;
    }

    public Modele_Repas getId_repas() {
        return id_repas;
    }

    public void setId_repas(Modele_Repas id_repas) {
        this.id_repas = id_repas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id_aliment);
        hash = 29 * hash + Objects.hashCode(this.id_repas);
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
        final Modele_Aliment_Modele_Repas other = (Modele_Aliment_Modele_Repas) obj;
        if (!Objects.equals(this.id_aliment, other.id_aliment)) {
            return false;
        }
        if (!Objects.equals(this.id_repas, other.id_repas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_Aliment_Modele_Repas{" + "id_aliment=" + id_aliment + ", id_repas=" + id_repas + '}';
    }
    
    
    
}
