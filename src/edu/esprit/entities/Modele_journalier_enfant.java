/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author hp
 */
public class Modele_journalier_enfant {
    
    public int id_menu;
    public Enfant id_enf;
    

public Modele_journalier_enfant ()
{

}

    public int getId_menu() {
        return id_menu;
    }

    public Enfant getId_enf() {
        return id_enf;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public void setId_enf(Enfant id_enf) {
        this.id_enf = id_enf;
    }

    @Override
    public String toString() {
        return "Modele journalier enfant{" + " menu=" + id_menu + ", enfant=" + id_enf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Modele_journalier_enfant other = (Modele_journalier_enfant) obj;
        if (this.id_menu != other.id_menu) {
            return false;
        }
        if (!Objects.equals(this.id_enf, other.id_enf)) {
            return false;
        }
        return true;
    }

  

}