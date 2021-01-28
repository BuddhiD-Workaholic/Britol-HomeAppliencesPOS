package FrontEnd;

import Model.OrderMultiProduct;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class OrderProductsUI extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int OrderNo = 1;
    float Totalpay = 0;

    public OrderProductsUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); //Window auto resizing
        show_parts();
    }

    public OrderProductsUI(int Msg) {
        initComponents();
        OrderNo = Msg;
        jLabelOno.setText(String.valueOf(OrderNo));
        show_parts();
    }

//ArrayList
    public ArrayList<OrderMultiProduct> userList() {
        ArrayList<OrderMultiProduct> userList = new ArrayList<>();
        try {
            String sq1 = "SELECT * FROM ordermultivalued";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ database_britolproject", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sq1);

            OrderMultiProduct Cus;
            while (rs.next()) {
                Cus = new OrderMultiProduct(rs.getInt("OrderNo"), rs.getString("ProductID"), rs.getString("PName"), rs.getFloat("Price"), rs.getInt("Quantity"), rs.getFloat("TotalPrice"));
                userList.add(Cus);
            }

        } catch (SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }
        return userList;
    }

    public void show_parts() {
        ArrayList<OrderMultiProduct> list = userList();
        DefaultTableModel model = (DefaultTableModel) OrderDTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getOrderNo();
            row[1] = list.get(i).getProductID();
            row[2] = list.get(i).getPName();
            row[3] = list.get(i).getPrice();
            row[4] = list.get(i).getQuantity();
            row[5] = list.get(i).getTotalPrice();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close3 = new javax.swing.JButton();
        OkayButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtPname = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        txtPID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTot = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderDTable = new javax.swing.JTable();
        Close4 = new javax.swing.JButton();
        OkayButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelOno = new javax.swing.JLabel();

        Close3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Close3.setText("Close");
        Close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close3ActionPerformed(evt);
            }
        });

        OkayButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        OkayButton.setText("Okay");
        OkayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkayButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Product ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Product Name");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Product Price");

        txtPrice.setBackground(new java.awt.Color(0, 51, 255));

        txtPname.setBackground(new java.awt.Color(51, 255, 51));
        txtPname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPnameKeyPressed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        txtPID.setBackground(new java.awt.Color(0, 51, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Quantity");

        txtQuantity.setBackground(new java.awt.Color(0, 255, 0));
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Total");

        txtTot.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButtonAdd)
                .addContainerGap())
        );

        OrderDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Product ID", "Product Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane3.setViewportView(OrderDTable);

        Close4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Close4.setText("Close");
        Close4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close4ActionPerformed(evt);
            }
        });

        OkayButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        OkayButton1.setText("Okay");
        OkayButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkayButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 832, Short.MAX_VALUE)
                        .addComponent(OkayButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Close4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkayButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Order Invoice No :");

        jLabelOno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close3ActionPerformed
        new MakeOrderUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_Close3ActionPerformed

    private void OkayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkayButtonActionPerformed
        try {
            String sel = String.valueOf(OrderNo);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
            String sql1 = "SELECT SUM(TotalPrice) FROM ordermultivalued WHERE OrderNo= " + sel;
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while (rs.next()) {
                Totalpay = Float.parseFloat(rs.getString("SUM(TotalPrice)"));
            }

        } catch (SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }

        try {

            String sql = "UPDATE orderinvoice SET TotalPayableamount=? WHERE OrderNo=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
            pst = con.prepareStatement(sql);
            pst.setFloat(1, Totalpay);
            pst.setInt(3, OrderNo);
            pst.executeUpdate();

        } catch (HeadlessException | NumberFormatException | SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }

        new TotalPaymentFinalUI(OrderNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_OkayButtonActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        try {

            String sql = "INSERT INTO ordermultivalued"
                    + "(OrderNo, ProductID, PName, Price, Quantity, TotalPrice)"
                    + "VALUES (?,?,?,?,?,?)";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
            pst = con.prepareStatement(sql);

            pst.setInt(1, OrderNo);
            pst.setString(2, txtPID.getText());
            pst.setString(3, txtPname.getText());
            pst.setFloat(4, Float.parseFloat(txtPrice.getText()));
            pst.setInt(5, Integer.parseInt(txtQuantity.getText()));
            pst.setFloat(6, Float.parseFloat(txtTot.getText()));
            pst.executeUpdate();

            DefaultTableModel model = (DefaultTableModel) OrderDTable.getModel();
            model.setRowCount(0);
            show_parts();

            JOptionPane.showMessageDialog(rootPane, "Order Invoice Details are Sucesfully Inserted");

        } catch (HeadlessException | NumberFormatException | SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void txtPnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String pCode = txtPname.getText();

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
                String sql1 = "SELECT * FROM product where Name = ?";
                pst = con.prepareStatement(sql1);
                pst.setString(1, pCode);
                rs = pst.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "Product Name not found");
                } else {
                    String pID = rs.getString("ProductID");
                    txtPID.setText(pID);
                    String pPrice = rs.getString("Price");
                    txtPrice.setText(pPrice);
                    String pQuantity = rs.getString("Quantity");
                }

            } catch (SQLException Ex) {
                JOptionPane.showMessageDialog(null, Ex);
            }

        }
    }//GEN-LAST:event_txtPnameKeyPressed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        float Total = 0;

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int Quani = (Integer.parseInt(txtQuantity.getText()));
            float price = Float.parseFloat(txtPrice.getText());
            Total = (price * Quani);
            txtTot.setText(String.valueOf(Total));
        }
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void Close4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close4ActionPerformed
        new MainWindowUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_Close4ActionPerformed

    private void OkayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkayButton1ActionPerformed
         try {
            String sel = String.valueOf(OrderNo);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
            String sql1 = "SELECT SUM(TotalPrice) FROM ordermultivalued WHERE OrderNo= " + sel;
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while (rs.next()) {
                Totalpay = Float.parseFloat(rs.getString("SUM(TotalPrice)"));
            }

        } catch (SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }

        try {

            String sql = "UPDATE orderinvoice SET TotalPayableamount=? WHERE OrderNo=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_britolproject", "root", "");
            pst = con.prepareStatement(sql);
            pst.setFloat(1, Totalpay);
            pst.setInt(2, OrderNo);
            pst.executeUpdate();

        } catch (HeadlessException | NumberFormatException | SQLException Ex) {
            JOptionPane.showMessageDialog(null, Ex);
        }

        new TotalPaymentFinalUI(OrderNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_OkayButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderProductsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close3;
    private javax.swing.JButton Close4;
    private javax.swing.JButton OkayButton;
    private javax.swing.JButton OkayButton1;
    private javax.swing.JTable OrderDTable;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelOno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTot;
    // End of variables declaration//GEN-END:variables
}
