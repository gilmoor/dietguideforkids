/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Parent;
import edu.esprit.entities.Pediatre;
import edu.esprit.entities.Utilisateur;
import edu.esprit.util.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOSupprimerCompte {

    public List<Parent> GetIdParent() {

        List<Parent> listeparent = new ArrayList<Parent>();
        try {
            String req = "select nom_util,prenom_util from utilisateur util,parent p where util.id_util=p.id_par and (util.etat_util=1 or util.etat_util=2)";
            Statement st = Connexion.getInstance().createStatement();
            ResultSet resultat = st.executeQuery(req);

            while (resultat.next()) {
                Parent pa = new Parent();
                pa.setId_util(resultat.getString(1));

                listeparent.add(pa);
            }
            return listeparent;

        } catch (SQLException e) {
            return null;
        }


    }

    public List<Pediatre> GetIdPediatre() {

        List<Pediatre> listepediatre = new ArrayList<Pediatre>();
        try {
            String req = "select nom_util,prenom_util from utilisateur util,pediatre p where util.id_util=p.id_ped and (util.etat_util=1 or util.etat_util=2)";
            Statement st = Connexion.getInstance().createStatement();
            ResultSet resultat = st.executeQuery(req);

            while (resultat.next()) {
                Pediatre pa = new Pediatre();
                pa.setId_util(resultat.getString(1));
                listepediatre.add(pa);
            }
            return listepediatre;

        } catch (SQLException e) {
            return null;
        }


    }

    public Utilisateur afficherInfo(Object id) {
        try {
            Utilisateur util = new Utilisateur();
            String req = "select nom_util,prenom_util,etat_util,date_desactivation from utilisateur where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            ResultSet resultat = st.executeQuery(req);

            while (resultat.next()) {

                util.setNom_util(resultat.getString(1));
                util.setPrenom_util(resultat.getString(2));
                util.setEtat_util(resultat.getInt(3));
                util.setDate_desactivation(resultat.getDate(4));
            }
            return util;

        } catch (SQLException e) {
            return null;
        }
    }

    public void SupprimerUtilisateur(Object id) {


        try {
            String req = "delete from utilisateur where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);

        } catch (SQLException e) {
        }

    }

    public static void main(String[] args) {
        DAOSupprimerCompte dao = new DAOSupprimerCompte();
        System.out.println(dao.afficherInfo("pediatre").getEtat_util());
    }
}
