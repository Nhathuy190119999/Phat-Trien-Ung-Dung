/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;


import Thucthe.CtPhieuThue;
import List.ListThongKeDoanhThu;
import java.awt.Color;
import java.awt.Font;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nhat
 */
 
public class FormThongkeDoanhThu extends javax.swing.JPanel {
   

    /**
     * Creates new form FormThongke
     */
    ListThongKeDoanhThu listthongke=new ListThongKeDoanhThu();
    JPanel [] jpnthang=new JPanel[12];
    JLabel [] lblthang=new JLabel[12];
    JLabel [] lblphantramdoanhthu=new JLabel[30];
    JLabel lbltitlethang=new JLabel();
    JLabel lbltitledoanhthu=new JLabel();
    
    JPanel [] jpnnam=new JPanel[12];
    JLabel [] lblnam=new JLabel[12];
    JLabel [] lblphantramdoanhthutheonam=new JLabel[30];
    JLabel lbltitlenam=new JLabel();
    JLabel lbltitledoanhthunam=new JLabel();
    
    JPanel [] jpnquy=new JPanel[12];
    JLabel [] lblquy=new JLabel[12];
    JLabel [] lblphantramdoanhthutheoquy=new JLabel[30];
    JLabel lbltitlequy=new JLabel();
    JLabel lbltitledoanhthuquy=new JLabel();
    JLabel lbltitletenbieudoquy=new JLabel();
    JLabel lbltitletenbieudothang=new JLabel();
    public FormThongkeDoanhThu() throws SQLException {
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btntracuu = new javax.swing.JButton();
        cbbnam = new javax.swing.JComboBox<>();
        cbbquy = new javax.swing.JComboBox<>();
        cbbthang = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbltongtiendoanhthu = new javax.swing.JLabel();
        lblphantram = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbltongtienchuatra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(92, 43, 92));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TH???NG K?? THEO DOANH THU");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1324, 46);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2), "M???i b???n nh???p th??ng tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(102, 0, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nh???p n??m");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nh???p qu??");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nh???p th??ng");

        btntracuu.setBackground(new java.awt.Color(102, 0, 102));
        btntracuu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btntracuu.setForeground(new java.awt.Color(204, 204, 204));
        btntracuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8_return_24px.png"))); // NOI18N
        btntracuu.setText("Tra c???u");
        btntracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntracuuActionPerformed(evt);
            }
        });

        cbbnam.setModel(new javax.swing.DefaultComboBoxModel<>(listthongke.docnam()));
        cbbnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbnamActionPerformed(evt);
            }
        });

        cbbquy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kh??ng","1", "2", "3", "4"}));

        cbbthang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kh??ng","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbbquy, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btntracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbquy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 50, 1330, 140);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("T???ng ti???n doanh thu");

        lbltongtiendoanhthu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblphantram.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("T???ng ti???n kh??ch ch??a tr???:");

        lbltongtienchuatra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltongtienchuatra, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(lbltongtiendoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblphantram, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(lblphantram, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbltongtienchuatra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltongtiendoanhthu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        add(jPanel2);
        jPanel2.setBounds(0, 190, 510, 410);

        jPanel4.setPreferredSize(new java.awt.Dimension(680, 700));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Bi???u ?????");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(405, 4, 80, 20);

        jScrollPane1.setViewportView(jPanel4);

        add(jScrollPane1);
        jScrollPane1.setBounds(510, 190, 810, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void btntracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntracuuActionPerformed
        // TODO add your handling code here:
       DecimalFormat dc = new DecimalFormat("###,###,###.## VND");
        String nam=cbbnam.getSelectedItem().toString();
        String quy=cbbquy.getSelectedItem().toString();
        String thang=cbbthang.getSelectedItem().toString();
        double tongtien;
        double tongtienchuatra;
        jPanel4.removeAll();
        if(quy.equalsIgnoreCase("Kh??ng") && thang.equalsIgnoreCase("Kh??ng")){
             
           try {
               tongtien=listthongke.tongtientheonam(nam);
               lbltongtiendoanhthu.setText(dc.format(tongtien));
               tongtienchuatra=listthongke.tongtienkhachchuatratheonam(nam);
               lbltongtienchuatra.setText(dc.format(tongtienchuatra));
               //bieudonam();
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "That bai");
           } 
           
                
           
            
        }
        else if(thang.equalsIgnoreCase("Kh??ng")){
             
            try {
                 tongtien=listthongke.tongtientheonamquy(nam, quy);
                lbltongtiendoanhthu.setText(dc.format(tongtien));
                tongtienchuatra=listthongke.tongtienkhachchuatratheonamquy(nam,quy);
                lbltongtienchuatra.setText(dc.format(tongtienchuatra));
                bieudoquy();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this, "That bai");
            }
        }  
        else if(!quy.equalsIgnoreCase("Kh??ng") && !thang.equalsIgnoreCase("Kh??ng") && !quy.equalsIgnoreCase("Kh??ng")){
        int kt=0;
        if(quy.equalsIgnoreCase("1")){
                if(!thang.equalsIgnoreCase("1") && !thang.equalsIgnoreCase("2") && !thang.equalsIgnoreCase("3")){
                    JOptionPane.showMessageDialog(this,"Nh???p sai th??ng");
                    kt=1;
                }
        }
        if(quy.equalsIgnoreCase("2")){
                if(!thang.equalsIgnoreCase("4") && !thang.equalsIgnoreCase("5") && !thang.equalsIgnoreCase("6")){
                    JOptionPane.showMessageDialog(this, "Nh???p sai th??ng");
                    kt=1;
                }
        }
        if(quy.equalsIgnoreCase("3")){
                if(!thang.equalsIgnoreCase("7") && !thang.equalsIgnoreCase("8") && !thang.equalsIgnoreCase("9")){
                    JOptionPane.showMessageDialog(this, "Nh???p sai th??ng");
                    kt=1;
                }
        }
        if(quy.equalsIgnoreCase("4")){
                if(!thang.equalsIgnoreCase("10") && !thang.equalsIgnoreCase("11") && !thang.equalsIgnoreCase("12")){
                    JOptionPane.showMessageDialog(this, "Nh???p sai th??ng");
                    kt=1;
                }
        }
        if(kt==0){
            try {
                tongtien=listthongke.tongtientheonamquythang(nam,thang,quy);
                lbltongtiendoanhthu.setText(dc.format(tongtien));
                tongtienchuatra=listthongke.tongtienkhachchuatranamquythang(nam,thang,quy);
                lbltongtienchuatra.setText(dc.format(tongtienchuatra));
                bieudothang();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "That bai");
            } 
         
           }  
        }
    }//GEN-LAST:event_btntracuuActionPerformed

    private void cbbnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbnamActionPerformed
    public void bieudothang() throws SQLException{
        int y=0;
        int x=80;
        String nam=cbbnam.getSelectedItem().toString();
        String quy=cbbquy.getSelectedItem().toString();
        String thang=cbbthang.getSelectedItem().toString();
        NumberFormat numEN = NumberFormat.getPercentInstance();
        lbltitletenbieudothang=new JLabel("Bi???u ????? theo th??ng");
        lbltitletenbieudothang.setFont(new Font("arial",Font.BOLD,20));
        lbltitletenbieudothang.setBounds(300,0,200,40);
        lbltitlethang=new JLabel("Th??ng");
        lbltitlethang.setFont(new Font("arial",Font.BOLD,17));
        lbltitlethang.setBounds(10,345,50,40);
        lbltitledoanhthu=new JLabel("T??? l??? (%)");
        lbltitledoanhthu.setFont(new Font("arial",Font.BOLD,17));
        lbltitledoanhthu.setBounds(10,30,70,40);
        jPanel4.add(lbltitlethang);
        jPanel4.add(lbltitledoanhthu);
        jPanel4.add(lbltitletenbieudothang);
        for(int i=0;i<12;i++){
            jpnthang[i]=new JPanel();
            jpnthang[i].setBackground(Color.red);
            jpnthang[i].setBounds(60+i*60,340-(int) (3*(listthongke.bieudothang(i+1,nam)/listthongke.tongphantram(nam))*100),50, (int) (3*(listthongke.bieudothang(i+1,nam)/listthongke.tongphantram(nam))*100));
            lblphantramdoanhthu[i]=new JLabel(""+numEN.format(listthongke.bieudothang(i+1,nam)/listthongke.tongphantram(nam)));
            lblphantramdoanhthu[i].setBounds(75+i*60,280-(int) (3*(listthongke.bieudothang(i+1,nam)/listthongke.tongphantram(nam))*100), 40, 100);
            lblthang[i]=new JLabel(""+(i+1));
            lblthang[i].setBounds(x+i*60,340,40,50);
            jPanel4.add(lblthang[i]);
            jPanel4.add(lblphantramdoanhthu[i]);
            jPanel4.add(jpnthang[i]);
            
        }
        
    }
    /*
    public void bieudonam() throws SQLException, ParseException{
        int y=0;
        int x=80;
        int n=listthongke.tongsonam();
        ArrayList<Integer> dsnam=listthongke.dsnam();
        NumberFormat numEN = NumberFormat.getPercentInstance();
        lbltitlenam=new JLabel("N??m");
        lbltitlenam.setFont(new Font("arial",Font.BOLD,17));
        lbltitlenam.setBounds(10,360,50,40);
        lbltitledoanhthunam=new JLabel("T??? l??? (%)");
        lbltitledoanhthunam.setFont(new Font("arial",Font.BOLD,17));
        lbltitledoanhthunam.setBounds(10,10,70,40);
        jPanel4.add(lbltitlenam);
        jPanel4.add(lbltitledoanhthunam);
         
        
        for(int i=0;i<n;i++){
          
            jpnnam[i]=new JPanel();
            jpnnam[i].setBackground(Color.red);
            
            jpnnam[i].setBounds(70+i*60,365-(int) (3*(listthongke.bieudonam(dsnam)/listthongke.tongphantram())*100),50,(int) (3*(listthongke.bieudonam(dh)/listthongke.tongphantram())*100));
            lblphantramdoanhthutheonam[i]=new JLabel(""+numEN.format(listthongke.bieudonam(dsnam)/listthongke.tongphantram()));
            lblphantramdoanhthutheonam[i].setBounds(75+i*60,(int) (3*(listthongke.bieudothang(dsnam)/listthongke.tongphantram())*100), 40, 100);
            lblnam[i]=new JLabel(""+dsnam);
            lblnam[i].setBounds(x+i*80,360,40,50);
             
            
           
            
            jPanel4.add(lblnam[i]);
            jPanel4.add(lblphantramdoanhthutheonam[i]);
            jPanel4.add(jpnnam[i]);
          
        }
        
    }
`   */
    
    public void bieudoquy() throws SQLException{
        int y=0;
        int x=130;
        String nam=cbbnam.getSelectedItem().toString();
        String quy=cbbquy.getSelectedItem().toString();
        String thang=cbbthang.getSelectedItem().toString();
        NumberFormat numEN = NumberFormat.getPercentInstance();
        lbltitletenbieudoquy=new JLabel("Bi???u ????? theo qu??");
        lbltitletenbieudoquy.setFont(new Font("arial",Font.BOLD,20));
        lbltitletenbieudoquy.setBounds(300,0,200,40);
        lbltitlequy=new JLabel("Qu??");
        lbltitlequy.setFont(new Font("arial",Font.BOLD,17));
        lbltitlequy.setBounds(10,345,50,40);
        lbltitledoanhthuquy=new JLabel("T??? l??? (%)");
        lbltitledoanhthuquy.setFont(new Font("arial",Font.BOLD,17));
        lbltitledoanhthuquy.setBounds(10,30,70,40);
        jPanel4.add(lbltitlequy);
        jPanel4.add(lbltitledoanhthuquy);
        jPanel4.add(lbltitletenbieudoquy);
        for(int i=0;i<4;i++){
           
            jpnquy[i]=new JPanel();
            jpnquy[i].setBackground(Color.red);
            jpnquy[i].setBounds(110+i*150,340-(int) (3*(listthongke.bieudoquy(i+1,nam)/listthongke.tongphantram(nam))*100),50, (int) (3*(listthongke.bieudoquy(i+1,nam)/listthongke.tongphantram(nam))*100));
            lblphantramdoanhthutheoquy[i]=new JLabel(""+numEN.format(listthongke.bieudoquy(i+1,nam)/listthongke.tongphantram(nam)));
            lblphantramdoanhthutheoquy[i].setBounds(125+i*150,280-(int) (3*(listthongke.bieudoquy(i+1,nam)/listthongke.tongphantram(nam))*100), 40, 100);
            lblquy[i]=new JLabel(""+(i+1));
            lblquy[i].setBounds(x+i*150,340,40,50);
            jPanel4.add(lblquy[i]);
            jPanel4.add(lblphantramdoanhthutheoquy[i]);
            jPanel4.add(jpnquy[i]);
            
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntracuu;
    private javax.swing.JComboBox<String> cbbnam;
    private javax.swing.JComboBox<String> cbbquy;
    private javax.swing.JComboBox<String> cbbthang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblphantram;
    private javax.swing.JLabel lbltongtienchuatra;
    private javax.swing.JLabel lbltongtiendoanhthu;
    // End of variables declaration//GEN-END:variables
}
