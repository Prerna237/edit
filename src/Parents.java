
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Parents.java
 *
 * Created on Nov 13, 2014, 2:57:35 PM
 */

/**
 *
 * @author dell pc
 */
public class Parents extends javax.swing.JFrame {

    /** Creates new form Parents */
    public Parents() { 
getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        sr = new javax.swing.JRadioButton();
        wr = new javax.swing.JRadioButton();
        fr = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sr.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(sr);
        sr.setText("Students");
        sr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srActionPerformed(evt);
            }
        });

        wr.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(wr);
        wr.setText("Warden");
        wr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrActionPerformed(evt);
            }
        });

        fr.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(fr);
        fr.setText("Faculty");
        fr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frActionPerformed(evt);
            }
        });

        jLabel2.setText("PARENTS");

        l1.setText("Enter the name of your ward");
        l1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hide(evt);
            }
        });

        tf1.setText("                          ");
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a department", "Computer Science" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell pc\\Desktop\\shiv.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("DIRECTORY");

        l2.setText("jLabel6");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Number"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(sr)
                        .addGap(125, 125, 125)
                        .addComponent(wr)
                        .addGap(99, 99, 99)
                        .addComponent(fr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l1)
                                    .addComponent(l2))
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wr)
                            .addComponent(sr))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fr)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fr.isSelected()==true | wr.isSelected()==true | sr.isSelected()==true) {
            if(fr.isSelected()==true) {jPanel1.setVisible(true);jScrollPane2.setVisible(true);
                if(combo.getSelectedIndex()==0){JOptionPane.showMessageDialog(null,"Please select a department ");} else {
                    String dept=(String) combo.getSelectedItem();
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con=(Connection)
                                DriverManager.getConnection("jdbc:mysql://localhost:3306/snudirectory",
                                "root", "prerna");
                        Statement stmt = (Statement) con.createStatement();

                        String query="SELECT Name,Email_ID,Extension_Number FROM Faculty WHERE department='"+dept+"';";
                        ResultSet rs=stmt.executeQuery(query);
                        String content="  ";
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.setRowCount(0);
                        while(rs.next()){
                            String data1 = rs.getString("Name");
                            String data2 = rs.getString("Email_ID");
                            String data3=rs.getString("Extension_Number");
                            Object[] row = { data1, data2,data3};
                            model.addRow(row);
                        }} catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }}}

            else if(wr.isSelected()==true){jPanel1.setVisible(true);jScrollPane2.setVisible(false); JOptionPane.showMessageDialog(null,"GH1A  Dr.Priyanka Shukla 9988665577 \n GH1B Dr.Ashok 9875874869");}
            else if(sr.isSelected()==true){
                jPanel1.setVisible(true);
                jScrollPane2.setVisible(true);
                String namein=tf1.getText().trim();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                
                if(namein.equals("")){ JOptionPane.showMessageDialog(null,"Enter a name");}
                else {try{
                    model.setRowCount(0);
Class.forName("java.sql.DriverManager");
                    Connection con=(Connection)
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/snudirectory",
                            "root", "prerna");
                   String hostel;int count=0;
                    Statement stmt2 = (Statement) con.createStatement();
                    String query2="SELECT Hostel  FROM Student WHERE Name LIKE '"+(namein+" ")+"%' OR Name LIKE '"+namein+"' OR Name LIKE '%"+(" "+namein)+"';";
                    ResultSet rs2=stmt2.executeQuery(query2);
                    while(rs2.next()){
                       hostel = rs2.getString("Hostel");
                    Statement stmt3 = (Statement) con.createStatement();
                       String query3="SELECT Name,Email_ID,Phone_Num FROM Student WHERE Hostel='"+hostel+"';";
                    ResultSet rs3=stmt3.executeQuery(query3);
                      while(rs3.next())
                      {String data1 = rs3.getString("Name")+"("+rs2.getString("Hostel")+")";
                        String data2 = rs3.getString("Email_ID");
                        String data3 = rs3.getString("Phone_Num");
                        Object[] row = { data1, data2,data3};
                        count++;
                        model.addRow(row);}
                    }

                if(count<=0){ JOptionPane.showMessageDialog(null,"Student not found");}
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }}
            }
        } else{JOptionPane.showMessageDialog(null,"Please select an option");
        }
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_comboActionPerformed

    private void hide(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hide
        l1.setVisible(false);
        l2.setVisible(false);jPanel1.setVisible(false);
        tf1.setVisible(false);
        combo.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_hide

    private void frActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frActionPerformed
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.setRowCount(0);
                l1.setVisible(false);
        tf1.setVisible(false);
        l2.setVisible(true);
        l2.setText("Select Department");
        combo.setVisible(true);jPanel1.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_frActionPerformed

    private void wrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrActionPerformed
        l1.setVisible(false);
        l2.setVisible(false);
        tf1.setVisible(false);
        combo.setVisible(false);jPanel1.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_wrActionPerformed

    private void srActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srActionPerformed
        l1.setVisible(true);
        tf1.setVisible(true);
        l2.setVisible(false);jPanel1.setVisible(false);
        combo.setVisible(false);
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.setRowCount(0);// TODO add your handling code here:
}//GEN-LAST:event_srActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained

DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.setRowCount(0); // TODO add your handling code here:
    }//GEN-LAST:event_tf1FocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox combo;
    private javax.swing.JRadioButton fr;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JRadioButton sr;
    private javax.swing.JTextField tf1;
    private javax.swing.JRadioButton wr;
    // End of variables declaration//GEN-END:variables

}
