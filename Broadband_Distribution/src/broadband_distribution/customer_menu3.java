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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ishfaq
 */
public class customer_menu3 extends javax.swing.JInternalFrame {

    /**
     * Creates new form customer_menu3
     */
    public customer_menu3() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM customer";
            ResultSet resultSet = statement
                    .executeQuery(sql);

            while (resultSet.next()) {

                String id = resultSet.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");

                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                String p  = resultSet.getString("packageN");

                String tData[] = {id, fname, femail, fAd,fNo, p};
                DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                tbm1.addRow(tData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        csTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        dline = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pack = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(750, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 540));

        csTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        csTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "EMAIL", "ADDRESS", "PHONE  NO", "PAKAGE NO"
            }
        ));
        csTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(csTable);

        jButton6.setBackground(new java.awt.Color(0, 203, 133));
        jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 203, 133));
        jButton8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton8.setText("DELETE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });

        contactNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contactNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactNoFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("SERACH BY :");

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Pakage");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("ENTER KEYWORDS :");

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("SREACH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        dline.setBorder(null);
        dline.setOpaque(false);

        pack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pack.setToolTipText("");
        pack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pack.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                packFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                packFocusLost(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "ID" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 203, 133));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("PHONE NO");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("ADDRESS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(contactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pack, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(address)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dline, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton4))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton8)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dline, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void csTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csTableMouseClicked
        // TODO add your handling code here:
        
        
          DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();

        String tid = tbm1.getValueAt(csTable.getSelectedRow(), 0).toString();

        String tName = tbm1.getValueAt(csTable.getSelectedRow(), 1).toString();
        String temail = tbm1.getValueAt(csTable.getSelectedRow(), 2).toString();
        String tadd = tbm1.getValueAt(csTable.getSelectedRow(), 3).toString();
        String tcontact = tbm1.getValueAt(csTable.getSelectedRow(), 4).toString();
         String p = tbm1.getValueAt(csTable.getSelectedRow(), 5).toString();
        id.setText(tid);
        name.setText(tName);
        email.setText(temail);
        address.setText(tadd);
        contactNo.setText(tcontact);
        pack.setText(p);
    }//GEN-LAST:event_csTableMouseClicked

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        // TODO add your handling code here:

        if(name.getText().equals("FirstName"))
        {
            name.setText("");
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        // TODO add your handling code here:
        if(name.getText().equals(""))
        {
            name.setText("FirstName");
        }
    }//GEN-LAST:event_nameFocusLost

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
        if(address.getText().equals("ADDRESS"))
        {
            address.setText("");
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
        if(address.getText().equals(""))
        {
            address.setText("ADDRESS");
        }
    }//GEN-LAST:event_addressFocusLost

    private void contactNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNoFocusGained
        // TODO add your handling code here:
        if(contactNo.getText().equals("PHONE NO"))
        {
            contactNo.setText("");
        }
    }//GEN-LAST:event_contactNoFocusGained

    private void contactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNoFocusLost
        // TODO add your handling code here:
        if(contactNo.getText().equals(""))
        {
            contactNo.setText("PHONE NO");
        }
    }//GEN-LAST:event_contactNoFocusLost

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:
        if(id.getText().equals("ID"))
        {
            id.setText("");
        }

    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        // TODO add your handling code here:
        if(id.getText().equals(""))
        {
            id.setText("ID");
        }
    }//GEN-LAST:event_idFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:

        if(email.getText().equals("EMAIL"))
        {
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(email.getText().equals(""))
        {
            email.setText("EMAIL");
        }
    }//GEN-LAST:event_emailFocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM customer";
            ResultSet resultSet = statement
                    .executeQuery(sql);

            while (resultSet.next()) {

                String id = resultSet.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");

                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                String p  = resultSet.getString("packageN");

                String tData[] = {id, fname, femail, fAd,fNo, p};
                DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                tbm1.addRow(tData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void packFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packFocusLost
        // TODO add your handling code here:
        if(pack.getText().equals(""))
        {
            pack.setText("SALARY");
        }
    }//GEN-LAST:event_packFocusLost

    private void packFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packFocusGained
        // TODO add your handling code here:
        if(pack.getText().equals("SALARY"))
        {
            pack.setText("");
        }
    }//GEN-LAST:event_packFocusGained

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        
          String tname = "", temail = "", taddress = "", customerId = "",p="";
        int tNo;
        
        String pNam="", pno="";
        DefaultTableModel defaultTableModel = (DefaultTableModel) csTable.getModel();

        if (csTable.getSelectedRowCount() == 1) {
            //   System.out.println("at update");

            tname = name.getText();
            temail = email.getText();
            taddress = address.getText();
            tNo = Integer.parseInt(contactNo.getText());
            p=pack.getText();
            

            int row = csTable.getSelectedRow();
            customerId = defaultTableModel.getValueAt(row, 0).toString();
            // CustomerProfile(customerId).setVisible(true);
          //  CustomerProfile cp= new CustomerProfile(customerId.getText());

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");
                
                          Statement statement = connection.createStatement();

                

                String sql = "UPDATE customer SET cName='" + tname + "', cEmail='" + temail + "',cAdress='" + taddress + "',cPhoneNo=" + tNo + ", packageN='" + p +"' where customerId = " + Integer.parseInt(customerId) + ";";

                PreparedStatement prepare = connection.prepareStatement(sql);

                prepare.executeUpdate();
                
                
                 ResultSet resultSet1 = statement.executeQuery("Select pNo,price_Per_month from pakages where pName= ('" + p + "');" );
                  if (resultSet1.next()) {
                 pNam = resultSet1.getString("price_Per_month");
                pno = resultSet1.getString("pNo");
                
     String sql2 = "UPDATE bill SET amount='" + Integer.parseInt(pNam) + "' where customerId = " + Integer.parseInt(customerId) + ";";
    PreparedStatement prepare1 = connection.prepareStatement(sql2);

                prepare1.executeUpdate();
                  }
               
                DefaultTableModel tbm = (DefaultTableModel) csTable.getModel();
                tbm.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Successfully Updated.");
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        String tname = "", temail = "", taddress = "", customerId = "", p="";
        int tNo;
        DefaultTableModel defaultTableModel = (DefaultTableModel) csTable.getModel();

        if (csTable.getSelectedRowCount() == 1) {

            tname = name.getText();
            temail = email.getText();
            taddress = address.getText();
            tNo = Integer.parseInt(contactNo.getText());
            p=pack.getText();

            int row = csTable.getSelectedRow();
            customerId = defaultTableModel.getValueAt(row, 0).toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            

               Statement statement = connection.createStatement();

             String sql = "DELETE FROM helpline WHERE customerId = " + Integer.parseInt(customerId) + ";";

               PreparedStatement prepare = connection.prepareStatement(sql);

               prepare.executeUpdate();
                    
                  String sql2 = "DELETE FROM bill WHERE customerId = " + Integer.parseInt(customerId) + ";";
            PreparedStatement prepare2 = connection.prepareStatement(sql2);

                    prepare2.executeUpdate();
                    
                    
                    
           
                    String sql3 = "DELETE FROM customer WHERE customerId = " + Integer.parseInt(customerId) + ";";
 
                  PreparedStatement prepare3 = connection.prepareStatement(sql3);

                    prepare3.executeUpdate();   
                    
                    
                    
                     DefaultTableModel tbm = (DefaultTableModel) csTable.getModel();
                tbm.setRowCount(0);

                    JOptionPane.showMessageDialog(this, "Deleted Successfully");

                
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            if (csTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty");

            } else {
                JOptionPane.showMessageDialog(this, "Please select a row for delete. ");
            }

        }

        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tbm = (DefaultTableModel) csTable.getModel();
                tbm.setRowCount(0);
        String value = jComboBox1.getSelectedItem().toString();
        if (value.equals("NAME")) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

                String dead = dline.getText();
                // String size= jTextField2.getText();

                Statement statement = connection.createStatement();

                //String Client_Name = null;
                //String Email = null;
                //String sql="SELECT cName,cPhoneNo FROM customer WHERE customerId = '"+ Integer.parseInt(dead) +"'";
                // String sql= "SELECT customer.cName, bill.amount,bill.deadline, bill.status,customer.cPhoneNo From bill INNER JOIN customer ON bill.customerId=customer.customerId  WHERE customerId = '"+ Integer.parseInt(dead) +"'";
                //    ResultSet resultSet = statement.executeQuery
                ResultSet resultSet = statement.executeQuery("SELECT  * From customer  where customer.cName like '%" + dead + "%' ");
                if (resultSet.next()) {

                     String id = resultSet.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");

                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                String p  = resultSet.getString("packageN");

                    String tData[] = {id,fname,femail,fAd,fNo,p};
                    DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                    tbm1.addRow(tData);

                } else {
                    JOptionPane.showMessageDialog(this, "Enter Keyword");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (value.equals("ID")) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

                String dead = dline.getText();
                // String size= jTextField2.getText();

                Statement statement = connection.createStatement();

                //String Client_Name = null;
                //String Email = null;
                //String sql="SELECT cName,cPhoneNo FROM customer WHERE customerId = '"+ Integer.parseInt(dead) +"'";
                // String sql= "SELECT customer.cName, bill.amount,bill.deadline, bill.status,customer.cPhoneNo From bill INNER JOIN customer ON bill.customerId=customer.customerId  WHERE customerId = '"+ Integer.parseInt(dead) +"'";
                //    ResultSet resultSet = statement.executeQuery
                ResultSet resultSet = statement.executeQuery(" SELECT  * From customer  where customer.customerId like '" + Integer.parseInt(dead) + "'");
                if (resultSet.next()) {

                       String id = resultSet.getString("customerId");
                String fname = resultSet.getString("cName");
                String femail = resultSet.getString("cEmail");

                String fAd = resultSet.getString("cAdress");
                String fNo = resultSet.getString("cPhoneNo");
                String p  = resultSet.getString("packageN");

                    String tData[] = {id,fname,femail,fAd,fNo,p};

                    
                    DefaultTableModel tbm1 = (DefaultTableModel) csTable.getModel();
                    tbm1.addRow(tData);

                } else {
                    JOptionPane.showMessageDialog(this, "Enter Keyword");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }            
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTable csTable;
    private javax.swing.JTextField dline;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pack;
    // End of variables declaration//GEN-END:variables
}
