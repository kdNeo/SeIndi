/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.DB;
import VALIDATE.Validation;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Damith
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        jScrollPane1.setVisible(false);
        // jScrollPane2.setVisible(false);
        autoGen();
        showDate();
        showTime();
        Search();
        clearText();
        // setDefaultCloseOperation(Home.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        searchFiled1 = new javax.swing.JTextField();
        Product_Name = new javax.swing.JLabel();
        Customer_Name = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_quantity = new javax.swing.JTextField();
        txt_ProductID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Unit_Price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_netTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_discount = new javax.swing.JTextField();
        txt_balance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 175, 120));

        searchFiled1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFiled1ActionPerformed(evt);
            }
        });
        searchFiled1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFiled1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFiled1KeyTyped(evt);
            }
        });
        jPanel2.add(searchFiled1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 175, 30));
        jPanel2.add(Product_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, 30));
        jPanel2.add(Customer_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jTextField3.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Invoice ID");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });
        txt_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_quantityKeyTyped(evt);
            }
        });

        txt_ProductID.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product ID");

        txt_Unit_Price.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unit Price");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Unit_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Unit_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Unit Price", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Discount");

        txt_netTotal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txt_netTotalComponentAdded(evt);
            }
        });
        txt_netTotal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_netTotalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txt_netTotal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_netTotalInputMethodTextChanged(evt);
            }
        });
        txt_netTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_netTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_netTotalKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cash");

        txt_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cashKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Balance");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Net Total");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sub Total");

        txt_discount.setText("0");
        txt_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_discountActionPerformed(evt);
            }
        });
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_discountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_discountKeyTyped(evt);
            }
        });

        txt_balance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_balanceKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_netTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_discount)
                        .addComponent(txt_cash)
                        .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txt_netTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Invoice", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Invoice");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 24, 117, 53));

        Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 222, 29));

        Time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 120, 30));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Close Window_30px.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Minimize Window_30px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int x = 0;

        try {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String pid = jTable1.getValueAt(i, 0).toString();
                String p_name = jTable1.getValueAt(i, 1).toString();
                String quantity = jTable1.getValueAt(i, 2).toString();
                String unit_price = jTable1.getValueAt(i, 3).toString();
                String sub_total = jTable1.getValueAt(i, 4).toString();

                DB.iud("insert into invoice (product_name, unit_price, qty, discount, nettotal, cash, balance, date, time) values "
                        + "( '" + p_name + "', '" + unit_price + "', '" + quantity + "', '" + txt_discount.getText() + "', '" + txt_netTotal.getText() + "', '" + txt_cash.getText() + "', '" + txt_balance.getText() + "', '" + Date.getText() + "', '" + Time.getText() + "')");

                ResultSet rs = DB.search("select inv_id from invoice where inv_id='" + jTextField3.getText() + "'");
                if (rs.next()) {
                    x = Integer.parseInt(rs.getString("inv_id").toString());
                }

                DB.iud("insert into invoice_item (invoice_inv_id, product_pid, product_Name, unit_price, qty, total, cash, balance, date, time) values "
                        + "('" + x + "', '" + pid + "', '" + p_name + "', '" + unit_price + "', '" + quantity + "', '" + sub_total + "', '" + txt_cash.getText() + "', '" + txt_balance.getText() + "', '" + Date.getText() + "', '" + Time.getText() + "')");

                calculatetodeduct(pid, quantity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(rootPane, "INVOICE HAS SAVED!");
        dtm.setRowCount(0);
        clearText();
        autoGen();
        this.dispose();
        MenuForm m=new MenuForm();
        m.setVisible(true);
        //  Customer_Name.setText("");

        //txt_CustomerID.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyReleased
        try {
            Double a = Double.parseDouble(txt_subtotal.getText());
            Double b = Double.parseDouble(txt_discount.getText());
            Double c = (a * b) / 100;

            Double net = a - c;
            txt_netTotal.setText(net + "");
        } catch (NumberFormatException e) {
            System.out.println("this ok" + e);
        }
    }//GEN-LAST:event_txt_discountKeyReleased

    private void txt_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_discountActionPerformed
        txt_cash.requestFocus();
    }//GEN-LAST:event_txt_discountActionPerformed

    private void txt_cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyReleased
        try {
            Double a = Double.parseDouble(txt_cash.getText());
            Double b = Double.parseDouble(txt_netTotal.getText());

            Double c = a - b;

            txt_balance.setText(c + "");

        } catch (NumberFormatException e) {
            System.out.println("This is ok" + e);
        }
    }//GEN-LAST:event_txt_cashKeyReleased

    private void txt_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantityKeyTyped
        Validation.isNumaric(evt);
        Validation.checkLength(evt, txt_quantity.getText(), 15);
    }//GEN-LAST:event_txt_quantityKeyTyped

    private void txt_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantityKeyReleased

    }//GEN-LAST:event_txt_quantityKeyReleased

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int qty = Integer.parseInt(txt_quantity.getText());
        Double unit_p = Double.parseDouble(txt_Unit_Price.getText());

        Double tot = qty * unit_p;
        try {
            Vector v = new Vector();

            v.add(txt_ProductID.getText());
            v.add(Product_Name.getText());
            v.add(txt_quantity.getText());
            v.add(txt_Unit_Price.getText());
            v.add(tot);

            dtm.addRow(v);

            Double sub = 0.0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                sub += Double.parseDouble(dtm.getValueAt(i, 4).toString());
                txt_subtotal.setText("" + sub + "0");

                txt_discount.requestFocus();
                txt_ProductID.setText("");
                txt_Unit_Price.setText("");
                txt_quantity.setText("");
                Product_Name.setText("");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void searchFiled1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFiled1KeyReleased
        try {
            ResultSet rs = DB.search("select product_name from product where product_name like '" + searchFiled1.getText() + "%'");

            Vector v = new Vector();
            while (rs.next()) {
                jScrollPane1.setVisible(true);
                v.add(rs.getString("product_name"));
            }
            jList1.setListData(v);

            if (searchFiled1.getText().isEmpty()) {
                jScrollPane1.setVisible(false);
            }
            if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
                jList1.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchFiled1KeyReleased

    private void searchFiled1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFiled1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFiled1ActionPerformed

    private void jList1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                ResultSet rs = DB.search("select pid, selling_price from product where product_name='" + jList1.getSelectedValue().toString() + "'");
                while (rs.next()) {
                    txt_ProductID.setText(rs.getString("pid"));
                    txt_Unit_Price.setText(rs.getString("selling_price"));

                }

                ResultSet rs1 = DB.search("select product_name from product where product_name='" + jList1.getSelectedValue().toString() + "'");
                while (rs1.next()) {
                    searchFiled1.setText(rs1.getString("product_name"));
                    jScrollPane1.setVisible(false);
                    String s = searchFiled1.getText();
                    Product_Name.setText(s);
                    searchFiled1.setText("");
                    txt_quantity.requestFocus();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jList1KeyReleased

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
        MenuForm f = new MenuForm();
        f.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void searchFiled1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFiled1KeyTyped
        Validation.isCharacter(evt);
        Validation.checkLength(evt, searchFiled1.getText(), 15);
    }//GEN-LAST:event_searchFiled1KeyTyped

    private void txt_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyTyped
        Validation.isNumaric(evt);
        Validation.checkLength(evt, txt_discount.getText(), 15);
    }//GEN-LAST:event_txt_discountKeyTyped

    private void txt_cashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyTyped
        Validation.isNumaric(evt);
        Validation.checkLength(evt, txt_cash.getText(), 15);
    }//GEN-LAST:event_txt_cashKeyTyped

    private void txt_netTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_netTotalKeyTyped

    }//GEN-LAST:event_txt_netTotalKeyTyped

    private void txt_balanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_balanceKeyTyped
        Validation.checkLength(evt, txt_balance.getText(), 5);
    }//GEN-LAST:event_txt_balanceKeyTyped

    private void txt_netTotalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_netTotalAncestorAdded

    }//GEN-LAST:event_txt_netTotalAncestorAdded

    private void txt_netTotalInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_netTotalInputMethodTextChanged

    }//GEN-LAST:event_txt_netTotalInputMethodTextChanged

    private void txt_netTotalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_netTotalComponentAdded
        // Validation.checkLength(evt,txt_netTotal.getText(),5);
    }//GEN-LAST:event_txt_netTotalComponentAdded

    private void txt_netTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_netTotalKeyReleased
//      Validation.checkLength(evt,txt_netTotal.getText(),5);
    }//GEN-LAST:event_txt_netTotalKeyReleased

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                } catch (Exception e) {
                }
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer_Name;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Product_Name;
    private javax.swing.JLabel Time;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField searchFiled1;
    private javax.swing.JTextField txt_ProductID;
    private javax.swing.JTextField txt_Unit_Price;
    private javax.swing.JLabel txt_balance;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JLabel txt_netTotal;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JLabel txt_subtotal;
    // End of variables declaration//GEN-END:variables

    private void autoGen() {
        try {
            ResultSet rs = DB.search("select max(inv_id) from invoice");
            while (rs.next()) {
                int i = rs.getInt("max(inv_id)");
                jTextField3.setText(i + 1 + "");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d, yyyy");
        String s = sdf.format(d);
        Date.setText(s);
    }

    private void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");
                String s = sdf.format(d);
                Time.setText(s);
            }
        }).start();

    }

    private void Search() {
        // PromptSupport.setPrompt("Search Customer", Searchfield2);
        PromptSupport.setPrompt("Search Product", searchFiled1);
    }

    private void clearText() {
        txt_subtotal.setText("");
        txt_discount.setText("");
        txt_netTotal.setText("");
        txt_cash.setText("");
        txt_balance.setText("");
    }

    private void calculatetodeduct(String id, String qty) {
        try {
            ResultSet rs = DB.search("SELECT *,ph.qty AS x FROM product p INNER JOIN product_has_stock ph ON p.pid = ph.product_pid INNER JOIN stock s ON ph.stock_sid = s.sid WHERE p.pid = '" + id + "'");
            while (rs.next()) {
                String ids = rs.getString("sid");
                double qtys = rs.getDouble("x");
                Double d = Double.valueOf(qty);
                double dedqty = qtys * d;
                DB.iud("UPDATE stock s SET s.qty = s.qty - '" + dedqty + "' WHERE s.sid = '" + ids + "'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}