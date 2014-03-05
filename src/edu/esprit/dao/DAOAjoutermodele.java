/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Categorie;
import edu.esprit.entities.Composition;
import edu.esprit.entities.Modele_Aliment;
import edu.esprit.entities.Modele_Repas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import edu.esprit.util.Connexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOHAMED
 */
public class DAOAjoutermodele {

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

    public List<Modele_Repas> ListeRepas() {
        try {
            List<Modele_Repas> repas = new ArrayList<Modele_Repas>();
            String req = "Select id_repas,nom_repas from modele_repas";
            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            while (result.next()) {
                Modele_Repas rep = new Modele_Repas();
                rep.setId_repas(result.getInt(1));
                rep.setNom_repas(result.getString(2));
                repas.add(rep);
            }
            return repas;
        } catch (SQLException e) {
            System.out.println("erreur");
            return null;
        }

    }

    public void ajouterAliment(Modele_Aliment m) {

        String requete1 = "insert into modele_aliment (nom_aliment,poids,calorie) values (?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete1);
            ps.setString(1, m.getNom_aliment());
            ps.setDouble(2, m.getPoids());
            ps.setInt(3, m.getCalorie());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public Categorie idCategorie(Object intervalle) {

        try {
            String req = "select id_categorie from categorie where intervalle_age='" + intervalle + "'";

            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            Categorie cat = new Categorie();
            if (result.next()) {
                cat.setId_categorie(result.getInt(1));
            }

            return cat;
        } catch (SQLException e) {
            System.out.println("erreur");
            return null;
        }
    }

     public Modele_Repas idRepas(Object nomrepas) {

        try {
            String req = "select id_repas from modele_repas where nom_repas='" + nomrepas + "'";

            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            Modele_Repas model = new Modele_Repas();
            if (result.next()) {
                model.setId_repas(result.getInt(1));
            }

            return model;
        } catch (SQLException e) {
            System.out.println("erreur");
            return null;
        }
    }
     
     
     public void Ajouter_categorie_modele_repas(int a,int b){
         try{
         String req="insert into categorie_modele_repas values ("+a+","+b+")";
         Statement st=Connexion.getInstance().createStatement();
         st.executeUpdate(req);
         }
         catch(SQLException e){}
                 }
     public void Ajouter_modele_aliment_modele_repas(int a,int b){
         try{
         String req="insert into modele_aliment_modele_repas values ("+a+","+b+")";
         Statement st=Connexion.getInstance().createStatement();
         st.executeUpdate(req);
         }
         catch(SQLException e){}
                 }
     public Modele_Aliment idAliment(Object nomaliment ) {

        try {
            String req = "select id_aliment from modele_aliment where nom_aliment='" + nomaliment + "'";

            Statement st = Connexion.getInstance().createStatement();
            ResultSet result = st.executeQuery(req);
            Modele_Aliment model = new Modele_Aliment();
            if (result.next()) {
                model.setId_aliment(result.getInt(1));
            }

            return model;
        } catch (SQLException e) {
            System.out.println("erreur");
            return null;
        }
    }
     public void Ajouter_modele_repas(int a,int b){
         try{
         String req="insert into categorie_modele_repas values ("+a+","+b+")";
         Statement st=Connexion.getInstance().createStatement();
         st.executeUpdate(req);
         }
         catch(SQLException e){}
                 }
             
    public void ajouterComposition(int lip,int glu,int prot,int id) {
        String requete2 = "insert into Composition (lipide,glucide,proteine,id_aliment) values ("+lip+","+glu+","+prot+","+id+")";
        try {
            Statement ps = Connexion.getInstance().createStatement();
            ps.executeUpdate(requete2);
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
}
