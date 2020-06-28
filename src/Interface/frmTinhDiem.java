package Interface;


import Database.DATABASE;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmTinhDiem extends javax.swing.JPanel
{
    DATABASE db;
    private String sLoiNapDuLieu = "Lỗi nạp dữ liệu.";
    private String sLuuThanhCong = "Lưu dữ liệu thành công.";
    private String sLuuKhongThanhCong = "Lưu dữ liệu không thành công.";

    public frmTinhDiem()
    {
        initComponents();       
        db= new DATABASE();
        loadcb();
    }
    public void ResetForm()
    {        
        DefaultTableModel model = (DefaultTableModel)this.tblTinhDiem.getModel();
        model.setRowCount(0);
        model.setRowCount(0);
        txtDTB.setText("");
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMaMH = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMaSV = new javax.swing.JComboBox();
        txtTenMH = new javax.swing.JTextField();
        txtHoTenSV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTinhDiem = new javax.swing.JTable();
        txtDTB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TÍNH ĐIỂM TRUNG BÌNH MÔN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153)));

        lstMaMH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstMaMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMaMHMouseClicked(evt);
            }
        });
        lstMaMH.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMaMHValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMaMH);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Mã sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("Mã môn học");

        cboMaSV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboMaSV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaSVItemStateChanged(evt);
            }
        });
        cboMaSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMaSVMouseClicked(evt);
            }
        });
        cboMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaSVActionPerformed(evt);
            }
        });

        txtTenMH.setEnabled(false);

        txtHoTenSV.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTenSV, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(txtTenMH))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 204));

        tblTinhDiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblTinhDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lần thi", "Hệ số", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTinhDiem.setRowHeight(25);
        tblTinhDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTinhDiemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTinhDiem);

        txtDTB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDTB.setForeground(new java.awt.Color(255, 0, 0));
        txtDTB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDTB.setDisabledTextColor(new java.awt.Color(0, 51, 255));
        txtDTB.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("Điểm trung bình môn");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BẢNG ĐIỂM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaSVActionPerformed
       
    }//GEN-LAST:event_cboMaSVActionPerformed

    private void lstMaMHValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMaMHValueChanged
   

        
    }//GEN-LAST:event_lstMaMHValueChanged

    private void cboMaSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMaSVMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cboMaSVMouseClicked

    private void tblTinhDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTinhDiemMouseClicked
        // TODO add your handling code here:
        int index = tblTinhDiem.getSelectedRow();
        String dtb = (String) tblTinhDiem.getValueAt(index, 2).toString();
        float d = Float.parseFloat(dtb);
        String hs = (String) tblTinhDiem.getValueAt(index, 1).toString(); 
        int a = Integer.parseInt(hs);

        txtDTB.setText(""+d/a);
        
    }//GEN-LAST:event_tblTinhDiemMouseClicked

    private void cboMaSVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaSVItemStateChanged
        // TODO add your handling code here:
         tblTinhDiem.removeAll();
       
        try {
           
            String masv = cboMaSV.getSelectedItem().toString();
            
            String sSQL = "SELECT MaMH FROM Diem where masv='"+masv+"'";
            ResultSet rs = db.TruyVan(sSQL);
            DefaultListModel a = new DefaultListModel();
           
            if(rs == null) 
            {
                JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
                return;
            }
            while(rs.next())
            {
                a.addElement(rs.getString(1));
                
            }
            lstMaMH.setModel(a);
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
        }
       try {           
            String masv = cboMaSV.getSelectedItem().toString();
            String sSQL = "SELECT HotenSV FROM SinhVien where masv='"+masv+"'";
            ResultSet rs = db.TruyVan(sSQL);

           
            if(rs == null) 
            {
                JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
                return;
            }
            while(rs.next())
            {
                txtHoTenSV.setText(rs.getString(1));
                
            }
           
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
        }
    }//GEN-LAST:event_cboMaSVItemStateChanged

    private void lstMaMHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMaMHMouseClicked
        // TODO add your handling code here:
        try {           
            String tenmh = lstMaMH.getSelectedValue().toString();
            String masv = cboMaSV.getSelectedItem().toString();
            String sSQL = "SELECT TenMH FROM MonHoc where MaMH='"+tenmh+"'";
            ResultSet rs = db.TruyVan(sSQL);

           
            if(rs == null) 
            {
                JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
                return;
            }
            while(rs.next())
            {
                txtTenMH.setText(rs.getString(1));
                
            }
           
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
        }
         try {
            String tenmh = lstMaMH.getSelectedValue().toString();
            String masv = cboMaSV.getSelectedItem().toString();
            DefaultTableModel modelTable = new DefaultTableModel();
            String sql = "SELECT LanThi,HeSo,Diem FROM Diem where MaMH='"+tenmh+"'and masv='"+masv+"'";
            ResultSet rs = db.TruyVan(sql);                 
            if(rs == null)
            {
                JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
                return;
            }
            ResultSetMetaData md = rs.getMetaData();
            int numCols = md.getColumnCount();
            Object []arr = new Object[numCols];
            String a[] = {"Lần thi","Hệ số","Điểm"};
            for(int i=0;i<numCols;i++)
                arr[i]=a[i];
            modelTable.setColumnIdentifiers(arr);            
            while(rs.next())
            {
                
                for(int i=0;i<numCols;i++)
                {                 
                  arr[i]=rs.getObject(i+1); 
                }
                                       
                modelTable.addRow(arr);
            }
            tblTinhDiem.setModel(modelTable);
           
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
        }
        
    }//GEN-LAST:event_lstMaMHMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboMaSV;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstMaMH;
    private javax.swing.JTable tblTinhDiem;
    private javax.swing.JTextField txtDTB;
    private javax.swing.JTextField txtHoTenSV;
    private javax.swing.JTextField txtTenMH;
    // End of variables declaration//GEN-END:variables

    private void loadcb() {    
         try {
            String sSQL = "SELECT MaSV FROM SinhVien";
            ResultSet rs = db.TruyVan(sSQL);

            if(rs == null) 
            {
                JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
                return;
            }
            while(rs.next())
            {
                cboMaSV.addItem(rs.getString(1));
               
            }
        } catch (SQLException ex) {
            //Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,sLoiNapDuLieu);
        }
         
        
    }
}
