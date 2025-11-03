package com.mycompany.form;

import javax.swing.*;

public class TambahDataPanel extends javax.swing.JPanel {

    public TambahDataPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        nimTextField = new javax.swing.JTextField();
        prodiComboBox = new javax.swing.JComboBox<>();
        lakilakiRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        perempuanRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aktifCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        kirimButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setText("Status");

        namaTextField.addActionListener(evt -> namaTextFieldActionPerformed(evt));
        nimTextField.addActionListener(evt -> nimTextFieldActionPerformed(evt));

        prodiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "S1 Teknik Informatika", "S1 Teknik Elektro", "D3 Teknik Elektro"
        }));

        buttonGroup1.add(lakilakiRadioButton);
        lakilakiRadioButton.setText("Laki-Laki");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Tambah Data Mahasiswa");

        buttonGroup1.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");

        jLabel2.setText("Nama");
        jLabel3.setText("NIM");

        aktifCheckBox.setText("Aktif");
        aktifCheckBox.addActionListener(evt -> aktifCheckBoxActionPerformed(evt));

        jLabel4.setText("Prodi");

        kirimButton.setBackground(new java.awt.Color(0, 255, 255));
        kirimButton.setText("Kirim");
        kirimButton.addActionListener(evt -> kirimButtonActionPerformed(evt));

        jLabel5.setText("Jenis Kelamin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aktifCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lakilakiRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(perempuanRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namaTextField)
                                .addComponent(nimTextField)
                                .addComponent(prodiComboBox, 0, 206, Short.MAX_VALUE))
                            .addComponent(kirimButton))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(prodiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lakilakiRadioButton)
                    .addComponent(perempuanRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aktifCheckBox))
                .addGap(18, 18, 18)
                .addComponent(kirimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }

    private void clearForm() {
        namaTextField.setText("");
        nimTextField.setText("");
        lakilakiRadioButton.setSelected(false);
        perempuanRadioButton.setSelected(false);
        aktifCheckBox.setSelected(false);
    }

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void nimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void aktifCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {}

    private void kirimButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = namaTextField.getText().trim();
        String nim = nimTextField.getText().trim();
        String prodi = (String) prodiComboBox.getSelectedItem();
        boolean genderSelected = buttonGroup1.getSelection() != null;
        String jenisKelamin = lakilakiRadioButton.isSelected() ? "Laki-laki" : (perempuanRadioButton.isSelected() ? "Perempuan" : "");

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!genderSelected) {
            JOptionPane.showMessageDialog(this, "Jenis kelamin harus dipilih!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!nim.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Mahasiswa m : Mahasiswa.mahasiswas) {
            if (m.getNim().equals(nim)) {
                JOptionPane.showMessageDialog(this, "NIM sudah terdaftar!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        boolean isActive = aktifCheckBox.isSelected();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi, jenisKelamin, isActive);
        Mahasiswa.mahasiswas.add(mahasiswa);

        JOptionPane.showMessageDialog(this, "Sukses Menambahkan data mahasiswa " + nama);
        clearForm();
    }

    private javax.swing.JCheckBox aktifCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton kirimButton;
    private javax.swing.JRadioButton lakilakiRadioButton;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> prodiComboBox;
}