package com.mycompany.form;

public class Form {

    public static void main(String[] args) {
        FormJFrame frame = new FormJFrame();
        frame.changeMainPanel(new TambahDataPanel());
        frame.setVisible(true);
    }
}
