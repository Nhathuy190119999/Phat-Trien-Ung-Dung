/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

import List.ListDia;
import Thucthe.Dia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class FormDia extends javax.swing.JPanel {
    ListDia listDia = new ListDia();
    public static  PreparedStatement ps = null;
    public static String  sqlDia = "select * from Dia order by maDia asc";

    /**
     * Creates new form FormDia
     */
    public FormDia() {
        initComponents();
        UpdateTable.LoadData(sqlDia, tblDia);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDsDia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDia = new javax.swing.JTable();
        pnlTtDia = new javax.swing.JPanel();
        lblTenDia = new javax.swing.JLabel();
        lblHangSx = new javax.swing.JLabel();
        lblMaDia = new javax.swing.JLabel();
        lblTheLoai = new javax.swing.JLabel();
        lblGiathue = new javax.swing.JLabel();
        lblSoluongton = new javax.swing.JLabel();
        txtMaDia = new javax.swing.JTextField();
        txtTenDia = new javax.swing.JTextField();
        txtSoluongton = new javax.swing.JTextField();
        txtHangSx = new javax.swing.JTextField();
        txtGiathue = new javax.swing.JTextField();
        cbbTheLoai = new javax.swing.JComboBox<>(listDia.docTheLoai());
        lblSearchDia = new javax.swing.JLabel();
        txtSearchDia = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1310, 600));

        pnlDsDia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Danh sách đĩa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        tblDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đĩa", "Tên đĩa", "Tình trạng", "số lượng tồn", "Hãng SX", "Giá thuê"
            }
        ));
        tblDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDia);

        javax.swing.GroupLayout pnlDsDiaLayout = new javax.swing.GroupLayout(pnlDsDia);
        pnlDsDia.setLayout(pnlDsDiaLayout);
        pnlDsDiaLayout.setHorizontalGroup(
            pnlDsDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDsDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDsDiaLayout.setVerticalGroup(
            pnlDsDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDsDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlTtDia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Thông tin đĩa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        lblTenDia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTenDia.setForeground(new java.awt.Color(102, 0, 102));
        lblTenDia.setText("Tên đĩa:");

        lblHangSx.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblHangSx.setForeground(new java.awt.Color(102, 0, 102));
        lblHangSx.setText("Hãng SX:");

        lblMaDia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaDia.setForeground(new java.awt.Color(102, 0, 102));
        lblMaDia.setText("Mã đĩa:");

        lblTheLoai.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTheLoai.setForeground(new java.awt.Color(102, 0, 102));
        lblTheLoai.setText("Thể loại:");

        lblGiathue.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblGiathue.setForeground(new java.awt.Color(102, 0, 102));
        lblGiathue.setText("Giá thuê:");

        lblSoluongton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSoluongton.setForeground(new java.awt.Color(102, 0, 102));
        lblSoluongton.setText("Số lượng tồn:");

        javax.swing.GroupLayout pnlTtDiaLayout = new javax.swing.GroupLayout(pnlTtDia);
        pnlTtDia.setLayout(pnlTtDiaLayout);
        pnlTtDiaLayout.setHorizontalGroup(
            pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaDia, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblGiathue, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGiathue))
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblTenDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenDia))
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbTheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblSoluongton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoluongton))
                    .addGroup(pnlTtDiaLayout.createSequentialGroup()
                        .addComponent(lblHangSx, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHangSx)))
                .addContainerGap())
        );
        pnlTtDiaLayout.setVerticalGroup(
            pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaDia, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblMaDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTenDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenDia, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cbbTheLoai))
                .addGap(18, 18, 18)
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoluongton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoluongton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHangSx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHangSx, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGiathue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGiathue, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSearchDia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSearchDia.setForeground(new java.awt.Color(102, 0, 102));
        lblSearchDia.setText("Tên đĩa:");

        btnTim.setBackground(new java.awt.Color(102, 0, 102));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTim.setForeground(new java.awt.Color(204, 204, 204));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_search_24px.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(102, 0, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem.setForeground(new java.awt.Color(204, 204, 204));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_add_24px.png"))); // NOI18N
        btnThem.setText("Nhập mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setBackground(new java.awt.Color(102, 0, 102));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(204, 204, 204));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_save_close_24px.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 0, 102));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua.setForeground(new java.awt.Color(204, 204, 204));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_approve_and_update_24px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 0, 102));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 204, 204));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_delete_24px.png"))); // NOI18N
        btnXoa.setText("Xoá");
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
                .addComponent(pnlDsDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearchDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtSearchDia, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addComponent(pnlTtDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDsDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSearchDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(lblSearchDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnTim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        
        
        if(this.txtMaDia.getText().equals("") || this.txtTenDia.getText().equals("") || this.cbbTheLoai.getSelectedItem().equals("") || this.txtSoluongton.getText().equals("") || this.txtHangSx.getText().equals("") || this.txtGiathue.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin");
        else if(this.txtMaDia.getText().matches("^D([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "Mã đĩa phải theo dạng Dxx");
        else if(this.txtTenDia.getText().matches("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\" + \"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\" +\"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "Tên không chứa ký tự đặc biệt");
        
        else if(this.txtSoluongton.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "Số lượng tồn phải là số và lớn hơn 0");
        else if(this.txtGiathue.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số và lớn hơn 0");            
        else{
            Dia d = new Dia(this.txtMaDia.getText(), this.txtTenDia.getText(), this.cbbTheLoai.getSelectedItem().toString(), Integer.parseInt(this.txtSoluongton.getText()) ,this.txtHangSx.getText(), Integer.parseInt(this.txtGiathue.getText()));
            ListDia.InsertDia(d);
            this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDia.getText().equals("") || this.txtTenDia.getText().equals("") || this.cbbTheLoai.getSelectedItem().equals("") || this.txtSoluongton.getText().equals("") || this.txtHangSx.getText().equals("") || this.txtGiathue.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin");
        else if(this.txtMaDia.getText().matches("^D([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "Mã đĩa phải theo dạng Dxx");
        else if(this.txtTenDia.getText().matches("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\" + \"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\" +\"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s]+$") == false)
            JOptionPane.showMessageDialog(this, "Tên không chứa ký tự đặc biệt");
        
        else if(this.txtSoluongton.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "Số lượng tồn phải là số và lớn hơn 0");
        else if(this.txtGiathue.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số và lớn hơn 0");            
        else{
            Dia d = new Dia(this.txtMaDia.getText(), this.txtTenDia.getText(), this.cbbTheLoai.getSelectedItem().toString(), Integer.parseInt(this.txtSoluongton.getText()) ,this.txtHangSx.getText(), Integer.parseInt(this.txtGiathue.getText()));
            if(listDia.UpdateDia(d)){
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            }else
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

        
        
    private void tblDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiaMouseClicked
        try {
            int row = this.tblDia.getSelectedRow();
            String IDrow = (this.tblDia.getModel().getValueAt(row, 0)).toString();
            String sqll = "Select * from Dia where maDia = '"+IDrow+"'";
            ResultSet rs = UpdateTable.ShowTextField(sqll);
            if(rs.next()){
                this.txtMaDia.setText(rs.getString("maDia"));
                this.txtTenDia.setText(rs.getString("tenDia"));
                this.cbbTheLoai.setSelectedItem(rs.getString("tenTheLoai"));
                this.txtSoluongton.setText(rs.getString("soLuongTon"));
                this.txtHangSx.setText(rs.getString("hangSx"));
                this.txtGiathue.setText(rs.getString("giaThue"));
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblDiaMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        if(this.txtSearchDia.getText().length() == 0){
            String sqll = "Select * from Dia";
            UpdateTable.LoadData(sqll, tblDia);
        }else{
            String sqll = "Select * from Dia where maDia like N'%"+this.txtSearchDia.getText()+"%' "
            + "or tenDia like N'%"+this.txtSearchDia.getText()+"%'"
            + "or hangSx like N'%"+this.txtSearchDia.getText()+"%'"
            + "or tinhTrang like N'%"+this.txtSearchDia.getText()+"%'";
            UpdateTable.LoadData(sqll, tblDia);
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.txtMaDia.setText(null);
        this.txtTenDia.setText(null);
       
        this.txtSoluongton.setText(null);
        this.txtHangSx.setText(null);
        this.txtGiathue.setText(null);
        txtMaDia.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDia.getText().equals("") || this.txtTenDia.getText().equals("") || this.cbbTheLoai.getSelectedItem().equals("") || this.txtSoluongton.getText().equals("") || this.txtHangSx.getText().equals("") || this.txtGiathue.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin");
        else{
            Dia d = new Dia(this.txtMaDia.getText(), this.txtTenDia.getText(), this.cbbTheLoai.getSelectedItem().toString(), Integer.parseInt(this.txtSoluongton.getText()) ,this.txtHangSx.getText(), Integer.parseInt(this.txtGiathue.getText()));
            if(listDia.DeleteDia(this.txtMaDia.getText())){
                JOptionPane.showMessageDialog(this, "Xoá thành công");
            }else
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    protected javax.swing.JComboBox<String> cbbTheLoai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGiathue;
    private javax.swing.JLabel lblHangSx;
    private javax.swing.JLabel lblMaDia;
    private javax.swing.JLabel lblSearchDia;
    private javax.swing.JLabel lblSoluongton;
    private javax.swing.JLabel lblTenDia;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JPanel pnlDsDia;
    private javax.swing.JPanel pnlTtDia;
    public javax.swing.JTable tblDia;
    private javax.swing.JTextField txtGiathue;
    private javax.swing.JTextField txtHangSx;
    private javax.swing.JTextField txtMaDia;
    private javax.swing.JTextField txtSearchDia;
    private javax.swing.JTextField txtSoluongton;
    private javax.swing.JTextField txtTenDia;
    // End of variables declaration//GEN-END:variables
}