/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.sql.Date;

/**
 *
 * @author MOHAMED
 */
public class Discussion_privee {
    private int id_message;
    private String message;
    private Date date_message;
    private String id_emeteur;
    private String id_recepteur;
    private int vues;       
    
    public Discussion_privee()
    {
        
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate_message() {
        return date_message;
    }

    public void setDate_message(Date date_message) {
        this.date_message = date_message;
    }

    public String getId_emeteur() {
        return id_emeteur;
    }

    public void setId_emeteur(String id_emeteur) {
        this.id_emeteur = id_emeteur;
    }

    public String getId_recepteur() {
        return id_recepteur;
    }

    public void setId_recepteur(String id_recepteur) {
        this.id_recepteur = id_recepteur;
    }

    public int getVues() {
        return vues;
    }

    public void setVues(int vues) {
        this.vues = vues;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id_message;
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
        final Discussion_privee other = (Discussion_privee) obj;
        if (this.id_message != other.id_message) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Discussion_privee{" + "id_message=" + id_message + ", message=" + message + ", date_message=" + date_message + ", id_emeteur=" + id_emeteur + ", id_recepteur=" + id_recepteur + ", vues=" + vues + '}';
    }
    
}
