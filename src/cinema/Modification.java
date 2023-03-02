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
public class Modification extends JFrame {
    
    JTable table;
    
    public void init(){
        table = new JTable(); 
    }    

    public Modification() {
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(245, 245, 220));
        
        super.setTitle(" Mise à jour");
        super.setSize(800, 450);
        super.setLocationRelativeTo(null);
        super.setResizable(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout());
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new FlowLayout());
        
        JPanel pgrid = new JPanel();
        pgrid.setLayout(new GridLayout(6,1));
        
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
        
        JPanel pg6 = new JPanel();
        pg6.setLayout(new FlowLayout());
        
        
        JLabel l1 = new JLabel("Mise à jour de la base de données");
        Font police = new Font ("Tahoma", Font.BOLD,26);
        l1.setFont(police);
        JLabel lvide = new JLabel("");
        
        Font pol = new Font("Calibri",Font.PLAIN, 19);
        
        JButton btn1 = new JButton("Ajouter");
        btn1.setPreferredSize(new Dimension(250,50));
        btn1.setFont(pol);
        
        JButton btn2 = new JButton("Modifier");
        btn2.setPreferredSize(new Dimension(250,50));
        btn2.setFont(pol);
        
        JButton btn3 = new JButton("Supprimer");
        btn3.setPreferredSize(new Dimension(250,50));
        btn3.setFont(pol);
        
        JButton btn4 = new JButton("Retour");
        btn4.setPreferredSize(new Dimension(100,25));
        btn4.setFont(pol);
        
        pg1.add(l1);
        pg2.add(lvide);
        pg3.add(btn1);
        pg4.add(btn2);
        pg5.add(btn3);
        pg6.add(btn4);
        
        
        pgrid.add(pg1);
        pgrid.add(pg2);
        pgrid.add(pg3);
        pgrid.add(pg4);
        pgrid.add(pg5);
        pgrid.add(pg6);
        
        pCenter.add(pgrid);
        
        c.add(pCenter, BorderLayout.CENTER);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Modification modification = new Modification();
         modification.setVisible(true);
    }
    
}
