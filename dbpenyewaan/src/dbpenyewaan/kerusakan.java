/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpenyewaan;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class kerusakan extends javax.swing.JFrame {
  String[] Judul={"Kerusakan","Nama_Pc","Tanggal"};
   String[] Field={"Kerusakan","Nama_Pc","Tanggal"};
   String SQL ="SELECT*FROM kerusakan";
    int[] Lebar ={100,300,120,80,200,80,100,100};
    /**
     * Creates new form kerusakan
     */
    public kerusakan() {
        koneksi tugas = new koneksi();
        initComponents();
        this.setLocationRelativeTo(null);
        
        tugas.settingJudulTabel(Tablekerusakan, Judul);
        tugas.tampilTabel(Tablekerusakan, SQL, Judul);
        
        tugas.settingLebarKolom(Tablekerusakan, Lebar);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkerusa = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txttgl = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablekerusakan = new javax.swing.JTable();
        Hapus = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Cetak = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Kerusakan");

        jLabel2.setText("Nama Pc");

        jLabel3.setText("Tanggal");

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Tablekerusakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tablekerusakan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablekerusakanAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Tablekerusakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablekerusakanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tablekerusakan);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel4.setText("Kerusakan");

        jButton1.setText("Selesai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(Simpan))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(Hapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Edit)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cetak)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Kembali))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtkerusa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                    .addComponent(txttgl))
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtkerusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cetak)
                    .addComponent(Edit)
                    .addComponent(Hapus)
                    .addComponent(Simpan)
                    .addComponent(jButton1)
                    .addComponent(Kembali))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
     if (txtkerusa.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Kerusakan Belum diisi");
 txtkerusa.requestFocus();
}else if (txtnama.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Nama_Pc Belum diisi");
 txtnama.requestFocus();
}else if (txttgl.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Tanggal Belum diisi");
 txttgl.requestFocus();
}else if (new koneksi().DuplicateKey("kerusakan","Kerusakan",txtkerusa.getText())){
 JOptionPane.showMessageDialog(null, "keruskan Sudah Terdaftar");
 txtkerusa.requestFocus();
}else{
String[] field ={"Kerusakan","Nama_Pc","Tanggal"};
String[] isi
={txtkerusa.getText(),txtnama.getText(),txttgl.getText()};
 new koneksi().SimpanDinamis("kerusakan", field, isi);
 new koneksi().settingJudulTabel(Tablekerusakan, Judul);
 new koneksi().tampilTabel(Tablekerusakan, SQL, Judul);
 new koneksi().settingLebarKolom(Tablekerusakan, Lebar);
 
 }    // TODO add your handling code here:
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
new koneksi().HapusDinamis("kerusakan", "Kerusakan", txtkerusa.getText());
        JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        new koneksi().settingJudulTabel(Tablekerusakan, Judul);
        new koneksi().tampilTabel(Tablekerusakan, SQL, Judul);
        new koneksi().settingLebarKolom(Tablekerusakan, Lebar);
        txtkerusa.setText("");
        txtnama.setText("");
        txttgl.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void TablekerusakanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablekerusakanAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablekerusakanAncestorAdded

    private void TablekerusakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablekerusakanMouseClicked
        // TODO add your handling code here:
int row = Tablekerusakan.getSelectedRow();
        txtkerusa.setText(Tablekerusakan.getModel().getValueAt(row,0).toString());
        txtnama.setText(Tablekerusakan.getModel().getValueAt(row,1).toString());
        txttgl.setText(Tablekerusakan.getModel().getValueAt(row,2).toString());
    }//GEN-LAST:event_TablekerusakanMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
try {
            String[] field = {"Kerusakan","Nama_Pc","Tanggal"};
            String[] isi = {txtkerusa.getText(),txtnama.getText(),txttgl.getText()};
            new koneksi().UbahDinamis("kerusakan", "kerusakan", txtkerusa.getText(), field, isi);
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
            new koneksi().settingJudulTabel(Tablekerusakan, Judul);
            new koneksi().tampilTabel(Tablekerusakan, SQL, Judul);
            new koneksi().settingLebarKolom(Tablekerusakan, Lebar);
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_EditActionPerformed

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        // TODO add your handling code here:
 new koneksi().tampilLaporan("src/laporan/kerusakan.jrxml","SELECT*FROM kerusakan");
    }//GEN-LAST:event_CetakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
Menu_Utama kembali = new Menu_Utama();
kembali.show();
    }//GEN-LAST:event_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(kerusakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kerusakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kerusakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kerusakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kerusakan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cetak;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tablekerusakan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtkerusa;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttgl;
    // End of variables declaration//GEN-END:variables
}
