/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Administrateur;
import edu.esprit.entities.Pediatre;
import edu.esprit.entities.Utilisateur;
import edu.esprit.util.Connexion;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author AvBack
 */
public class DAOConfirmerCompte {

    private ImageIcon format = null;
    private byte[] imagedata;

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

    public void AfficherListPediatre(List<Utilisateur> util, JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("-----------Choisir Utilisateur-----------");
        for (int i = 0; i < util.size(); i++) {

            combo.addItem(util.get(i).getId_util());
        }



    }

    public void AfficherInfoPediatre(JComboBox combo, JTextField nom, JTextField prenom, JTextField date, JLabel image) {
        String id = (String) combo.getSelectedItem();
        Pediatre util = new Pediatre();
        String req = "select u.nom_util,u.prenom_util,u.date_desactivation,p.certification from utilisateur u,pediatre p where u.id_util=p.id_ped and u.id_util='" + id + "'";
        try {
            Statement st = Connexion.getInstance().createStatement();
            ResultSet resultat = st.executeQuery(req);

            if(resultat.next()) {
               
                util.setNom_util(resultat.getString(1));
                util.setPrenom_util(resultat.getString(2));
                util.setDate_desactivation(resultat.getDate(3));
                 nom.setText(util.getNom_util());
                prenom.setText(util.getPrenom_util());
                Date d = util.getDate_desactivation();
                date.setText("" + d);
                imagedata = resultat.getBytes(4);
                format = new ImageIcon(imagedata);
                image.setIcon(format);
   
            }

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public void AjouterPediatre(JComboBox combo) {
        try {
            String id = (String) combo.getSelectedItem();
            String req = "update utilisateur set etat_util=0 where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);
            JOptionPane.showMessageDialog(new Frame(),"L'utilisateur a été ajouté avec succè");
        } catch (SQLException ex) {
            ex.getStackTrace();

        }


    }

    public void SupprimerPediatre(JComboBox combo) {
        try {
            String id = (String) combo.getSelectedItem();
            String req = "Delete from utilisateur where id_util='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);
            JOptionPane.showMessageDialog(new Frame(),"L'utilisateur a été supprimé avec succè");

        } catch (SQLException ex) {
            ex.getStackTrace();

        }


    }
}
