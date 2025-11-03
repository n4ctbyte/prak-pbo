package com.mycompany.form;

import javax.swing.*;
import java.awt.*;

public class FormJFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormJFrame.class.getName());

    private JButton TambahDataButton;
    private JButton LihatDataButton;
    private JButton updateSidebarButton;
    private JButton deleteSidebarButton;

    private JPanel sidebarPanel;
    private JPanel basePanel;
    private JPanel mainPanel;

    private LihatDataPanel lihatDataPanel;

    public FormJFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulir Data Mahasiswa");

        sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        sidebarPanel.setBackground(new Color(102, 255, 255));
        sidebarPanel.setOpaque(true);

        final int BUTTON_WIDTH = 160;
        final int BUTTON_HEIGHT = 36;
        Dimension btnDim = new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT);

        TambahDataButton = new JButton("Tambah Data");
        TambahDataButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        TambahDataButton.setPreferredSize(btnDim);
        TambahDataButton.setMaximumSize(btnDim);
        TambahDataButton.setMinimumSize(btnDim);
        TambahDataButton.addActionListener(evt -> TambahDataButtonActionPerformed(evt));
        sidebarPanel.add(TambahDataButton);
        sidebarPanel.add(Box.createVerticalStrut(8));

        LihatDataButton = new JButton("Lihat Data");
        LihatDataButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        LihatDataButton.setPreferredSize(btnDim);
        LihatDataButton.setMaximumSize(btnDim);
        LihatDataButton.setMinimumSize(btnDim);
        LihatDataButton.addActionListener(evt -> LihatDataButtonActionPerformed(evt));
        sidebarPanel.add(LihatDataButton);
        sidebarPanel.add(Box.createVerticalStrut(12));

        updateSidebarButton = new JButton("Update Data");
        updateSidebarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        updateSidebarButton.setPreferredSize(btnDim);
        updateSidebarButton.setMaximumSize(btnDim);
        updateSidebarButton.setMinimumSize(btnDim);
        updateSidebarButton.addActionListener(evt -> updateSidebarButtonActionPerformed(evt));
        sidebarPanel.add(updateSidebarButton);
        sidebarPanel.add(Box.createVerticalStrut(6));

        deleteSidebarButton = new JButton("Hapus Data");
        deleteSidebarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        deleteSidebarButton.setPreferredSize(btnDim);
        deleteSidebarButton.setMaximumSize(btnDim);
        deleteSidebarButton.setMinimumSize(btnDim);
        deleteSidebarButton.addActionListener(evt -> deleteSidebarButtonActionPerformed(evt));
        sidebarPanel.add(deleteSidebarButton);

        getContentPane().add(sidebarPanel, BorderLayout.LINE_START);

        mainPanel = new JPanel(new BorderLayout());
        basePanel = new JPanel(new BorderLayout());
        basePanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        basePanel.add(mainPanel, BorderLayout.CENTER);

        getContentPane().add(basePanel, BorderLayout.CENTER);

        pack();
        setSize(900, 540);
        setLocationRelativeTo(null);
    }

    private void TambahDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
        changeMainPanel(new TambahDataPanel());
    }

    private void LihatDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
        changeMainPanel(new LihatDataPanel());
    }

    private void updateSidebarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (lihatDataPanel != null) {
            lihatDataPanel.updateSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Buka panel 'Lihat Data' terlebih dahulu.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void deleteSidebarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (lihatDataPanel != null) {
            lihatDataPanel.deleteSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Buka panel 'Lihat Data' terlebih dahulu.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void changeMainPanel(javax.swing.JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.repaint();
        mainPanel.revalidate();

        if (panel instanceof LihatDataPanel) {
            lihatDataPanel = (LihatDataPanel) panel;
        } else {
            lihatDataPanel = null;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FormJFrame().setVisible(true));
    }
}