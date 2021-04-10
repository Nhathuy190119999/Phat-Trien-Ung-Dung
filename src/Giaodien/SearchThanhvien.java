/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

import static Giaodien.viewThanhvien.sqlThanhvien;
import List.ListThanhvien;
import java.sql.PreparedStatement;
import Thucthe.Thanhvien;

/**
 *
 * @author Nhat
 */
public class SearchThanhvien extends javax.swing.JPanel {
    ListThanhvien listThanhvien = new ListThanhvien();
    public static  PreparedStatement ps = null;
    public static String  sqlThanhvien = "select * from Thanhvien order by maThanhvien asc";

    /**
     * Creates new form SearchThanhvien
     */
    public SearchThanhvien() {
        initComponents();
        UpdateTable.LoadData(sqlThanhvien, tblThanhvien);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDsThanhvien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThanhvien = new javax.swing.JTable();
        txtSrchThanhvien = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pnlDsThanhvien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Danh sách thành viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        tblThanhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thành viên", "Tên thành viên", "Địa chỉ", "Số điện thoại", "Ngày hết hạn", "Số CMND"
            }
        ));
        tblThanhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThanhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThanhvien);

        javax.swing.GroupLayout pnlDsThanhvienLayout = new javax.swing.GroupLayout(pnlDsThanhvien);
        pnlDsThanhvien.setLayout(pnlDsThanhvienLayout);
        pnlDsThanhvienLayout.setHorizontalGroup(
            pnlDsThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDsThanhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDsThanhvienLayout.setVerticalGroup(
            pnlDsThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        btnTim.setBackground(new java.awt.Color(102, 0, 102));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_search_24px.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.setActionCommand("");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Nhập tên thành viên hoặc SĐT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtSrchThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnTim)
                .addContainerGap(599, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlDsThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSrchThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(554, 554, 554))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(pnlDsThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblThanhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThanhvienMouseClicked

    }//GEN-LAST:event_tblThanhvienMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        if(this.txtSrchThanhvien.getText().length() == 0){
            String sqll = "Select * from Thanhvien";
            UpdateTable.LoadData(sqll, tblThanhvien);
        }else{
            String sqll = "Select * from Thanhvien where maThanhvien like N'%"+this.txtSrchThanhvien.getText()+"%' "
            + "or tenThanhvien like N'%"+this.txtSrchThanhvien.getText()+"%'"
            + "or diaChi like N'%"+this.txtSrchThanhvien.getText()+"%'"
            + "or cMND like N'%"+this.txtSrchThanhvien.getText()+"%'";
            UpdateTable.LoadData(sqll, tblThanhvien);
        }
    }//GEN-LAST:event_btnTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDsThanhvien;
    private javax.swing.JTable tblThanhvien;
    private javax.swing.JTextField txtSrchThanhvien;
    // End of variables declaration//GEN-END:variables
}