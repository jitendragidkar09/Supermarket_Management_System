package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Selling extends javax.swing.JFrame {

    public Selling() {
        initComponents();
        selectSeller();
        getCat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pCategory = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Products = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTxt = new javax.swing.JTextArea();
        grTotal = new javax.swing.JLabel();
        filterBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("BILLING POINT");

        pId.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        pId.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("BILL ID");

        jLabel3.setBackground(new java.awt.Color(240, 240, 240));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Name");

        pQuantity.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        pQuantity.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setBackground(new java.awt.Color(240, 240, 240));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("QUANTITY");

        pName.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        pName.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setBackground(new java.awt.Color(240, 240, 240));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("Filter By");

        pCategory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pCategory.setForeground(new java.awt.Color(255, 51, 0));
        pCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pCategoryItemStateChanged(evt);
            }
        });
        pCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCategoryMouseClicked(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 51, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add To Bill");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        printBtn.setBackground(new java.awt.Color(255, 51, 0));
        printBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("PRINT");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 0));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Refresh");
        DeleteBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DeleteBtnStateChanged(evt);
            }
        });
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DeleteBtnPropertyChange(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 51, 0));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        Products.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        Products.setRowHeight(25);
        Products.setSelectionBackground(new java.awt.Color(255, 51, 0));
        Products.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Products);

        jLabel7.setBackground(new java.awt.Color(240, 240, 240));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("PRODUCTS LIST");

        billTxt.setColumns(20);
        billTxt.setRows(5);
        jScrollPane2.setViewportView(billTxt);

        grTotal.setBackground(new java.awt.Color(255, 255, 255));
        grTotal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        grTotal.setForeground(new java.awt.Color(255, 51, 0));
        grTotal.setText("Rs");

        filterBtn.setBackground(new java.awt.Color(255, 51, 0));
        filterBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        filterBtn.setForeground(new java.awt.Color(255, 255, 255));
        filterBtn.setText("Filter");
        filterBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                filterBtnStateChanged(evt);
            }
        });
        filterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterBtnMouseClicked(evt);
            }
        });
        filterBtn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                filterBtnPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pId, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(pName)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearBtn)
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(printBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(grTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(210, 210, 210))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeBtn.setBackground(new java.awt.Color(255, 51, 0));
        closeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(240, 240, 240));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOGOUT");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closeBtn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection cn=null;
    PreparedStatement ps=null;
    Statement smt=null;
    ResultSet rs=null;
    
    public void selectSeller(){
        try{
         //Load the driver class
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection
		
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");
		
	//Make the statement object
         smt=cn.createStatement();
         rs=smt.executeQuery("select * from Products");
         Products.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    int prId,newQty;
    public void update(){
      try{
        //Load the driver class
       Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection		
       Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");

 String query = "UPDATE Products SET quantity=? WHERE id=?";
        PreparedStatement ps = cn.prepareStatement(query);
        ps.setInt(1, newQty);
        ps.setInt(2, prId);
    int i = ps.executeUpdate();
	 //JOptionPane.showMessageDialog(this, "Seller Updated");
        selectSeller();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
    int i = 0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
    try{
         DefaultTableModel model=(DefaultTableModel)Products.getModel();
         int myIndex=Products.getSelectedRow();
       if(pQuantity.getText().isEmpty()||pName.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "Missing Information");
   }  
        else if(availQty<Integer.parseInt(pQuantity.getText())){
       JOptionPane.showMessageDialog(this, "Not Enough In Stock");
        }
   else{
   i++;
   uPrice=(Double.parseDouble(model.getValueAt(myIndex, 3).toString()));
   pTotal=uPrice*(Double.parseDouble(pQuantity.getText()));
   grdTotal=grdTotal+pTotal;
   if(i==1){
   billTxt.setText(billTxt.getText()+"\t****************FAMILY POINT************\n"+"\t NUM    PRODUCT    PRICE   QUANTITY   TOTAL\n\t"+i+"              "+pName.getText()+"             "+uPrice+"            "+pQuantity.getText()+"             "+pTotal+"\n\t");
   }
   else{
   billTxt.setText(billTxt.getText()+i+"           "+pName.getText()+"          "+uPrice+"         "+pQuantity.getText()+"           "+pTotal+"\n\t");
   }
   grTotal.setText("Rs"+grdTotal);
   }
       update();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseClicked
     try{
         billTxt.print();
     }catch(Exception e){
     }
    }//GEN-LAST:event_printBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
      selectSeller();
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        pId.setText("");
        pName.setText("");
        pQuantity.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

     private void getCat(){
     try{
        //Load the driver class	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection	
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");
		
	//Make the statement object
         smt=cn.createStatement();
         String query="select * from Categories";
         rs=smt.executeQuery(query);
         while(rs.next()){
         String myCat=rs.getString("name");
            pCategory.addItem(myCat);
         }
        }catch(Exception e){
        e.printStackTrace();
        }
     }
     
    double uPrice=0.0,pTotal=0.0,grdTotal=0.0;
    int availQty=0;
    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
       try{
        DefaultTableModel model=(DefaultTableModel)Products.getModel();
        int myIndex=Products.getSelectedRow();
        prId=Integer.parseInt(model.getValueAt(myIndex, 0).toString());
        pId.setText(model.getValueAt(myIndex,0).toString());
        pName.setText(model.getValueAt(myIndex, 1).toString());
        availQty=Integer.parseInt(model.getValueAt(myIndex,2 ).toString());
        newQty=availQty-(Integer.parseInt(pQuantity.getText()));
//        uPrice=(Double.parseDouble(model.getValueAt(myIndex, 3).toString()));
//        pTotal=uPrice*(Double.parseDouble(pQuantity.getText()));
//        grdTotal=grdTotal+pTotal;
        //pPrice.setText(model.getValueAt(myIndex, 2).toString());
        //pQuantity.setText(model.getValueAt(myIndex, 3).toString());
        }catch(Exception e){
            System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_ProductsMouseClicked
  
    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void pCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCategoryMouseClicked
       try{
         //Load the driver class	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection	
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");
		
	//Make the statement object
         smt=cn.createStatement();
         rs=smt.executeQuery("select * from Products where name='"+pCategory.getSelectedItem().toString()+"'");
         Products.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_pCategoryMouseClicked

    private void DeleteBtnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DeleteBtnPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnPropertyChange

    private void DeleteBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DeleteBtnStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnStateChanged

    private void pCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pCategoryItemStateChanged
         try{
         //Load the driver class	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection	
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");
		
	//Make the statement object
         smt=cn.createStatement();
         rs=smt.executeQuery("select * from Products where name='"+pCategory.getSelectedItem().toString()+"'");
         Products.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_pCategoryItemStateChanged

    private void filterBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_filterBtnStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBtnStateChanged

    private void filterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBtnMouseClicked
       try{
         //Load the driver class	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//create the connection	
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","root");
		
	//Make the statement object
         smt=cn.createStatement();
         rs=smt.executeQuery("select * from products where category='"+pCategory.getSelectedItem().toString()+"'");
         Products.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_filterBtnMouseClicked

    private void filterBtnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_filterBtnPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBtnPropertyChange

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTable Products;
    private javax.swing.JTextArea billTxt;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton filterBtn;
    private javax.swing.JLabel grTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> pCategory;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pQuantity;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
