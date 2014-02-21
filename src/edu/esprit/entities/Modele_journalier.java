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
public class Modele_journalier {
    private int id_menu;
    private String petit_dejeuner;        
    private String repas_midi;
    private String diner;
    private String date;
    
    public Modele_journalier()
    {
        
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getPetit_dejeuner() {
        return petit_dejeuner;
    }

    public void setPetit_dejeuner(String petit_dejeuner) {
        this.petit_dejeuner = petit_dejeuner;
    }

    public String getDiner() {
        return diner;
    }

    public void setDiner(String diner) {
        this.diner = diner;
    }

  

    public String getRepas_midi() {
        return repas_midi;
    }

    public void setRepas_midi(String repas_midi) {
        this.repas_midi = repas_midi;
    }

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id_menu;
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
        final Modele_journalier other = (Modele_journalier) obj;
        if (this.id_menu != other.id_menu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele_journalier{" + "id_menu=" + id_menu + ", petit_dejeune=" + petit_dejeuner + ", repas_midi=" + repas_midi + ", dinee=" + diner + ", date=" + date + '}';
    }
    
    
}
