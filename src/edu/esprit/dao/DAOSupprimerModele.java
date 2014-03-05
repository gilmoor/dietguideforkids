/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Categorie;
import edu.esprit.entities.Composition;
import edu.esprit.entities.GroupeObjet;
import edu.esprit.entities.Modele_Aliment;
import edu.esprit.entities.Modele_Menu;
import edu.esprit.entities.Modele_Repas;
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
public class DAOSupprimerModele {

    public List<Categorie> ListeCategorie() {
        try {
            List<Categorie> categorie = new ArrayList<Categorie>();
            String req = "Select id_categorie,intervalle_age from categorie";
            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            while (result.next()) {
                Categorie cat = new Categorie();
                cat.setId_categorie(result.getInt(1));
                cat.setIntervalle_age(result.getString(2));
                categorie.add(cat);
            }
            return categorie;
        } catch (SQLException e) {
            System.out.println("erreur");
            return null;
        }

    }

    public List<GroupeObjet> AfficherModele(Object ident) {


        List<GroupeObjet> modele = new ArrayList<GroupeObjet>();
        try {
            String req = "select mm.id_modele ,mr.nom_repas,ma.nom_aliment,ma.poids,ma.calorie,com.lipide,com.glucide,com.proteine "
                    + "from categorie c,categorie_modele_menu cmm,modele_menu mm,modele_repas_modele_menu mrmm,modele_repas mr,modele_aliment_modele_repas mamr,modele_aliment ma,composition com "
                    + "where c.id_categorie=cmm.id_categorie and cmm.id_modele=mm.id_modele and mm.id_modele=mrmm.id_modele and mrmm.id_repas=mr.id_repas and mr.id_repas=mamr.id_repas and mamr.id_aliment=ma.id_aliment"
                    + " and ma.id_aliment=com.id_aliment and c.intervalle_age='" + ident + "'";


            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            while (result.next()) {

                GroupeObjet go = new GroupeObjet();

                go.setId_modele(result.getInt(1));
                go.setNom_repas(result.getString(2));
                go.setNom_aliment(result.getString(3));
                go.setPoids(result.getDouble(4));
                go.setCalorie(result.getInt(5));
                go.setLipide(result.getInt(6));
                go.setGlucide(result.getInt(7));
                go.setProteine(result.getInt(8));

                modele.add(go);


            }
            return modele;

        } catch (Exception e) {
            return null;
        }

    }

    public void GetLineToDelete(Object id) {
        try {
            String req = "delete from categorie_modele_menu where id_modele='" + id + "'";
            Statement st = Connexion.getInstance().createStatement();
            st.executeUpdate(req);

        } catch (SQLException e) {
        }

    }
}
