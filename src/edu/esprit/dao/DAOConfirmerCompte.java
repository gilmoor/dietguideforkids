/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Pediatre;
import edu.esprit.entities.Utilisateur;
import edu.esprit.util.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author AvBack
 */
public class DAOConfirmerCompte {

    public List<Utilisateur> GetListPediatre() {

        List<Utilisateur> ped = new ArrayList<Utilisateur>();
        String req = "Select p.id_ped,u.nom_util,u.prenom_util,u.date_desactivation from utilisateur u, pediatre p where u.id_util=p.id_ped and u.etat_util=-1 ";
        try {
            Statement st = Connexion.getInstance().createStatement();
            ResultSet rest = st.executeQuery(req);
            while (rest.next()) {
                Utilisateur util = new Utilisateur();
                util.setId_util(rest.getString(1));
                util.setNom_util(rest.getString(2));
                util.setPrenom_util(rest.getString(3));
                util.setDate_desactivation(rest.getDate(4));


                ped.add(util);
            }
            return ped;


        } catch (SQLException e) {
            return null;
        }

    }

    public Pediatre AfficherInfoPediatre(Object id) {
        Pediatre util = new Pediatre();
        String req = "select u.nom_util,u.prenom_util,u.date_desactivation,p.certification from utilisateur u,pediatre p where u.id_util=p.id_ped and u.id_util='" + id + "'";
        try {
            Statement st = Connexion.getInstance().createStatement();
            ResultSet resultat = st.executeQuery(req);

            if (resultat.next()) {

                util.setNom_util(resultat.getString(1));
                util.setPrenom_util(resultat.getString(2));
                util.setDate_desactivation(resultat.getDate(3));
                util.setImagedata(resultat.getBytes(4));


            }
            return util;

        } catch (SQLException e) {
            e.getStackTrace();
            return null;
        }
    }

    public void AjouterPediatre(Object id) {
        try {
            String req = "update utilisateur set etat_util=0 where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);
        } catch (SQLException ex) {
            ex.getStackTrace();

        }


    }

    public void SupprimerPediatre(Object id) {
        try {
            String req = "Delete from utilisateur where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);

        } catch (SQLException ex) {
            ex.getStackTrace();

        }


    }
}
