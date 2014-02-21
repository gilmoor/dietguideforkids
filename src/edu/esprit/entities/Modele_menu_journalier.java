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
public class Modele_menu_journalier {
    private int id_menu_;
    private String petit_dejeuner;
    private String repas_midi;
    private String diner;
    
    public Modele_menu_journalier()
    {
        
    }

    public int getId_menu_() {
        return id_menu_;
    }

    public void setId_menu_(int id_menu_) {
        this.id_menu_ = id_menu_;
    }

    public String getPetit_dejeuner() {
        return petit_dejeuner;
    }

    public void setPetit_dejeuner(String petit_dejeuner) {
        this.petit_dejeuner = petit_dejeuner;
    }

    public String getRepas_midi() {
        return repas_midi;
    }

    public void setRepas_midi(String repas_midi) {
        this.repas_midi = repas_midi;
    }

    public String getDiner() {
        return diner;
    }

    public void setDiner(String diner) {
        this.diner = diner;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id_menu_;
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
        final Modele_menu_journalier other = (Modele_menu_journalier) obj;
        if (this.id_menu_ != other.id_menu_) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modele_menu_journalier{" + "id_menu_=" + id_menu_ + ", petit_dejeuner=" + petit_dejeuner + ", repas_midi=" + repas_midi + ", diner=" + diner + '}';
    }
    
}
