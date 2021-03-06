/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

//import static Giaodien.FormCtPhieuthue.txtGiathue;
//import static Giaodien.FormCtPhieuthue.txtMaDia;
import List.ListCtPhieuthue;
import List.ListDia;
import Thucthe.Dia;
import Thucthe.CtPhieuThue;
import Thucthe.GetDataDia;
import List.ListPhieuthue;
import Thucthe.Phieuthue;
import Thucthe.GetDataThanhvien;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Nhat
 */
public class FormPhieuthue extends javax.swing.JPanel {
    ListPhieuthue listPhieuthue = new ListPhieuthue();
    ListCtPhieuthue listCtPhieuthue = new ListCtPhieuthue();
    public static  PreparedStatement ps = null;
    public static String  sqlPhieuthue = "select * from Phieuthue order by soPhieu asc";
    boolean chonPhieuthue = false;
    public static String  sqlCtPhieuthue = "select soPhieu,maDia,soLuongThue,giathue,tinhtrang from CtPhieuthue order by soPhieu asc";
    FormTradia frmtradia;

    /**
     * Creates new form FormPhieuthue
     */
    public FormPhieuthue() {
        initComponents();
        UpdateTable.LoadData(sqlPhieuthue, tblPhieuthue);
        JTable tblCtPhieuthue;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPhieuthue = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuthue = new javax.swing.JTable();
        pnlTtPhieuthue = new javax.swing.JPanel();
        lblMaThanhvien = new javax.swing.JLabel();
        lblNgaytra = new javax.swing.JLabel();
        lblMaPhieu = new javax.swing.JLabel();
        lblMaNhanvien = new javax.swing.JLabel();
        lblNgaythue = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        txtMaThanhvien = new javax.swing.JTextField();
        txtNgaythue = new javax.swing.JTextField();
        txtHantra = new javax.swing.JTextField();
        btnChonThanhvien = new javax.swing.JButton();
        cbbMaNhanvien = new javax.swing.JComboBox<>(listPhieuthue.docMaNV());
        lblMaDia = new javax.swing.JLabel();
        lblSoluongThue = new javax.swing.JLabel();
        lblGiathue = new javax.swing.JLabel();
        btnFolderDia = new javax.swing.JButton();
        txtMaDia = new javax.swing.JTextField();
        txtSoLuongThue = new javax.swing.JTextField();
        txtGiaThue = new javax.swing.JTextField();
        lblSrchPhieuthue = new javax.swing.JLabel();
        txtSrchPhieuthue = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnChonPhieu = new javax.swing.JButton();

        pnlPhieuthue.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Danh s??ch phi???u thu??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        tblPhieuthue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? phi???u thu??", "M?? th??nh vi??n", "M?? nh??n vi??n", "Ng??y thu??", "Ng??y tr???"
            }
        ));
        tblPhieuthue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuthueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuthue);

        javax.swing.GroupLayout pnlPhieuthueLayout = new javax.swing.GroupLayout(pnlPhieuthue);
        pnlPhieuthue.setLayout(pnlPhieuthueLayout);
        pnlPhieuthueLayout.setHorizontalGroup(
            pnlPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuthueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPhieuthueLayout.setVerticalGroup(
            pnlPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuthueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlTtPhieuthue.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "Th??ng tin phi???u thu??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(102, 0, 102))); // NOI18N

        lblMaThanhvien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaThanhvien.setForeground(new java.awt.Color(102, 0, 102));
        lblMaThanhvien.setText("M?? th??nh vi??n:");

        lblNgaytra.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblNgaytra.setForeground(new java.awt.Color(102, 0, 102));
        lblNgaytra.setText("H???n tr???:");

        lblMaPhieu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaPhieu.setForeground(new java.awt.Color(102, 0, 102));
        lblMaPhieu.setText("M?? phi???u thu??:");

        lblMaNhanvien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNhanvien.setForeground(new java.awt.Color(102, 0, 102));
        lblMaNhanvien.setText("M?? nh??n vi??n:");

        lblNgaythue.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblNgaythue.setForeground(new java.awt.Color(102, 0, 102));
        lblNgaythue.setText("Ng??y thu??:");

        btnChonThanhvien.setBackground(new java.awt.Color(255, 255, 255));
        btnChonThanhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_folder_invoices_24px.png"))); // NOI18N
        btnChonThanhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonThanhvienActionPerformed(evt);
            }
        });

        lblMaDia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaDia.setForeground(new java.awt.Color(102, 0, 102));
        lblMaDia.setText("M?? ????a:");

        lblSoluongThue.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSoluongThue.setForeground(new java.awt.Color(102, 0, 102));
        lblSoluongThue.setText("S??? l?????ng thu??:");

        lblGiathue.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblGiathue.setForeground(new java.awt.Color(102, 0, 102));
        lblGiathue.setText("Gi?? thu??:");

        btnFolderDia.setBackground(new java.awt.Color(255, 255, 255));
        btnFolderDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_folder_invoices_24px.png"))); // NOI18N
        btnFolderDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolderDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTtPhieuthueLayout = new javax.swing.GroupLayout(pnlTtPhieuthue);
        pnlTtPhieuthue.setLayout(pnlTtPhieuthueLayout);
        pnlTtPhieuthueLayout.setHorizontalGroup(
            pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                        .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                                .addComponent(lblMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                                .addComponent(lblMaThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaThanhvien)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChonThanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                        .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTtPhieuthueLayout.createSequentialGroup()
                                .addComponent(lblGiathue, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGiaThue))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTtPhieuthueLayout.createSequentialGroup()
                                .addComponent(lblSoluongThue, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuongThue))
                            .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTtPhieuthueLayout.createSequentialGroup()
                                    .addComponent(lblMaNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbbMaNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTtPhieuthueLayout.createSequentialGroup()
                                    .addComponent(lblMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnFolderDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                        .addComponent(lblNgaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                        .addComponent(lblNgaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHantra, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTtPhieuthueLayout.setVerticalGroup(
            pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblMaPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMaThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaThanhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                    .addComponent(btnChonThanhvien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTtPhieuthueLayout.createSequentialGroup()
                        .addComponent(lblMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnFolderDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaDia))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuongThue, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblSoluongThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGiathue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGiaThue, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTtPhieuthueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHantra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblSrchPhieuthue.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSrchPhieuthue.setForeground(new java.awt.Color(102, 0, 102));
        lblSrchPhieuthue.setText("M?? phi???u:");

        txtSrchPhieuthue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrchPhieuthueActionPerformed(evt);
            }
        });

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

        btnChonPhieu.setBackground(new java.awt.Color(102, 0, 102));
        btnChonPhieu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnChonPhieu.setForeground(new java.awt.Color(204, 204, 204));
        btnChonPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_checkmark_24px.png"))); // NOI18N
        btnChonPhieu.setText("Ch???n phi???u");
        btnChonPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTtPhieuthue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSrchPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSrchPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChonPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPhieuthue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTtPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSrchPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSrchPhieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChonPhieu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieu.getText().equals("") || this.txtMaThanhvien.getText().equals("") || this.cbbMaNhanvien.getSelectedItem().equals("") ||this.txtNgaythue.getText().equals("") || this.txtHantra.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else if(this.txtMaPhieu.getText().matches("^PT([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "M?? phi??u theo d???ng PTxx");
        else{
            int giaThue = Integer.parseInt(txtGiaThue.getText());
            int soLuongTon = Integer.parseInt(GetDataDia.getSoLuongTon());
            int soLuongThue = Integer.parseInt(FormPhieuthue.txtSoLuongThue.getText());
            int updateslt = soLuongTon - soLuongThue;
            int thanhTien = soLuongThue*giaThue;
            String tinhTrang = "Ch??a tr???";
            
            Phieuthue pt = new Phieuthue(this.txtMaPhieu.getText(), this.txtMaThanhvien.getText(), this.cbbMaNhanvien.getSelectedItem().toString(), Date.valueOf(this.txtNgaythue.getText()) ,Date.valueOf(this.txtHantra.getText()));
            ListPhieuthue.InsertPhieuthue(pt);
            CtPhieuThue ctpt = new CtPhieuThue(this.txtMaPhieu.getText(), this.txtMaDia.getText(),Integer.parseInt(this.txtSoLuongThue.getText()),Integer.parseInt(this.txtGiaThue.getText()), tinhTrang);
            ListCtPhieuthue.InsertCtPhieuthue(ctpt);
            Dia d = new Dia(GetDataDia.getMaDia(), GetDataDia.getTenDia(), GetDataDia.getTinhTrang(), updateslt, GetDataDia.getHangSx(), Integer.parseInt(this.txtGiaThue.getText()));
            listCtPhieuthue.UpdateSltDia(d);
            this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieu.getText().equals("") || this.txtMaThanhvien.getText().equals("") || this.cbbMaNhanvien.getSelectedItem().equals("") ||this.txtNgaythue.getText().equals("") || this.txtHantra.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else if(this.txtMaPhieu.getText().matches("^PT([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "M?? phi??u theo d???ng PTxx");
        else if(this.txtSoLuongThue.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "S??? l?????ng thu?? ph???i l???n h??n 0");
        else if(this.txtGiaThue.getText().matches("^[1-9]\\d*$") == false)
            JOptionPane.showMessageDialog(this, "????n gi?? ph???i l?? s??? v?? l???n h??n 0");
        else{
            Phieuthue pt = new Phieuthue(this.txtMaPhieu.getText(), this.txtMaThanhvien.getText(), this.cbbMaNhanvien.getSelectedItem().toString(), Date.valueOf(this.txtNgaythue.getText()) ,Date.valueOf(this.txtHantra.getText()));
            if(listPhieuthue.UpdatePhieuthue(pt)){
                JOptionPane.showMessageDialog(this, "S???a th??nh c??ng");
            }else
                JOptionPane.showMessageDialog(this, "C?? l???i x???y ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieu.getText().equals("") || this.txtMaThanhvien.getText().equals("") || this.cbbMaNhanvien.getSelectedItem().equals("") ||this.txtNgaythue.getText().equals("") || this.txtHantra.getText().equals(""))
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin");
        else if(this.txtMaPhieu.getText().matches("^PT([0-9][0-9])$") == false)
            JOptionPane.showMessageDialog(this, "M?? phi??u theo d???ng PTxx");
        else{
            Phieuthue pt = new Phieuthue(this.txtMaPhieu.getText(), this.txtMaThanhvien.getText(), this.cbbMaNhanvien.getSelectedItem().toString(), Date.valueOf(this.txtNgaythue.getText()) ,Date.valueOf(this.txtHantra.getText()));
            if(listPhieuthue.DeletePhieuthue(this.txtMaPhieu.getText())){
                JOptionPane.showMessageDialog(this, "Xo?? th??nh c??ng");
            }else
                JOptionPane.showMessageDialog(this, "C?? l???i x???y ra");
                this.btnTim.doClick();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        if(this.txtSrchPhieuthue.getText().length() == 0){
            String sqll = "Select * from Phieuthue";
            UpdateTable.LoadData(sqll, tblPhieuthue);
        }else{
            String sqll = "Select * from Phieuthue where soPhieu like N'%"+this.txtSrchPhieuthue.getText()+"%' "
            + "or maThanhvien like N'%"+this.txtSrchPhieuthue.getText()+"%'"
            + "or ngayThue like N'%"+this.txtSrchPhieuthue.getText()+"%'"
            + "or hanTra like N'%"+this.txtSrchPhieuthue.getText()+"%'";
            UpdateTable.LoadData(sqll, tblPhieuthue);
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnChonThanhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonThanhvienActionPerformed
        // TODO add your handling code here:
        viewThanhvien vTV = new viewThanhvien();
        vTV.setVisible(true);
    }//GEN-LAST:event_btnChonThanhvienActionPerformed

    private void tblPhieuthueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuthueMouseClicked
        // TODO add your handling code here:
        try {
            int row = this.tblPhieuthue.getSelectedRow();
            String IDrow = (this.tblPhieuthue.getModel().getValueAt(row, 0)).toString();
            String sqll = "Select * from Phieuthue where soPhieu = '"+IDrow+"'";
            ResultSet rs = UpdateTable.ShowTextField(sqll);
            if(rs.next()){
                this.txtMaPhieu.setText(rs.getString("soPhieu"));
                this.txtMaThanhvien.setText(rs.getString("maThanhvien"));
                this.cbbMaNhanvien.setSelectedItem(rs.getString("maNhanvien"));
                this.txtNgaythue.setText(rs.getString("ngayThue"));
                this.txtHantra.setText(rs.getString("hanTra"));                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPhieuthueMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.txtMaPhieu.setText(null);
        this.txtMaThanhvien.setText(null);
        this.txtNgaythue.setText(null);
        this.txtHantra.setText(null);
        txtMaPhieu.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnChonPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonPhieuActionPerformed
        // TODO add your handling code here:
        chonPhieuthue = true;
        if(eventChonPhieuthue())
            JOptionPane.showMessageDialog(this, "Phi???u thu?? ???? ???????c ch???n, m???i nh???p chi ti???t phi???u thu??");
        else
            JOptionPane.showMessageDialog(this, "Phi???u thu?? ch??a ???????c ch???n");
    }//GEN-LAST:event_btnChonPhieuActionPerformed

    private void btnFolderDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolderDiaActionPerformed
        // TODO add your handling code here:
        viewDia vD = new viewDia();
        vD.setVisible(true);
    }//GEN-LAST:event_btnFolderDiaActionPerformed

    private void txtSrchPhieuthueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrchPhieuthueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSrchPhieuthueActionPerformed

    public static void GetDataIntoTbl(){
        txtMaThanhvien.setText(GetDataThanhvien.getMaThanhvien());
    }
    public boolean eventChonPhieuthue(){
        if(!txtMaPhieu.getText().equals("") && chonPhieuthue == true)
            return true;
        else 
            return false;
    }
    public static void GetDataDiaintoTbl(){
        txtMaDia.setText(GetDataDia.getMaDia());
        txtGiaThue.setText(GetDataDia.getGiaThue());      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonPhieu;
    private javax.swing.JButton btnChonThanhvien;
    private javax.swing.JButton btnFolderDia;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    protected javax.swing.JComboBox<String> cbbMaNhanvien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGiathue;
    private javax.swing.JLabel lblMaDia;
    private javax.swing.JLabel lblMaNhanvien;
    private javax.swing.JLabel lblMaPhieu;
    private javax.swing.JLabel lblMaThanhvien;
    private javax.swing.JLabel lblNgaythue;
    private javax.swing.JLabel lblNgaytra;
    private javax.swing.JLabel lblSoluongThue;
    private javax.swing.JLabel lblSrchPhieuthue;
    private javax.swing.JPanel pnlPhieuthue;
    private javax.swing.JPanel pnlTtPhieuthue;
    private javax.swing.JTable tblPhieuthue;
    public static javax.swing.JTextField txtGiaThue;
    public javax.swing.JTextField txtHantra;
    public static javax.swing.JTextField txtMaDia;
    public javax.swing.JTextField txtMaPhieu;
    public static javax.swing.JTextField txtMaThanhvien;
    public javax.swing.JTextField txtNgaythue;
    public static javax.swing.JTextField txtSoLuongThue;
    private javax.swing.JTextField txtSrchPhieuthue;
    // End of variables declaration//GEN-END:variables
}
