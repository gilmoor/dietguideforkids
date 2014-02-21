/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AvBack
 */
public class Connexion {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/projet";
    private static final String login = "root";
    private static final String pwd = "";
    private static Connection cnx;

    public Connection etablirConnection() {
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion établie");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur de chargement de driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("probleme d'etablissement de connection" + ex.getMessage());
        }

        return cnx;
    }

    public static Connection getInstance() {
        if (cnx == null) {
            new Connexion().etablirConnection();
        }
        return cnx;
    }
}
