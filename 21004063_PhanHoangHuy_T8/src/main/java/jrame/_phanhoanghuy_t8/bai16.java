/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jrame._phanhoanghuy_t8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author huyph
 */
public class bai16 extends javax.swing.JFrame {

    /**
     * Creates new form bai16
     */
    public bai16() {
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
        jLabel2 = new javax.swing.JLabel();
        txt_ms = new javax.swing.JTextField();
        txt_ht = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ns = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dtb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chb_gt = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbb_lop = new javax.swing.JComboBox<>();
        btn_xacnhan = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_nhaplai = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sv = new javax.swing.JTextArea();
        btn_addfile = new javax.swing.JButton();
        btn_docfile = new javax.swing.JButton();
        btn_file = new javax.swing.JButton();
        txt_file = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_filesv = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("DANH SÁCH SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã số");

        txt_ms.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_msFocusLost(evt);
            }
        });
        txt_ms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_msKeyPressed(evt);
            }
        });

        txt_ht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_htFocusLost(evt);
            }
        });
        txt_ht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_htKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên");

        txt_ns.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nsFocusLost(evt);
            }
        });
        txt_ns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nsKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");

        txt_dtb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_dtbFocusLost(evt);
            }
        });
        txt_dtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dtbKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Điểm TB");

        chb_gt.setText("Nữ");
        chb_gt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb_gtMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Lớp");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Thông tin sinh viên:");

        cbb_lop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbb_lop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1CTT21A1", "1OTO21A1", "1CTT21A3", "1CTT21A2" }));

        btn_xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xacnhan.setForeground(new java.awt.Color(255, 0, 0));
        btn_xacnhan.setText("XÁC NHẬN");
        btn_xacnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xacnhanMouseClicked(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 0, 0));
        btn_add.setText("ADD MẢNG");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        btn_nhaplai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_nhaplai.setForeground(new java.awt.Color(255, 0, 0));
        btn_nhaplai.setText("NHẬP LẠI");
        btn_nhaplai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nhaplaiMouseClicked(evt);
            }
        });

        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(255, 0, 0));
        btn_thoat.setText("THOÁT");
        btn_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thoatMouseClicked(evt);
            }
        });

        txt_sv.setColumns(20);
        txt_sv.setRows(5);
        jScrollPane1.setViewportView(txt_sv);

        btn_addfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addfile.setForeground(new java.awt.Color(255, 0, 0));
        btn_addfile.setText("ADD FILE");
        btn_addfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addfileMouseClicked(evt);
            }
        });

        btn_docfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_docfile.setForeground(new java.awt.Color(255, 0, 0));
        btn_docfile.setText("ĐỌC FILE");
        btn_docfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_docfileMouseClicked(evt);
            }
        });

        btn_file.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_file.setForeground(new java.awt.Color(255, 0, 0));
        btn_file.setText("CHỌN FILE");
        btn_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fileMouseClicked(evt);
            }
        });

        txt_filesv.setColumns(20);
        txt_filesv.setRows(5);
        jScrollPane2.setViewportView(txt_filesv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_addfile))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ns, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ht, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(chb_gt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dtb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_xacnhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nhaplai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_thoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_docfile)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_file, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_file)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_gt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_dtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cbb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xacnhan)
                    .addComponent(btn_add)
                    .addComponent(btn_nhaplai)
                    .addComponent(btn_thoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addfile))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_file))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_docfile)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thoatMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btn_thoatMouseClicked

    private void txt_msFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_msFocusLost
        // TODO add your handling code here:
        String ms = txt_ms.getText();
        if (ms.length() != 8){
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đủ 8 ký tự !");
            txt_ms.requestFocus();
        }
    }//GEN-LAST:event_txt_msFocusLost

    private void txt_msKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_msKeyPressed
        // TODO add your handling code here:
        char kt = evt.getKeyChar();
        if(!Character.isDigit(kt) && !Character.isLetter(kt) && !Character.isISOControl(kt))
            txt_ms.setEditable(false);
        else txt_ms.setEditable(true);
        
    }//GEN-LAST:event_txt_msKeyPressed

    private void txt_htKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_htKeyPressed
        // TODO add your handling code here:
        char kt = evt.getKeyChar();
        if (!Character.isLetter(kt) && !Character.isISOControl(kt) && kt != ' ')
            txt_ht.setEditable(false);
        else txt_ht.setEditable(true);
    }//GEN-LAST:event_txt_htKeyPressed

    private void txt_htFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_htFocusLost
        // TODO add your handling code here:
        String ht = txt_ht.getText();
        if(ht.length()<2){
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập ít nhất 2 ký tự!");
            txt_ht.requestFocus();
        }
    }//GEN-LAST:event_txt_htFocusLost

    private void chb_gtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb_gtMouseClicked
        // TODO add your handling code here:
        if (chb_gt.isSelected())
            chb_gt.setText("Nam");
        else chb_gt.setText("Nữ");
            
    }//GEN-LAST:event_chb_gtMouseClicked

    private void txt_nsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nsKeyPressed
        // TODO add your handling code here:
        char kt = evt.getKeyChar();
        if (!Character.isDigit(kt) && !Character.isISOControl(kt) && kt != '-')
            txt_ns.setEditable(false);
        else txt_ns.setEditable(true);
    }//GEN-LAST:event_txt_nsKeyPressed

    private void txt_nsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nsFocusLost
        // TODO add your handling code here:
        
        try{
            // định dạng lại thời gian
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate sv = LocalDate.parse(txt_ns.getText(),formatter);
            
            if (LocalDate.now().getYear() - sv.getYear() < 18){
                JOptionPane.showMessageDialog(rootPane, "Sinh viên không đủ 18 tuổi!");
                txt_ns.requestFocus();
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Bạn nhập sai dữ liệu !");
            txt_ns.requestFocus();
        }
    }//GEN-LAST:event_txt_nsFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txt_sv.setVisible(false);
//        // khai báo biến thời hian hiện tại
//        LocalDate currentDate = LocalDate.now();
//        // định dạng lại thời gian
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        txt_ns.setText(currentDate.format(formatter));
    }//GEN-LAST:event_formWindowOpened

    private void txt_dtbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dtbKeyPressed
        // TODO add your handling code here:
        char kt = evt.getKeyChar();
        if (!Character.isDigit(kt) && !Character.isISOControl(kt) && kt != '.')
            txt_dtb.setEditable(false);
        else txt_dtb.setEditable(true);
    }//GEN-LAST:event_txt_dtbKeyPressed

    private void txt_dtbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dtbFocusLost
        // TODO add your handling code here:
        try{
            double dtb = Double.parseDouble(txt_dtb.getText());
            if (dtb < 0 || dtb > 10){
                JOptionPane.showMessageDialog(rootPane, "Bạn nhập sai điểm!");
                txt_dtb.requestFocus();
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Bạn nhập dữ liệu!");
            txt_dtb.requestFocus();
        }
    }//GEN-LAST:event_txt_dtbFocusLost

    private void btn_xacnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xacnhanMouseClicked
        // TODO add your handling code here:
        txt_sv.setVisible(true);
        String ms = txt_ms.getText();
        String ht = txt_ht.getText();
        String gt = chb_gt.getText();
        String ns = txt_ns.getText();
        String dtb = txt_dtb.getText();
        String lop = cbb_lop.getSelectedItem().toString();
        String sv = "Mã số: "+ms+"\nHọ tên: "+ht+"\nGiới tính: "+gt+"\nNgày sinh: "+ns+"\nĐiểm trung bình: "+dtb+"\nLớp: "+lop;
        txt_sv.setText(sv);
        
    }//GEN-LAST:event_btn_xacnhanMouseClicked
    static ArrayList<Sinhvien> ListSV = new ArrayList<>();
    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
        String ms = txt_ms.getText();
        String ht = txt_ht.getText();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(txt_ns.getText(), inputFormatter);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String nssv = date.format(outputFormatter);
        LocalDate ns = LocalDate.parse(nssv);
        Double dtb = Double.parseDouble(txt_dtb.getText());
        String lop = cbb_lop.getSelectedItem().toString();
        Sinhvien sv = new Sinhvien(ms, ht, ns, dtb, lop);
        ListSV.add(sv);
        
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_nhaplaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nhaplaiMouseClicked
        // TODO add your handling code here:
        txt_ms.setText("");
        txt_ht.setText("");
        chb_gt.setSelected(false);
        chb_gt.setText("Nữ");
        txt_ns.setText("");
        txt_dtb.setText("");
        cbb_lop.setSelectedIndex(0);
    }//GEN-LAST:event_btn_nhaplaiMouseClicked

    private void btn_addfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addfileMouseClicked
        // TODO add your handling code here:
        try{
            FileWriter f = new FileWriter("d:\\sinhvien.txt",true);
            f.write(txt_sv.getText());
            f.close();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(rootPane, "ghi that bai");
        }
        
    }//GEN-LAST:event_btn_addfileMouseClicked

    private void btn_docfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_docfileMouseClicked
        // TODO add your handling code here:
        String tenfile = txt_file.getText();
        String strline="";
        String nd = "";
        try{
            tenfile = tenfile.replace("'\'", "\\");
            FileReader fr = new FileReader(tenfile);
            BufferedReader br = new BufferedReader(fr);
            while (strline!=null){
                strline = br.readLine();
                nd = nd + strline + "\n";
                
            }
            txt_filesv.setText(nd);
            fr.close();
        }
        catch(IOException e){
        JOptionPane.showMessageDialog(rootPane, "da co loi xay ra");}
        
        
    }//GEN-LAST:event_btn_docfileMouseClicked

    private void btn_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fileMouseClicked
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int t = fc.showOpenDialog(rootPane);
        if (t == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            txt_file.setText(f.getPath());
        }
        
    }//GEN-LAST:event_btn_fileMouseClicked

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
            java.util.logging.Logger.getLogger(bai16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addfile;
    private javax.swing.JButton btn_docfile;
    private javax.swing.JButton btn_file;
    private javax.swing.JButton btn_nhaplai;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xacnhan;
    private javax.swing.JComboBox<String> cbb_lop;
    private javax.swing.JCheckBox chb_gt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_dtb;
    private javax.swing.JTextField txt_file;
    private javax.swing.JTextArea txt_filesv;
    private javax.swing.JTextField txt_ht;
    private javax.swing.JTextField txt_ms;
    private javax.swing.JTextField txt_ns;
    private javax.swing.JTextArea txt_sv;
    // End of variables declaration//GEN-END:variables
}
