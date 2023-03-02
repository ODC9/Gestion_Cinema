/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author W. M. Astride NARE
 */
public class Formulaire extends JFrame {
    
    JTable table;
    
    public void init(){
        table = new JTable(); 
    }    

    public Formulaire() {
        
        super.setTitle(" Formulaire");
        super.setSize(800, 450);
        super.setLocationRelativeTo(null);
        super.setResizable(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(245, 245, 220));
       
        
        JLabel lnum = new JLabel("Numéro");
        JLabel ltitre = new JLabel("Titre");
        JLabel ldure = new JLabel("Durée");
        
        JTextField tfnum = new JTextField();
        tfnum.setPreferredSize(new Dimension (200,24));
        JTextField tftitre = new JTextField();
        tftitre.setPreferredSize(new Dimension (200,24));
        JTextField tfdure = new JTextField();
        tfdure.setPreferredSize(new Dimension (200,24));
        
        JButton btnvalider = new JButton("Ajouter");
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(1,2));
        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        
        JPanel p0 = new JPanel();
        p0.setLayout(new GridLayout(4,1));
        
        p1.add(lnum);
        p1.add(tfnum);
        p2.add(ltitre);
        p2.add(tftitre);
        p3.add(ldure);
        p3.add(tfdure);
        p4.add(btnvalider);
        
        p0.add(p1);
        p0.add(p2);
        p0.add(p3);
        p0.add(p4);
        
        
        p5.add(p0);
        
        c.add(p5,BorderLayout.CENTER);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulaire formulaire = new Formulaire();
        formulaire.setVisible(true);
    }
    
}
