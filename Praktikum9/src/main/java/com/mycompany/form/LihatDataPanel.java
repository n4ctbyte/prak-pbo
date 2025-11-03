package com.mycompany.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LihatDataPanel extends JPanel {

    private JTable mahasiswaTable;
    private JScrollPane jScrollPane1;
    private JLabel jLabel1;

    public LihatDataPanel() {
        initComponents();
        loadData();
    }

    private void initComponents() {
        setLayout(new BorderLayout(8, 8));

        jLabel1 = new JLabel("Lihat Data Mahasiswa");
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jLabel1.setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 8));
        add(jLabel1, BorderLayout.NORTH);

        mahasiswaTable = new JTable();
        jScrollPane1 = new JScrollPane(mahasiswaTable);
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder(0, 8, 8, 8));
        add(jScrollPane1, BorderLayout.CENTER);
    }

    public void loadData() {
        String[] column = {"Nama", "NIM", "Prodi", "Jenis Kelamin", "Status"};
        DefaultTableModel table = new DefaultTableModel(null, column) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Mahasiswa mhs : Mahasiswa.mahasiswas) {
            table.addRow(new String[]{
                mhs.getNama(), mhs.getNim(),
                mhs.getProdi(), mhs.getJenisKelamin(),
                mhs.isIsActive() ? "Aktif" : "Tidak Aktif"
            });
        }
        mahasiswaTable.setModel(table);
        if (mahasiswaTable.getRowCount() > 0) {
            mahasiswaTable.setRowSelectionInterval(0, 0);
        }
    }

    public void updateSelected() {
        int selectedRow = mahasiswaTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Mahasiswa mhs = Mahasiswa.mahasiswas.get(selectedRow);

        JTextField namaField = new JTextField(mhs.getNama());
        JTextField nimField = new JTextField(mhs.getNim());

        JComboBox<String> prodiCombo = new JComboBox<>(new String[]{
            "S1 Teknik Informatika", "S1 Teknik Elektro", "D3 Teknik Elektro"
        });
        prodiCombo.setSelectedItem(mhs.getProdi());

        JRadioButton lakiRadio = new JRadioButton("Laki-laki");
        JRadioButton perempuanRadio = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(lakiRadio);
        genderGroup.add(perempuanRadio);
        if ("Laki-laki".equals(mhs.getJenisKelamin())) {
            lakiRadio.setSelected(true);
        } else {
            perempuanRadio.setSelected(true);
        }

        JCheckBox aktifBox = new JCheckBox("Aktif", mhs.isIsActive());

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Nama:"));
        panel.add(namaField);
        panel.add(new JLabel("NIM:"));
        panel.add(nimField);
        panel.add(new JLabel("Prodi:"));
        panel.add(prodiCombo);
        panel.add(new JLabel("Jenis Kelamin:"));
        panel.add(lakiRadio);
        panel.add(perempuanRadio);
        panel.add(new JLabel("Status:"));
        panel.add(aktifBox);

        int result = JOptionPane.showConfirmDialog(this, panel, "Update Data Mahasiswa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String namaBaru = namaField.getText().trim();
            String nimBaru = nimField.getText().trim();
            String prodiBaru = (String) prodiCombo.getSelectedItem();
            String jkBaru = lakiRadio.isSelected() ? "Laki-laki" : (perempuanRadio.isSelected() ? "Perempuan" : "");
            boolean aktifBaru = aktifBox.isSelected();

            if (namaBaru.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nimBaru.isEmpty()) {
                JOptionPane.showMessageDialog(this, "NIM tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (genderGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "Jenis kelamin harus dipilih!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!nimBaru.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "NIM harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            for (int i = 0; i < Mahasiswa.mahasiswas.size(); i++) {
                if (i != selectedRow && Mahasiswa.mahasiswas.get(i).getNim().equals(nimBaru)) {
                    JOptionPane.showMessageDialog(this, "NIM sudah digunakan oleh mahasiswa lain!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            mhs.setNama(namaBaru);
            mhs.setNim(nimBaru);
            mhs.setProdi(prodiBaru);
            mhs.setJenisKelamin(jkBaru);
            mhs.setIsActive(aktifBaru);

            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            loadData();
        }
    }

    public void deleteSelected() {
        int selectedRow = mahasiswaTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Mahasiswa.mahasiswas.remove(selectedRow);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            loadData();
        }
    }

    public JTable getMahasiswaTable() {
        return mahasiswaTable;
    }
}