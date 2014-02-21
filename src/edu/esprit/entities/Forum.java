/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author sahli
 */
public class Forum {
 private int id_desc ;
 private Utilisateur id_emetteur;
 private String message;
 
 public Forum (){
     
     
 }

    public int getId_desc() {
        return id_desc;
    }

    public void setId_desc(int id_desc) {
        this.id_desc = id_desc;
    }

    public Utilisateur getId_emetteur() {
        return id_emetteur;
    }

    public void setId_emetteur(Utilisateur id_emetteur) {
        this.id_emetteur = id_emetteur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Forum{" + "id_desc=" + id_desc + ", id_emetteur=" + id_emetteur + ", message=" + message + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id_desc;
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
        final Forum other = (Forum) obj;
        if (this.id_desc != other.id_desc) {
            return false;
        }
        return true;
    }
    
    
    
}
