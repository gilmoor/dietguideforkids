/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;
import edu.esprit.entities.Administrateur;
import edu.esprit.util.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAOAuthentification {

    public static String NomPrenom;

    public boolean verifier(String identifiant, String pass) {
        Administrateur admin = new Administrateur();
         
            try {
                String req = "select nom_util,prenom_util,etat_util from utilisateur util,administrateur ad where util.id_util=ad.id_ad and ad.id_ad='" + identifiant + "' and util.pwd_util='" + pass + "'";
                Statement st = Connexion.getInstance().createStatement();
                ResultSet resultat = st.executeQuery(req);

                
                if(resultat.next()) {
                    admin.setNom_util(resultat.getString(1));
                    admin.setPrenom_util(resultat.getString(2));
                    NomPrenom = (admin.getNom_util() + " " + admin.getPrenom_util()).toUpperCase();

                    return true ;
                }
                return false ;
                
            } catch (SQLException ex) {
                System.out.println("erreur de cnx");
                return false ;
            }
        }


    }

