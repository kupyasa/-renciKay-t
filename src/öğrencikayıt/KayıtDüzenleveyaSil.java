/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package öğrencikayıt;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yakup
 */
public class KayıtDüzenleveyaSil extends javax.swing.JFrame {

    ArrayList<Öğrenci> öğrenciler;
    String[] öğrencilerDizi;
    ArrayList<Integer> öğrenciNoları;

    /**
     * Creates new form KayıtDüzenleveyaSil
     */
    public KayıtDüzenleveyaSil() {
        initComponents();

        öğrenciler = new ArrayList<Öğrenci>();
        arrayListiDoldur();
        öğrenciNoları =new ArrayList<Integer>();

        for (int i = 0; i < öğrenciler.size(); i++) {
            öğrenciNoları.add(öğrenciler.get(i).öğrenciNo);
        }

        öğrencilerDizi = new String[öğrenciler.size()];

        for (int i = 0; i < öğrenciler.size(); i++) {
            öğrencilerDizi[i] = String.format("%d %s %s %s ", öğrenciler.get(i).öğrenciNo, öğrenciler.get(i).ad,
                    öğrenciler.get(i).soyad, öğrenciler.get(i).bölüm);
        }

        öğrenciSeçComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(öğrencilerDizi));

        öğrenciSeçComboBox.setSelectedIndex(0);

    }

    public void arrayListiDoldur() {
        try {
            FileInputStream file = new FileInputStream("ogrenciler.dat");
            ObjectInput inputFile = new ObjectInputStream(file);

            boolean dosyaSonu = false;
            while (!dosyaSonu) {
                try {
                    öğrenciler.add((Öğrenci) inputFile.readObject());
                } catch (EOFException e) {
                    dosyaSonu = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void öğrenciyiDosyayaKaydet() {
        try {
            FileOutputStream file = new FileOutputStream("ogrenciler.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);

            for (int i = 0; i < öğrenciler.size(); i++) {
                outputFile.writeObject(öğrenciler.get(i));
            }
            outputFile.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kayıtEklePanel = new javax.swing.JPanel();
        öğrenciAdıLabel = new javax.swing.JLabel();
        öğrenciAdıTextField = new javax.swing.JTextField();
        öğrenciSoyadıLabel = new javax.swing.JLabel();
        öğrenciNumarasıLabel = new javax.swing.JLabel();
        öğrencininCinsiyetiLabel = new javax.swing.JLabel();
        öğrencininBölümüLabel = new javax.swing.JLabel();
        öğrencininDoğumYeriLabel = new javax.swing.JLabel();
        öğrencininYaşıLabel = new javax.swing.JLabel();
        öğrenciTelefonNoLabel = new javax.swing.JLabel();
        öğrenciNumarasıTextField = new javax.swing.JTextField();
        öğrenciBölümüTextField = new javax.swing.JTextField();
        öğrencininCinsiyetiTextField = new javax.swing.JTextField();
        öğrencininYaşıTextField = new javax.swing.JTextField();
        öğrencininDoğumYeriTextField = new javax.swing.JTextField();
        öğrenciSoyadıTextField = new javax.swing.JTextField();
        öğrenciTelefonNoTextField = new javax.swing.JTextField();
        öğrenciSeçLabel = new javax.swing.JLabel();
        öğrenciSeçComboBox = new javax.swing.JComboBox<>();
        düzenleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kayıt Düzenle veya Sil");
        setResizable(false);

        kayıtEklePanel.setBackground(new java.awt.Color(0, 180, 180));

        öğrenciAdıLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrenciAdıLabel.setText("Öğrenci Adı:");

        öğrenciAdıTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrenciSoyadıLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrenciSoyadıLabel.setText("Öğrenci Soyadı:");

        öğrenciNumarasıLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrenciNumarasıLabel.setText("Öğrenci Numarası:");

        öğrencininCinsiyetiLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrencininCinsiyetiLabel.setText("Öğrencinin Cinsiyeti:");

        öğrencininBölümüLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrencininBölümüLabel.setText("Öğrencinin Bölümü:");

        öğrencininDoğumYeriLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrencininDoğumYeriLabel.setText("Öğrencinin Doğum Yeri:");

        öğrencininYaşıLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrencininYaşıLabel.setText("Öğrencinin Yaşı:");

        öğrenciTelefonNoLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        öğrenciTelefonNoLabel.setText("Öğrencinin Telefon Numarası:");

        öğrenciNumarasıTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrenciBölümüTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrencininCinsiyetiTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrencininYaşıTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrencininDoğumYeriTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrenciSoyadıTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrenciTelefonNoTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        öğrenciSeçLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        öğrenciSeçLabel.setText("Öğrenci Seç:");

        öğrenciSeçComboBox.setFont(new java.awt.Font("sansserif", 1, 19)); // NOI18N
        öğrenciSeçComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        öğrenciSeçComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                öğrenciSeçComboBoxActionPerformed(evt);
            }
        });

        düzenleButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        düzenleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Icons/düzenle.png"))); // NOI18N
        düzenleButton.setText("Düzenle");
        düzenleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                düzenleButtonActionPerformed(evt);
            }
        });

        silButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        silButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Icons/sil.png"))); // NOI18N
        silButton.setText("Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kayıtEklePanelLayout = new javax.swing.GroupLayout(kayıtEklePanel);
        kayıtEklePanel.setLayout(kayıtEklePanelLayout);
        kayıtEklePanelLayout.setHorizontalGroup(
            kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                        .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(öğrencininYaşıLabel)
                            .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(öğrenciTelefonNoLabel)
                                    .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(düzenleButton)))
                                .addGap(18, 18, 18)
                                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(öğrenciTelefonNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtEklePanelLayout.createSequentialGroup()
                                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                        .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(öğrencininDoğumYeriLabel)
                            .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                                .addComponent(öğrenciSeçLabel)
                                .addGap(18, 18, 18)
                                .addComponent(öğrenciSeçComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(öğrenciSoyadıLabel)
                                    .addComponent(öğrenciAdıLabel)
                                    .addComponent(öğrenciNumarasıLabel)
                                    .addComponent(öğrencininBölümüLabel)
                                    .addComponent(öğrencininCinsiyetiLabel))
                                .addGap(118, 118, 118)
                                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(öğrencininCinsiyetiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrenciBölümüTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrenciNumarasıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrenciAdıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrenciSoyadıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrencininDoğumYeriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(öğrencininYaşıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        kayıtEklePanelLayout.setVerticalGroup(
            kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayıtEklePanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrenciSeçLabel)
                    .addComponent(öğrenciSeçComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrenciAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrenciAdıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrenciSoyadıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrenciSoyadıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrenciNumarasıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrenciNumarasıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrencininBölümüLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrenciBölümüTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrencininCinsiyetiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrencininCinsiyetiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrencininDoğumYeriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrencininDoğumYeriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrencininYaşıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrencininYaşıTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(öğrenciTelefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(öğrenciTelefonNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(kayıtEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(düzenleButton)
                    .addComponent(silButton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kayıtEklePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kayıtEklePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void öğrenciSeçComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_öğrenciSeçComboBoxActionPerformed
        // TODO add your handling code here:
        int seçilenIndex = öğrenciSeçComboBox.getSelectedIndex();

        öğrenciAdıTextField.setText(öğrenciler.get(seçilenIndex).ad);
        öğrenciSoyadıTextField.setText(öğrenciler.get(seçilenIndex).soyad);
        öğrenciNumarasıTextField.setText(String.valueOf(öğrenciler.get(seçilenIndex).öğrenciNo));
        öğrenciBölümüTextField.setText(öğrenciler.get(seçilenIndex).bölüm);
        öğrencininCinsiyetiTextField.setText(öğrenciler.get(seçilenIndex).cinsiyet);
        öğrencininDoğumYeriTextField.setText(öğrenciler.get(seçilenIndex).doğumYeri);
        öğrencininYaşıTextField.setText(String.valueOf(öğrenciler.get(seçilenIndex).yaş));
        öğrenciTelefonNoTextField.setText(öğrenciler.get(seçilenIndex).telefonNo);
    }//GEN-LAST:event_öğrenciSeçComboBoxActionPerformed

    private void düzenleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_düzenleButtonActionPerformed
        // TODO add your handling code here:
        if (öğrenciAdıTextField.getText().isEmpty() || öğrenciSoyadıTextField.getText().isEmpty() || öğrenciNumarasıTextField.getText().isEmpty()
                || öğrenciBölümüTextField.getText().isEmpty() || öğrencininCinsiyetiTextField.getText().isEmpty() || öğrencininDoğumYeriTextField.getText().isEmpty()
                || öğrencininYaşıTextField.getText().isEmpty() || öğrenciTelefonNoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen alanları düzgün bir şekilde doldurunuz.");
        } else if (öğrenciNoları.contains(Integer.valueOf(öğrenciNumarasıTextField.getText()))) {
            JOptionPane.showMessageDialog(null, "Bu öğrenci numarası daha önce kullanımış.");
        } else {
            int seçilenIndex = öğrenciSeçComboBox.getSelectedIndex();

            öğrenciler.get(seçilenIndex).ad = öğrenciAdıTextField.getText().toUpperCase();
            öğrenciler.get(seçilenIndex).soyad = öğrenciSoyadıTextField.getText().toUpperCase();
            öğrenciler.get(seçilenIndex).öğrenciNo = Integer.valueOf(öğrenciNumarasıTextField.getText());
            öğrenciler.get(seçilenIndex).bölüm = öğrenciBölümüTextField.getText().toUpperCase();
            öğrenciler.get(seçilenIndex).cinsiyet = öğrencininCinsiyetiTextField.getText().toUpperCase();
            öğrenciler.get(seçilenIndex).doğumYeri = öğrencininDoğumYeriTextField.getText().toUpperCase();
            öğrenciler.get(seçilenIndex).yaş = Integer.valueOf(öğrencininYaşıTextField.getText());
            öğrenciler.get(seçilenIndex).telefonNo = öğrenciTelefonNoTextField.getText().toUpperCase();

            öğrenciyiDosyayaKaydet();

            öğrencilerDizi = new String[öğrenciler.size()];

            for (int i = 0; i < öğrenciler.size(); i++) {
                öğrencilerDizi[i] = String.format("%d %s %s %s ", öğrenciler.get(i).öğrenciNo, öğrenciler.get(i).ad,
                        öğrenciler.get(i).soyad, öğrenciler.get(i).bölüm);
            }

            öğrenciSeçComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(öğrencilerDizi));

            öğrenciSeçComboBox.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Öğrenci kaydı başarıyla düzenlendi.");

        }
    }//GEN-LAST:event_düzenleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        // TODO add your handling code here:

        int seçilenIndex = öğrenciSeçComboBox.getSelectedIndex();

        öğrenciler.remove(seçilenIndex);

        öğrenciyiDosyayaKaydet();

        öğrencilerDizi = new String[öğrenciler.size()];

        for (int i = 0; i < öğrenciler.size(); i++) {
            öğrencilerDizi[i] = String.format("%d %s %s %s ", öğrenciler.get(i).öğrenciNo, öğrenciler.get(i).ad,
                    öğrenciler.get(i).soyad, öğrenciler.get(i).bölüm);
        }

        öğrenciSeçComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(öğrencilerDizi));

        öğrenciSeçComboBox.setSelectedIndex(0);

        JOptionPane.showMessageDialog(null, "Kelime tanımı ve kelime başarıyla silindi.");

    }//GEN-LAST:event_silButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KayıtDüzenleveyaSil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayıtDüzenleveyaSil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayıtDüzenleveyaSil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayıtDüzenleveyaSil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayıtDüzenleveyaSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton düzenleButton;
    private javax.swing.JPanel kayıtEklePanel;
    private javax.swing.JButton silButton;
    private javax.swing.JLabel öğrenciAdıLabel;
    private javax.swing.JTextField öğrenciAdıTextField;
    private javax.swing.JTextField öğrenciBölümüTextField;
    private javax.swing.JLabel öğrenciNumarasıLabel;
    private javax.swing.JTextField öğrenciNumarasıTextField;
    private javax.swing.JComboBox<String> öğrenciSeçComboBox;
    private javax.swing.JLabel öğrenciSeçLabel;
    private javax.swing.JLabel öğrenciSoyadıLabel;
    private javax.swing.JTextField öğrenciSoyadıTextField;
    private javax.swing.JLabel öğrenciTelefonNoLabel;
    private javax.swing.JTextField öğrenciTelefonNoTextField;
    private javax.swing.JLabel öğrencininBölümüLabel;
    private javax.swing.JLabel öğrencininCinsiyetiLabel;
    private javax.swing.JTextField öğrencininCinsiyetiTextField;
    private javax.swing.JLabel öğrencininDoğumYeriLabel;
    private javax.swing.JTextField öğrencininDoğumYeriTextField;
    private javax.swing.JLabel öğrencininYaşıLabel;
    private javax.swing.JTextField öğrencininYaşıTextField;
    // End of variables declaration//GEN-END:variables
}
