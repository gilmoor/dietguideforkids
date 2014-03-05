/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author AvBack
 */
public class GroupeObjet {
    
    private int Id_modele ;
    private String Nom_repas ;
    private String Nom_aliment;
    private Double Poids;
    private int Calorie;
    private int Lipide;
    private int Glucide;
    private int Proteine;

    public GroupeObjet() {
    }

    public int getId_modele() {
        return Id_modele;
    }

    public void setId_modele(int Id_modele) {
        this.Id_modele = Id_modele;
    }

    public String getNom_repas() {
        return Nom_repas;
    }

    public void setNom_repas(String Nom_repas) {
        this.Nom_repas = Nom_repas;
    }

    public String getNom_aliment() {
        return Nom_aliment;
    }

    public void setNom_aliment(String Nom_aliment) {
        this.Nom_aliment = Nom_aliment;
    }

    public Double getPoids() {
        return Poids;
    }

    public void setPoids(Double Poids) {
        this.Poids = Poids;
    }

    public int getCalorie() {
        return Calorie;
    }

    public void setCalorie(int Calorie) {
        this.Calorie = Calorie;
    }

    public int getLipide() {
        return Lipide;
    }

    public void setLipide(int Lipide) {
        this.Lipide = Lipide;
    }

    public int getGlucide() {
        return Glucide;
    }

    public void setGlucide(int Glucide) {
        this.Glucide = Glucide;
    }

    public int getProteine() {
        return Proteine;
    }

    public void setProteine(int Proteine) {
        this.Proteine = Proteine;
    }
    
    
    
}
