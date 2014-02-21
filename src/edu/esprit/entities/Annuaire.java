/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author hp
 */
public class Annuaire {
    private int id_annuaire;
    private String nom;
    private String prenom;
    private String service;
    private int num_tel;
    private Administrateur id_ad;
    
     public Annuaire() 
     {
         
     }

    public int getId_annuaire() {
        return id_annuaire;
    }

    public void setId_annuaire(int id_annuaire) {
        this.id_annuaire = id_annuaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public Administrateur getId_ad() {
        return id_ad;
    }

    public void setId_ad(Administrateur id_ad) {
        this.id_ad = id_ad;
    }

    @Override
    public String toString() {
        return "Annuaire{" + "id=" + id_annuaire + ", nom=" + nom + ", prenom=" + prenom + ", service=" + service + ", telephone=" + num_tel + ", ²id administrateur=" + id_ad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id_annuaire;
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
        final Annuaire other = (Annuaire) obj;
        if (this.id_annuaire != other.id_annuaire) {
            return false;
        }
        return true;
    }
     

    
       
       
       
       
}
