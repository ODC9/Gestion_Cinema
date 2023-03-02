/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author COULIBALY
 */
public class Brouillon extends JFrame{
    ConnCine con = new ConnCine();
    Statement pst;
    ResultSet rs;
    
    public Brouillon(){
        super("Primary Key with Foreign Key ComboBox");
  
        JComboBox<String> foreignKeyComboBox;
        JButton addButton;
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Remplir le JComboBox avec les valeurs de la table étrangère
        foreignKeyComboBox = new JComboBox<String>();
        try {
            pst = con.maconnection().createStatement();
            rs = pst.executeQuery("SELECT id FROM film");
            while (rs.next()) {
                foreignKeyComboBox.addItem(rs.getString("id"));
            }
        } catch (Exception e) {
            //e.printStackTrace();
   }
    }
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulairesalle formulairesalle = new Formulairesalle();
        formulairesalle.setVisible(true);
    }
    
    
}
