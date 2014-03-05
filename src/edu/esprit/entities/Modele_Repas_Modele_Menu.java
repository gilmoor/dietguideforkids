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
public class Modele_Repas_Modele_Menu {
    private Modele_Repas id_repas ;
    private Modele_Menu id_modele;

    public Modele_Repas_Modele_Menu() {
    }

    public Modele_Repas getId_repas() {
        return id_repas;
    }

    public void setId_repas(Modele_Repas id_repas) {
        this.id_repas = id_repas;
    }

    public Modele_Menu getId_modele() {
        return id_modele;
    }

    public void setId_modele(Modele_Menu id_modele) {
        this.id_modele = id_modele;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id_repas);
        hash = 89 * hash + Objects.hashCode(this.id_modele);
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
        final Modele_Repas_Modele_Menu other = (Modele_Repas_Modele_Menu) obj;
        if (!Objects.equals(this.id_repas, other.id_repas)) {
            return false;
        }
        if (!Objects.equals(this.id_modele, other.id_modele)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_Repas_Modele_Menu{" + "id_repas=" + id_repas + ", id_modele=" + id_modele + '}';
    }
    
    
    
}
