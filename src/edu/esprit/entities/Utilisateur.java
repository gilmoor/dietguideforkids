package edu.esprit.entities;

import java.util.Date;

public class Utilisateur {

    private String id_util;
    private String nom_util;
    private String prenom_util;
    private String pwd_util;
    private int etat_util;
    private Date date_desactivation;

    public Utilisateur() {
    }

    public Utilisateur(String id_util, String nom_util, String prenom_util, String pwd_util, int type_util) {
        this.id_util = id_util;
        this.nom_util = nom_util;
        this.prenom_util = prenom_util;
        this.pwd_util = pwd_util;
        this.etat_util = type_util;

    }

    public String getId_util() {
        return id_util;
    }

    public void setId_util(String id_util) {
        this.id_util = id_util;
    }
    

    public String getNom_util() {
        return nom_util;
    }

    public Date getDate_desactivation() {
        return date_desactivation;
    }

    public void setDate_desactivation(Date date_desactivation) {
        this.date_desactivation = date_desactivation;
    }

    public void setNom_util(String nom_util) {
        this.nom_util = nom_util;
    }

    public String getPrenom_util() {
        return prenom_util;
    }

    public void setPrenom_util(String prenom_util) {
        this.prenom_util = prenom_util;
    }

    public String getPwd_util() {
        return pwd_util;
    }

    public void setPwd_util(String pwd_util) {
        this.pwd_util = pwd_util;
    }

    public int getEtat_util() {
        return etat_util;
    }

    public void setEtat_util(int etat_util) {
        this.etat_util = etat_util;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "Nom=" + nom_util + ", Prenom=" + prenom_util + "}";
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (this.id_util != other.id_util) {
            return false;
        }
        return true;
    }
}
