/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import AppPackage.EspaceAdmin;
import AppPackage.gui;
import edu.esprit.entities.Administrateur;
import edu.esprit.util.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DAOAuthentification {

    public static String NomPrenom;

    public void verifier(gui a, String identifiant, String pass) {
        Administrateur admin = new Administrateur();
        if (identifiant.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Saisir tous les champs", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String req = "select nom_util,prenom_util,etat_util from utilisateur util,administrateur ad where util.id_util=ad.id_ad and ad.id_ad='" + identifiant + "' and util.pwd_util='" + pass + "'";
                Statement st = Connexion.getInstance().createStatement();
                ResultSet resultat = st.executeQuery(req);

                int i = 0;
                while (resultat.next()) {
                    admin.setNom_util(resultat.getString(1));
                    admin.setPrenom_util(resultat.getString(2));
                    i++;
                }
                NomPrenom = (admin.getNom_util() + " " + admin.getPrenom_util()).toUpperCase();
                if (i == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "L'identifiant ou le mot de passe est incorrecte", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    new EspaceAdmin().setVisible(true);
                    a.setVisible(false);


                }

            } catch (SQLException ex) {
                System.out.println("erreur de cnx");
            }
        }


    }

    public void encrypt() {
    }
}
