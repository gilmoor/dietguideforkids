/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author sahli
 */
public class Forum_utilisateur {
    
    private int id_disc ;
    private Utilisateur id_util;
    private String message;
      
    
    public Forum_utilisateur(){
        
    }

    public int getId_disc() {
        return id_disc;
    }

    public void setId_disc(int id_disc) {
        this.id_disc = id_disc;
    }

    public Utilisateur getId_util() {
        return id_util;
    }

    public void setId_util(Utilisateur id_util) {
        this.id_util = id_util;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Forum_utilisateur{" + "id_disc=" + id_disc + ", id_util=" + id_util + ", message=" + message + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id_disc;
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
        final Forum_utilisateur other = (Forum_utilisateur) obj;
        if (this.id_disc != other.id_disc) {
            return false;
        }
        return true;
    }
    
    
}
