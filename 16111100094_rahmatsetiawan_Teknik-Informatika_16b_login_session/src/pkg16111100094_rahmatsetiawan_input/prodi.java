/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16111100094_rahmatsetiawan_input;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAHMAT SETIAWAN 16111100094-16B
 */
public class prodi extends javax.swing.JFrame {

    /**
     * Creates new form tampilan
     */
    public prodi() {
        initComponents();
        tabel_data ();  //memanggil class tabel_data;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        data_tabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        status_pilihan = new javax.swing.JComboBox<>();
        p_studi_isian = new javax.swing.JTextField();
        kode_isian = new javax.swing.JTextField();
        reset_tbl = new javax.swing.JButton();
        simpan_tbl = new javax.swing.JButton();
        hapus_tbl = new javax.swing.JButton();
        ubah_tbl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Data")));

        data_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode", "Program Studi", "Status"
            }
        ));
        data_tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Isian"));

        jLabel1.setText("Kode");

        jLabel2.setText("Program Studi");

        jLabel3.setText("Status Aktif");

        status_pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Aktif", "Tidak Aktif" }));

        p_studi_isian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_studi_isianActionPerformed(evt);
            }
        });

        kode_isian.setEditable(false);

        reset_tbl.setText("Reset");
        reset_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_tblActionPerformed(evt);
            }
        });

        simpan_tbl.setText("Simpan");
        simpan_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_tblActionPerformed(evt);
            }
        });

        hapus_tbl.setText("Hapus");
        hapus_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_tblActionPerformed(evt);
            }
        });

        ubah_tbl.setText("Ubah");
        ubah_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_tblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(reset_tbl))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kode_isian)
                            .addComponent(p_studi_isian)
                            .addComponent(status_pilihan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpan_tbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus_tbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah_tbl)
                        .addContainerGap(116, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kode_isian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p_studi_isian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(status_pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_tbl)
                    .addComponent(simpan_tbl)
                    .addComponent(hapus_tbl)
                    .addComponent(ubah_tbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_studi_isianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_studi_isianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_studi_isianActionPerformed

    private void simpan_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_tblActionPerformed
                                       
try {
    //memasukkan data ke database;
    String sql = "INSERT INTO prodi (p_studi_prodi,status_prodi) VALUE('"+
            p_studi_isian.getText()+"','"+
            status_pilihan.getSelectedItem()+"')";
    java.sql.Connection conn= (Connection) config.configDB();
    java.sql.PreparedStatement pst=conn.prepareStatement (sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "penyimpanan berhasil brow");
    tabel_data ();  //memanggil class tabel_data;
    form_kosong (); 
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}
   
    }//GEN-LAST:event_simpan_tblActionPerformed

//menampilkan data dari database ke tabel;
private void tabel_data( ){
     //memberi penamaan pada judul kolom tabel;    
    DefaultTableModel model = new DefaultTableModel ( );
             data_tabel.setModel(model);
             model.addColumn("Kode");
             model.addColumn("Program Studi");
             model.addColumn("Status");
try {
     //mengambil data dari database;
    String sql = "SELECT * from prodi";
    java.sql.Connection conn=(Connection) config.configDB();
    java.sql.Statement stm=conn.createStatement();
    java.sql.ResultSet res=stm.executeQuery(sql);
    while (res.next()) {
        model.addRow(new Object[]{
            res.getString(1),
            res.getString(2),
            res.getString(3)});
    }
    data_tabel.setModel (model);
}catch (Exception e){
}
} 

private void form_kosong (){
            kode_isian.setText("");
            p_studi_isian.setText("");
            status_pilihan.setSelectedIndex(0);
}
    
    private void hapus_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_tblActionPerformed
try {   
     //memasukkan data ke database;
    String sql = "DELETE FROM prodi WHERE kode_prodi ='"+kode_isian.getText()+"'";
    java.sql.Connection conn= (Connection) config.configDB();
    java.sql.PreparedStatement pst=conn.prepareStatement (sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "hapus data berhasil brow");
    tabel_data ();  //memanggil class tabel_data;
    form_kosong (); 
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}        
    
    }//GEN-LAST:event_hapus_tblActionPerformed

    private void data_tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tabelMouseClicked
        int kolom = data_tabel.rowAtPoint(evt.getPoint());
        String kolom_kode_isian1 = data_tabel.getValueAt(kolom, 0).toString();
        kode_isian.setText(kolom_kode_isian1);
        String kolom_p_studi_isian1 = data_tabel.getValueAt(kolom, 1).toString();
        p_studi_isian.setText(kolom_p_studi_isian1);
        String kolom_status_prodi = data_tabel.getValueAt(kolom, 2).toString();
        status_pilihan.setSelectedItem(kolom_status_prodi);
    }//GEN-LAST:event_data_tabelMouseClicked

    private void ubah_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_tblActionPerformed
try {
    //memasukkan data ke database;
    String sql = "UPDATE prodi SET p_studi_prodi='"+
            p_studi_isian.getText()+"',status_prodi='"+
            status_pilihan.getSelectedItem()+
             "'WHERE kode_prodi ='"+kode_isian.getText()+"'";
    java.sql.Connection conn= (Connection) config.configDB();
    java.sql.PreparedStatement pst=conn.prepareStatement (sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "penyimpanan berhasil brow");
    tabel_data ();  //memanggil class tabel_data;
    form_kosong (); 
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}
   
    
    }//GEN-LAST:event_ubah_tblActionPerformed

    private void reset_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_tblActionPerformed
    form_kosong (); 
    }//GEN-LAST:event_reset_tblActionPerformed

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
            java.util.logging.Logger.getLogger(prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prodi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data_tabel;
    private javax.swing.JButton hapus_tbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode_isian;
    private javax.swing.JTextField p_studi_isian;
    private javax.swing.JButton reset_tbl;
    private javax.swing.JButton simpan_tbl;
    private javax.swing.JComboBox<String> status_pilihan;
    private javax.swing.JButton ubah_tbl;
    // End of variables declaration//GEN-END:variables
}