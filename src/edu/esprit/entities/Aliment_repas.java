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
public class Aliment_repas {
    private Aliment id_aliment;
    private Repas id_repas;
    
    public Aliment_repas()
    {
        
    }

    public Aliment getId_aliment() {
        return id_aliment;
    }

    public void setId_aliment(Aliment id_aliment) {
        this.id_aliment = id_aliment;
    }

    public Repas getId_repas() {
        return id_repas;
    }

    public void setId_repas(Repas id_repas) {
        this.id_repas = id_repas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id_aliment);
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
        final Aliment_repas other = (Aliment_repas) obj;
        if (!Objects.equals(this.id_aliment, other.id_aliment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aliment_repas{" + "id_aliment=" + id_aliment + ", id_repas=" + id_repas + '}';
    }
    
}
