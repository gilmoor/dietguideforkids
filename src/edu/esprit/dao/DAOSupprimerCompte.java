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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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

    public void afficherIdParent(List<Parent> pa, JComboBox a) {
        a.removeAllItems();
        a.addItem("-------------Choisir Utilisateur-------------");
        for (int i = 0; i < pa.size(); i++) {
            a.addItem(pa.get(i).getId_util());
        }
    }

    public void afficherIdPediatre(List<Pediatre> pd, JComboBox a) {
        a.removeAllItems();
        a.addItem("-------------Choisir Utilisateur-------------");
        for (int i = 0; i < pd.size(); i++) {

            a.addItem(pd.get(i).getId_util());
        }
    }

    public void afficherInfo(JComboBox a, JTextField nom, JTextField prenom, JLabel desactiver, JLabel date) {
        try {
            String id = (String) a.getSelectedItem();
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


            if (a.getSelectedIndex() == 0) {
                nom.setText("Nom");
                prenom.setText("Prénom");
                desactiver.setText("Désactiver Par :");
                desactiver.disable();
                date.setText("Désactiver Le : ");
                date.disable();

            } else {

                nom.setText(util.getNom_util());
                prenom.setText(util.getPrenom_util());
                Date d1 = util.getDate_desactivation();
                date.setText("Désactiver Le : " + d1);
                date.enable();
                if (util.getEtat_util() == 1) {
                    desactiver.setText("Désactiver Par : Vous ");
                    desactiver.enable();

                } else {
                    desactiver.setText("Désactiver Par : " + util.getPrenom_util());
                    desactiver.enable();

                }
            }

        } catch (SQLException e) {
        }
    }
    
    public void SupprimerUtilisateur(JRadioButton parent,JRadioButton pediatre, JComboBox id){
    
       if(parent.isSelected()==false && pediatre.isSelected()==false){
        JOptionPane.showMessageDialog(new JFrame(), "Choisir un utilisateur", "Warning", JOptionPane.WARNING_MESSAGE);

       }
       else if(id.getSelectedIndex()==0)
       {
      JOptionPane.showMessageDialog(new JFrame(), "Sélectionner un utilisateur", "Warning", JOptionPane.WARNING_MESSAGE);

       }
       else
       {
            try{
            String ident = (String) id.getSelectedItem();
            String req = "delete from utilisateur where id_util='" + ident + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);
                  JOptionPane.showMessageDialog(new JFrame(), "L'utilisateur a été supprimer avec succèe", "Succèe", JOptionPane.CLOSED_OPTION);
                
            
            }
            catch(SQLException e){}
       }
    
    
    
    }
}
