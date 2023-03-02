/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author W. M. Astride NARE
 */
public class Formulairesalle extends JFrame {
    ConnCine con = new ConnCine();
    
    JTable table1;
    Statement pst;
    ResultSet rs;
    JTextField txtsalle, txtcapacite;
    JScrollPane scroll1;
    
    public void init() {
        table1 = new JTable();
        scroll1  = new JScrollPane();
        scroll1.setBounds(10, 280, 770, 130);
        scroll1.setViewportView(table1);
    }

    public Formulairesalle() {
        
        super("Formulaire");
        super.setSize(800, 450);
        super.setLocationRelativeTo(null);
        super.setResizable(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn = new JPanel();
        pn.setLayout(null);
        add(pn);
        pn.setBackground(new Color(220, 210, 220));
        
        //Partie Titre
        JLabel lblTitre = new JLabel("Ajouter une salle");
        lblTitre.setBounds(250, 10, 800, 30);
        lblTitre.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitre.setForeground(new Color(0, 0, 205));
        pn.add(lblTitre);
        
        // id salle
     
        //non salle
        JLabel lbltitre = new JLabel("Nom");
        lbltitre.setBounds(120, 80, 50, 30);
        lbltitre.setFont(new Font ("Arial", Font.BOLD, 16));
        lbltitre.setForeground(new Color (0, 0, 0));
        pn.add(lbltitre);
        
        txtsalle = new JTextField();
        txtsalle.setBounds (220, 80, 200, 30);
        txtsalle.setFont(new Font("Arial", Font.PLAIN, 14));
        pn.add(txtsalle);
        
        // dure films
        JLabel lbldure = new JLabel("Capacité");
        lbldure.setBounds(120,130,80,30);
        lbldure.setFont(new Font("Arial",Font.BOLD,16));
        lbldure.setForeground(new Color(0,0,0));
        pn.add(lbldure);

        txtcapacite = new JTextField();
        txtcapacite.setBounds (220, 130, 200, 30);
        txtcapacite.setFont(new Font("Arial", Font.PLAIN, 14));
        pn.add(txtcapacite);
        
        JButton btn = new JButton("Valider");
        btn.setBounds(280, 180, 80, 30);
        
        btn.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent ev){
                String nomsalle, capacitesalle;
                
                nomsalle = txtsalle.getText();
                capacitesalle = txtcapacite.getText();
         
                
                String rq = "insert into salle(nomsalle,capacitesalle) values (?,?)";
                try {
                    PreparedStatement ps = con.maconnection().prepareStatement(rq);
                    ps.setString(1, nomsalle);
                    ps.setString(2, capacitesalle);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Salle enregistrée !", null, JOptionPane.INFORMATION_MESSAGE);
                    con.maconnection().close();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erreur de saisie ! Entrez un entier pour la capacite." , null, JOptionPane.ERROR_MESSAGE);
                }
                dispose();
                Formulairesalle formulairesalle = new Formulairesalle();
                formulairesalle.setVisible(true);
            }
        });
        pn.add(btn);
        
        
        //Listes des films
        DefaultTableModel model = new DefaultTableModel();
        init();
        pn.add(scroll1);
        model.addColumn("Identifiant de la salle");
        model.addColumn("Nom de la salle");
        model.addColumn("Capacité de la salle");
        
        table1.setModel(model);
        String sql = "select * from salle order by numsalle desc";
        try {
            pst = con.maconnection().createStatement();
            rs = pst.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("numsalle"),
                    rs.getString("nomsalle"),
                    rs.getString("capacitesalle")
                });
            }
            //con.maconnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur !", null, JOptionPane.INFORMATION_MESSAGE);
        }

        table1.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                table1MouseReleased(evt);
            }
        });
       
        
    }
    
    private void table1MouseReleased(MouseEvent evt) {
        int selectionner = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        //lblid.setText(model.getValueAt(selectionner, 0).toString());
        txtsalle.setText(model.getValueAt(selectionner, 0).toString());
        txtcapacite.setText(model.getValueAt(selectionner, 1).toString());
        
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
