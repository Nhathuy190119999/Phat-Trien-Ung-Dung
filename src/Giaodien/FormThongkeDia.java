/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

import List.ListThongKeDia;
import Thucthe.ThongKeDia;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanche_pc
 */
public class FormThongkeDia extends javax.swing.JPanel {

    /**
     * Creates new form FormThongkeKhachHang
     */
    ListThongKeDia listthongkedia=new ListThongKeDia();
    DecimalFormat dc = new DecimalFormat("###,###,### đĩa");
   
    public FormThongkeDia() throws SQLException {
        initComponents();
        
        lbltongdiatonkho.setText(dc.format(listthongkedia.tongsodiaton()));
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbltongdiadatra = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbltongdiatonkho = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbltongdiachuatra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldanhsach = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbbnam = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbthang = new javax.swing.JComboBox<>();
        btntracuu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(92, 43, 92));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ THEO ĐĨA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Tổng đĩa đã trả:");

        lbltongdiadatra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltongdiadatra.setForeground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Tổng số đĩa tồn kho:");

        lbltongdiatonkho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltongdiatonkho.setForeground(new java.awt.Color(255, 51, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Tổng đĩa chưa trả:");

        lbltongdiachuatra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltongdiachuatra.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltongdiachuatra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(lbltongdiadatra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltongdiatonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltongdiatonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltongdiachuatra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltongdiadatra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)), "Top 5 đĩa được thuê nhiều nhất", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), new java.awt.Color(102, 0, 102))); // NOI18N
        jPanel2.setLayout(null);

        tbldanhsach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbldanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xếp hạng", "Mã Đĩa", "Tên đĩa", "Thể loại", "Số lượng đĩa thuê"
            }
        ));
        tbldanhsach.setRowHeight(25);
        jScrollPane1.setViewportView(tbldanhsach);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(15, 34, 710, 279);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nhập năm");

        cbbnam.setModel(new javax.swing.DefaultComboBoxModel<>(listthongkedia.docnam()));
        cbbnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbnamActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nhập tháng");

        cbbthang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btntracuu.setBackground(new java.awt.Color(102, 0, 102));
        btntracuu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btntracuu.setForeground(new java.awt.Color(204, 204, 204));
        btntracuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_return_24px.png"))); // NOI18N
        btntracuu.setText("Tra cứu");
        btntracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntracuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btntracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(10, 0, 1458, 611);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nhập năm");
        add(jLabel2);
        jLabel2.setBounds(733, 306, 81, 21);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbnamActionPerformed

    private void btntracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntracuuActionPerformed
        // TODO add your handling code here:
   
        String nam=cbbnam.getSelectedItem().toString();
        String thang=cbbthang.getSelectedItem().toString();
        double tongtien;
        double tongtienchuatra;
        if(thang.equalsIgnoreCase("Không")){
            try {
                 listthongkedia.xoaphantulist();
                 updaTableDatatheonam();
                 lbltongdiachuatra.setText(dc.format(listthongkedia.tongsodiachuatratheonam(nam)));
                 lbltongdiadatra.setText(dc.format(listthongkedia.tongsodiadatratheonam(nam)));
                 
            } catch (SQLException ex) {
                Logger.getLogger(FormThongkeDia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(FormThongkeDia.class.getName()).log(Level.SEVERE, null, ex);
            }
           

        }
        
        else {
            try {
                listthongkedia.xoaphantulist();
                updaTableDatatheonamthang();
                lbltongdiadatra.setText(dc.format(listthongkedia.tongsodiadatratheonamthang(nam,thang)));
                lbltongdiachuatra.setText(dc.format(listthongkedia.tongsodiachuatratheonamthang(nam,thang)));
            } catch (SQLException ex) {
                Logger.getLogger(FormThongkeDia.class.getName()).log(Level.SEVERE, null, ex);
            
            } catch (ParseException ex) {
                Logger.getLogger(FormThongkeDia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btntracuuActionPerformed
     private void updaTableDatatheonam() throws SQLException, ParseException {
        String nam=cbbnam.getSelectedItem().toString();
        DefaultTableModel modal = (DefaultTableModel) tbldanhsach.getModel();
        List<ThongKeDia> list=listthongkedia.diatheunhieunhattheonam(nam);
         int xephang=0;
       while(tbldanhsach.getRowCount()>0)
			modal.removeRow(0);

    	for(ThongKeDia dh : list) {
                xephang++;
    		String[] row = {String.valueOf(xephang),dh.getMadia(),dh.getTendia(),dh.getTheloai(),String.valueOf(dh.getSoluongdiathue())};
    		modal.addRow(row);   		
    	}
    	
    }
     
     private void updaTableDatatheonamthang() throws SQLException, ParseException {
        String nam=cbbnam.getSelectedItem().toString();
        String thang=cbbthang.getSelectedItem().toString();
        DefaultTableModel modal = (DefaultTableModel) tbldanhsach.getModel();
        List<ThongKeDia> list=listthongkedia.diatheunhieunhattheonamthang(nam,thang);
        int xephang=0;
       while(tbldanhsach.getRowCount()>0)
			modal.removeRow(0);

    	for(ThongKeDia dh : list) {
            
                xephang++;
    		String[] row = {String.valueOf(xephang),dh.getMadia(),dh.getTendia(),dh.getTheloai(),String.valueOf(dh.getSoluongdiathue())};
    		modal.addRow(row);   		
    	}
    	
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntracuu;
    private javax.swing.JComboBox<String> cbbnam;
    private javax.swing.JComboBox<String> cbbthang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltongdiachuatra;
    private javax.swing.JLabel lbltongdiadatra;
    private javax.swing.JLabel lbltongdiatonkho;
    private javax.swing.JTable tbldanhsach;
    // End of variables declaration//GEN-END:variables
}
