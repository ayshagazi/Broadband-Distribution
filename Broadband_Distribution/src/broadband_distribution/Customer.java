/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broadband_distribution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        cInfo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        cInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        csTable = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Customer Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        csTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email", "Address", "Contact No"
            }
        ));
        csTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(csTable);

        javax.swing.GroupLayout cInfoLayout = new javax.swing.GroupLayout(cInfo);
        cInfo.setLayout(cInfoLayout);
        cInfoLayout.setHorizontalGroup(
            cInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInfoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cInfoLayout.setVerticalGroup(
            cInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInfoLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(address)
                                .addComponent(email)
                                .addComponent(name))
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add)
                            .addComponent(update)
                            .addComponent(delete)
                            .addComponent(save))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(cInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cInfo.setVisible(true);
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM customer";
            ResultSet resultSet = statement
                    .executeQuery(sql);
            
            while (resultSet.next()) {
                
                String id = resultSet.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");
                //  String ca= resultSet.getString("CoustomerAddress");
                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                
                String tData[] = {id, fname, femail, fAd, fNo};
                DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                tbm1.addRow(tData);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (name.getText().equals("") || email.getText().equals("") || address.getText().equals("") || contactNo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter all data");
        } else {
             String id, tname, temail, taddress, tcontact;
             tname= name.getText();
             temail= email.getText();
             taddress= address.getText();
             tcontact= contactNo.getText();
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO customer ('" + tname + "','" + temail + "','" + taddress + "','" + tcontact + "')";
           // String sql = "SELECT * FROM customer";
           // ResultSet resultSet = statement
                 //   .executeQuery(sql);
             PreparedStatement prepare = connection.prepareStatement(sql);
             
            //while (prepare.next()) {
                
              /*  String id = prepare.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");
                //  String ca= resultSet.getString("CoustomerAddress");
                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                
                String tData[] = {id, fname, femail, fAd, fNo};
                DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                tbm1.addRow(tData);
            
            */
              prepare.executeUpdate();
                
           // }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
            
            
            
            
            
            
            
        /*    
            String data[] = {id.getText(), name.getText(), email.getText(), address.getText(), contactNo.getText()};
            
            DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
            tbm1.addRow(data);
            JOptionPane.showMessageDialog(this, "Added successfully");
            
           // id.setText("");
            name.setText("");
            email.setText("");
            address.setText("");
            contactNo.setText("");
          */  
        }
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
        
        if (csTable.getSelectedRowCount() == 1) {
            tbm1.removeRow(csTable.getSelectedRow());
        } else {
            if (csTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty");
                
            } else {
                JOptionPane.showMessageDialog(this, "Please select a roe for delete. ");
            }
            
        }
        

    }//GEN-LAST:event_deleteActionPerformed

    private void csTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
        
        String tName = tbm1.getValueAt(csTable.getSelectedRow(), 0).toString();
        String temail = tbm1.getValueAt(csTable.getSelectedRow(), 1).toString();
        String tadd = tbm1.getValueAt(csTable.getSelectedRow(), 2).toString();
        String tcontact = tbm1.getValueAt(csTable.getSelectedRow(), 3).toString();
        
        name.setText(tName);
        email.setText(temail);
        address.setText(tadd);
        contactNo.setText(tcontact);

    }//GEN-LAST:event_csTableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
        
        if (csTable.getSelectedRowCount() == 1) {
            /* String tname= name.getText();
     String temail= email.getText();
     String tadd= address.getText();
     String tcnoe= contactNo.getText();
     
      tbm1.getValueAt(csTable.getSelectedRow(), 0).toString();
       tbm1.getValueAt(csTable.getSelectedRow(), 1).toString();
        tbm1.getValueAt(csTable.getSelectedRow(), 2).toString();
         tbm1.getValueAt(csTable.getSelectedRow(), 3).toString();
             */
            
            String tName = tbm1.getValueAt(csTable.getSelectedRow(), 0).toString();
            String temail = tbm1.getValueAt(csTable.getSelectedRow(), 1).toString();
            String tadd = tbm1.getValueAt(csTable.getSelectedRow(), 2).toString();
            String tcontact = tbm1.getValueAt(csTable.getSelectedRow(), 3).toString();
            
            name.setText(tName);
            email.setText(temail);
            address.setText(tadd);
            contactNo.setText(tcontact);
            
            JOptionPane.showMessageDialog(this, "Updated Successfully.");
            
        } else {
            if (csTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
                
            } else {
                JOptionPane.showMessageDialog(this, "Please select a roe for update. ");
            }
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
        if (tbm1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table is empty.");            
        } else {
            String id, name, email, adress, contact;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

                //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
                for (int i = 0; i < tbm1.getRowCount(); i++) {
                    id = tbm1.getValueAt(i, 0).toString();
                    name = tbm1.getValueAt(i, 1).toString();
                    email = tbm1.getValueAt(i, 2).toString();
                    adress = tbm1.getValueAt(i, 3).toString();
                    contact = tbm1.getValueAt(i, 4).toString();
                    
                    Statement statement = connection.createStatement();
                    // String sql = "insert into customer(cName,cEmail,cAdress,cPhnoneNo) values(?,?,?,?,?)";
                    //  statement.executeQuery("INSERT INTO customer ('"+id+"','"+name+"','"+email+"','"+adress+"','"+contact+"')");
                    String sql = "INSERT INTO customer ('" + id + "','" + name + "','" + email + "','" + adress + "','" + contact + "')";
                    // ResultSet resultSet = statement
                    //        .executeQuery(sql);
                    
                    PreparedStatement prepare = connection.prepareStatement(sql);
//           prepare.setString(1, id);
                    prepare.setString(1, name);
                    prepare.setString(2, email);
                    prepare.setString(2, adress);
                    prepare.setString(4, contact);
                    
                    prepare.execute();
                    
                }
                
                JOptionPane.showMessageDialog(this, "DOne");
                
                tbm1.setRowCount(0);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JPanel cInfo;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTable csTable;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
