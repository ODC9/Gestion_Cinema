/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author W. M. Astride NARE
 */
public class Cinema extends JFrame {
    
    JTable table;
    
    public void init(){
        table = new JTable(); 
    }    

    public Cinema() {
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(245, 245, 220));
        
        super.setTitle(" Bienvenue dans Niadja");
        super.setSize(800, 450);
        super.setLocationRelativeTo(null);
        super.setResizable(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout());
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new FlowLayout());
        
        JPanel pgrid = new JPanel();
        pgrid.setLayout(new GridLayout(5,1));
        
        JPanel pg1 = new JPanel();
        pg1.setLayout(new FlowLayout());
        
        JPanel pg2 = new JPanel();
        pg2.setLayout(new FlowLayout());
        
        JPanel pg3 = new JPanel();
        pg3.setLayout(new FlowLayout());
        
        JPanel pg4 = new JPanel();
        pg4.setLayout(new FlowLayout());
        
        JPanel pg5 = new JPanel();
        pg5.setLayout(new FlowLayout());
        
        
        JLabel l1 = new JLabel("Menu général");
        Font police = new Font ("Tahoma", Font.BOLD,26);
        l1.setFont(police);
        JLabel lvide = new JLabel("");
        
        Font pol = new Font("Calibri",Font.PLAIN, 19);
        
        JButton btn1 = new JButton("Voir listes");
        btn1.setPreferredSize(new Dimension(250,50));
        btn1.setFont(pol);
        
        
        JButton btn2 = new JButton("Mise à jour");
        btn2.setPreferredSize(new Dimension(250,50));
        btn2.setFont(pol);
        
        JButton btn3 = new JButton("Etat");
        btn3.setPreferredSize(new Dimension(250,50));
        btn3.setFont(pol);
        
        pg1.add(l1);
        pg2.add(lvide);
        pg3.add(btn1);
        pg4.add(btn2);
        pg5.add(btn3);
        
        
        pgrid.add(pg1);
        pgrid.add(pg2);
        pgrid.add(pg3);
        pgrid.add(pg4);
        pgrid.add(pg5);
        
        pCenter.add(pgrid);
        
        c.add(pCenter, BorderLayout.CENTER);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Cinema cinema = new Cinema();
         cinema.setVisible(true);
    }
    
}
