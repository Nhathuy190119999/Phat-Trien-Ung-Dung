/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

import List.ListThanhvien;
import Thucthe.Thanhvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class FormThanhvien extends javax.swing.JPanel {
    ListThanhvien listThanhvien = new ListThanhvien();
    public static  PreparedStatement ps = null;
    public static String  sqlThanhvien = "select * from Thanhvien order by maThanhvien asc";

    /**
     * Creates new form FormThanhvien
     */
    public FormThanhvien() {
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
        pnlTtThanhvien = new javax.swing.JPanel();
        lblTenThanhvien = new javax.swing.JLabel();
        lblMaThanhvien = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        txtMaThanhvien = new javax.swing.JTextField();
        txtTenThanhvien = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        lblSrchThanhvien = new javax.swing.JLabel();
        txtSrchThanhvien = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        pnlDsThanhvien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Danh s??ch th??nh vi??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        tblThanhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? th??nh vi??n", "T??n th??nh vi??n", "?????a ch???", "S??? ??i???n tho???i", "Ng??y h???t h???n", "S??? CMND"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDsThanhvienLayout.setVerticalGroup(
            pnlDsThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDsThanhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTtThanhvien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Th??ng tin th??nh vi??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        lblTenThanhvien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTenThanhvien.setForeground(new java.awt.Color(102, 0, 102));
        lblTenThanhvien.setText("T??n th??nh vi??n:");

        lblMaThanhvien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaThanhvien.setForeground(new java.awt.Color(102, 0, 102));
        lblMaThanhvien.setText("M?? th??nh vi??n:");

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(102, 0, 102));
        lblDiaChi.setText("?????a ch???:");

        lblCMND.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCMND.setForeground(new java.awt.Color(102, 0, 102));
        lblCMND.setText("S??? CMND:");

        lblSoDT.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSoDT.setForeground(new java.awt.Color(102, 0, 102));
        lblSoDT.setText("S??? ??i???n tho???i:");

        javax.swing.GroupLayout pnlTtThanhvienLayout = new javax.swing.GroupLayout(pnlTtThanhvien);
        pnlTtThanhvien.setLayout(pnlTtThanhvienLayout);
        pnlTtThanhvienLayout.setHorizontalGroup(
            pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                        .addComponent(lblMaThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                        .addComponent(lblTenThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenThanhvien))
                    .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiaChi))
                    .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                        .addComponent(lblSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoDT))
                    .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                        .addComponent(lblCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCMND)))
                .addContainerGap())
        );
        pnlTtThanhvienLayout.setVerticalGroup(
            pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtThanhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblMaThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTenThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtThanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSrchThanhvien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSrchThanhvien.setForeground(new java.awt.Color(102, 0, 102));
        lblSrchThanhvien.setText("T??n th??nh vi??n:");

        btnTim.setBackground(new java.awt.Color(102, 0, 102));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTim.setForeground(new java.awt.Color(204, 204, 204));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_search_24px.png"))); // NOI18N
        btnTim.setText("T??m");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(102, 0, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem.setForeground(new java.awt.Color(204, 204, 204));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_add_24px.png"))); // NOI18N
        btnThem.setText("Nh???p m???i");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setBackground(new java.awt.Color(102, 0, 102));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(204, 204, 204));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_save_close_24px.png"))); // NOI18N
        btnLuu.setText("L??u");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 0, 102));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua.setForeground(new java.awt.Color(204, 204, 204));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_approve_and_update_24px.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 0, 102));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 204, 204));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_delete_24px.png"))); // NOI18N
        btnXoa.setText("Xo??");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDsThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTtThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSrchThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtSrchThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTtThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSrchThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSrchThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98))
                    .addComponent(pnlDsThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(this.txtMaThanhvien.getText().equals("") || this.txtTenThanhvien.getText().equals("") || this.txtDiaChi.getText().equals("") || this.txtSoDT.getText().equals("")  || this.txtCMND.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else if(this.txtMaThanhvien.getText().matches("^TV([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "M?? th??nh vi??n theo d???ng TVxx");
        else if(this.txtTenThanhvien.getText().matches("^[a-zA-Z_????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" + \"????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" +\"????????????????????????????????????????????????????????\\\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "T??n kh??ng ch???a k?? t??? ?????c bi???t");
        else if(this.txtDiaChi.getText().matches("^[a-z0-9A-Z_????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????+????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????+????????????????????????????????????????????????????????\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "?????a ch??? kh??ng ch???a k?? t??? ?????c bi???t");
        else if(this.txtSoDT.getText().matches("\\d{10}") == false)
            JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i g???m 10 s???");
        else if(this.txtCMND.getText().matches("\\d{9}") == false)
            JOptionPane.showMessageDialog(this, "CMND g???m 9 s???");
        else{
            Thanhvien tv = new Thanhvien(this.txtMaThanhvien.getText(), this.txtTenThanhvien.getText(), this.txtDiaChi.getText(), this.txtSoDT.getText() ,this.txtCMND.getText());
            ListThanhvien.InsertThanhvien(tv);
            this.btnTim.doClick();
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaThanhvien.getText().equals("") || this.txtTenThanhvien.getText().equals("") || this.txtDiaChi.getText().equals("") || this.txtSoDT.getText().equals("")  || this.txtCMND.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else if(this.txtMaThanhvien.getText().matches("^TV([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "M?? th??nh vi??n theo d???ng TVxx");
        else if(this.txtTenThanhvien.getText().matches("^[a-zA-Z_????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" + \"????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" +\"????????????????????????????????????????????????????????\\\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "T??n kh??ng ch???a k?? t??? ?????c bi???t");
        else if(this.txtDiaChi.getText().matches("^[a-z0-9A-Z_????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????+????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????+????????????????????????????????????????????????????????\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "?????a ch??? kh??ng ch???a k?? t??? ?????c bi???t");
        else if(this.txtSoDT.getText().matches("\\d{10}") == false)
            JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i g???m 10 s???");
        else if(this.txtCMND.getText().matches("\\d{9}") == false)
            JOptionPane.showMessageDialog(this, "CMND g???m 9 s???");
        else{
            Thanhvien tv = new Thanhvien(this.txtMaThanhvien.getText(), this.txtTenThanhvien.getText(), this.txtDiaChi.getText(), this.txtSoDT.getText() , this.txtCMND.getText());
            if(listThanhvien.UpdateThanhvien(tv)){
                JOptionPane.showMessageDialog(this, "S???a th??nh c??ng");
            }else
                JOptionPane.showMessageDialog(this, "C?? l???i x???y ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaThanhvien.getText().equals("") || this.txtTenThanhvien.getText().equals("") || this.txtDiaChi.getText().equals("") || this.txtSoDT.getText().equals("")  || this.txtCMND.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else{
            Thanhvien tv = new Thanhvien(this.txtMaThanhvien.getText(), this.txtTenThanhvien.getText(), this.txtDiaChi.getText(), this.txtSoDT.getText() , this.txtCMND.getText());
            if(listThanhvien.DeleteThanhvien(this.txtMaThanhvien.getText())){
                JOptionPane.showMessageDialog(this, "Xo?? th??nh c??ng");
            }else
                JOptionPane.showMessageDialog(this, "C?? l???i x???y ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.txtMaThanhvien.setText(null);
        this.txtTenThanhvien.setText(null);
        this.txtDiaChi.setText(null);
        this.txtSoDT.setText(null);
       
        this.txtCMND.setText(null);
        txtMaThanhvien.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblThanhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThanhvienMouseClicked
        // TODO add your handling code here:
        try {
            int row = this.tblThanhvien.getSelectedRow();
            String IDrow = (this.tblThanhvien.getModel().getValueAt(row, 0)).toString();
            String sqll = "Select * from Thanhvien where maThanhvien = '"+IDrow+"'";
            ResultSet rs = UpdateTable.ShowTextField(sqll);
            if(rs.next()){
                this.txtMaThanhvien.setText(rs.getString("maThanhvien"));
                this.txtTenThanhvien.setText(rs.getString("tenThanhvien"));
                this.txtDiaChi.setText(rs.getString("diaChi"));
                this.txtSoDT.setText(rs.getString("sDT"));
               
                this.txtCMND.setText(rs.getString("cMND"));
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblThanhvienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaThanhvien;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSrchThanhvien;
    private javax.swing.JLabel lblTenThanhvien;
    private javax.swing.JPanel pnlDsThanhvien;
    private javax.swing.JPanel pnlTtThanhvien;
    private javax.swing.JTable tblThanhvien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaThanhvien;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSrchThanhvien;
    private javax.swing.JTextField txtTenThanhvien;
    // End of variables declaration//GEN-END:variables
}
