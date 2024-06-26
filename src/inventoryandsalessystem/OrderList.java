/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryandsalessystem;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author thasi
 */
public class OrderList extends javax.swing.JFrame {

    /**
     * Creates new form inventory_list
     */
    private DBConnect dbc;
    private ResultSet rs=null;
    public OrderList() {
        setLocation(500,50);
        initComponents();
       
        display_table();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        d_row = new javax.swing.JButton();
        to = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        from = new com.toedter.calendar.JDateChooser();
        cancel = new javax.swing.JButton();
        plc_order = new javax.swing.JButton();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(215, 215, 249));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order no", "Product name", "catagory", "supplier id", "unit price", "quantity", "total", "Order_date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(5);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        d_row.setBackground(new java.awt.Color(255, 255, 255));
        d_row.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        d_row.setText("Delete Row");
        d_row.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        d_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_rowActionPerformed(evt);
            }
        });

        to.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        to.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("To:");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("From:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        from.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        from.setDateFormatString("yyyy-MM-dd");

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        plc_order.setBackground(new java.awt.Color(255, 255, 255));
        plc_order.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        plc_order.setText("Place Order");
        plc_order.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        plc_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plc_orderActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        show.setText("Show_list");
        show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d_row, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plc_order, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(d_row, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(plc_order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_rowActionPerformed
         try{    
    dbc=new DBConnect();
     try{
        dbc.connectToDB();
        
    }
      catch(ClassNotFoundException e) { }
     
     DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
     int row=jTable1.getSelectedRow();
     String id=model.getValueAt(row,0).toString();
     System.out.println(id);
     //int a=Integer.parseInt(id);
     String sql="delete from purchase_order where order_no='"+id+"' ";
    
     
      System.out.println("werrt...");
     
     if(dbc.insertDataToDB(sql)==true)
     {
          System.out.println("Deleted...");
         
         System.out.println("Deleted...");
     }
     //dbc.insertDataToDB(sql1);
     remove();
     
     display_table();
        
    
     
     String s_id,p_name,brd,cat,up,qnt,inv,rst,unit;
     
      
    closeDB();
    }
    
    catch(SQLException e){}
    }//GEN-LAST:event_d_rowActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          try{    
    dbc=new DBConnect();
     try{
        dbc.connectToDB();
        
    }
      catch(ClassNotFoundException e) { }
     remove();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
     String sd = sdf.format(from.getDate());
     String ss="select * from purchase_order natural join product_entry where order_date>='"+sd+"'";
     
     rs=dbc.getDatafromDB(ss);
     
     String o_no,s_id,p_name,brd,cat,up,qnt,inv,dt,stus;
     while(rs.next())
     {
         o_no=rs.getString("order_no");
         p_name=rs.getString("p_name");
         cat=rs.getString("catagory");
         s_id=rs.getString("supplier_id");
         System.out.println(s_id);
         brd=rs.getString(3);
         
         
         up=rs.getString("unit_price");
         qnt=rs.getString("qnt");
         inv=rs.getString("total");
         dt=rs.getString("order_date");
         stus=rs.getString("status");
         
         //open_b=rs.getString("open_balance");
         String content[]={o_no,p_name,cat,s_id,up,qnt,inv,dt,stus};
         DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
         model1.addRow(content);
         
         
     }
      
    closeDB();
    }
    
    catch(SQLException e){}
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         try{    
    dbc=new DBConnect();
     try{
        dbc.connectToDB();
        
    }
      catch(ClassNotFoundException e) { }
     remove();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
     String sd = sdf.format(from.getDate());
     String t = sdf.format(to.getDate());
     String ss="select * from purchase_order natural join product_entry where order_date between '"+sd+"' and '"+t+"'";
     
     rs=dbc.getDatafromDB(ss);
     
     String o_no,s_id,p_name,brd,cat,up,qnt,inv,dt,stus;
     while(rs.next())
     {
         o_no=rs.getString("order_no");
         p_name=rs.getString("p_name");
         cat=rs.getString("catagory");
         s_id=rs.getString("supplier_id");
         System.out.println(s_id);
         brd=rs.getString(3);
         
         
         up=rs.getString("unit_price");
         qnt=rs.getString("qnt");
         inv=rs.getString("total");
         dt=rs.getString("order_date");
         stus=rs.getString("status");
         
         //open_b=rs.getString("open_balance");
         String content[]={o_no,p_name,cat,s_id,up,qnt,inv,dt,stus};
         DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
         model1.addRow(content);
         
         
     }
      
    closeDB();
    }
    
    catch(SQLException e){}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void plc_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plc_orderActionPerformed
        purchase_order obj=new purchase_order();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_plc_orderActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        remove();
        display_table();
    }//GEN-LAST:event_showActionPerformed

    /**
     * @param args the command line arguments
     */
    public void display_table()
    {
        
         try{    
    dbc=new DBConnect();
     try{
        dbc.connectToDB();
        
    }
      catch(ClassNotFoundException e) { }
     String ss="select * from purchase_order natural join product_entry";
     
     rs=dbc.getDatafromDB(ss);
     
     String o_no,s_id,p_name,brd,cat,up,qnt,inv,dt,stus;
     while(rs.next())
     {
         o_no=rs.getString("order_no");
         p_name=rs.getString("p_name");
         cat=rs.getString("catagory");
         s_id=rs.getString("supplier_id");
         System.out.println(s_id);
         brd=rs.getString(3);
         
         
         up=rs.getString("unit_price");
         qnt=rs.getString("qnt");
         inv=rs.getString("total");
         dt=rs.getString("order_date");
         stus=rs.getString("status");
         
         //open_b=rs.getString("open_balance");
         String content[]={o_no,p_name,cat,s_id,up,qnt,inv,dt,stus};
         DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
         model1.addRow(content);
         
         
     }
      
    closeDB();
    }
    
    catch(SQLException e){}
        
        
        
        
    }
    
    private void remove()
    {
        DefaultTableModel model2=(DefaultTableModel)jTable1.getModel();
        int row=model2.getRowCount();
        for(int i=row-1;i>=0;i--)
        {
            model2.removeRow(i);
        }
    }
    private void closeDB(){
        try{
            dbc.disconnectFromDB();
        }catch(Exception e){}
        }
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
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton d_row;
    private com.toedter.calendar.JDateChooser from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton plc_order;
    private javax.swing.JButton show;
    private com.toedter.calendar.JDateChooser to;
    // End of variables declaration//GEN-END:variables
}
