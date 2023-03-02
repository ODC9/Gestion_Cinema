/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;
import java.sql.*;
/**
 *
 * @author W. M. Astride NARE
 */
public class ConnCine {
    
    Connection cn;

    public ConnCine() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn =(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:56989/bd_cinema","root","");
            System.out.println("connection etabli");

        }
        catch (Exception e){
            System.out.println("erreur de connection");
            e.printStackTrace();
        }
    }
    public Connection maconnection()
    {
        return  cn;
    }

    
    
}
