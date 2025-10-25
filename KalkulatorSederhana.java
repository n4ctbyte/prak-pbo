import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorSederhana extends JFrame {
    private final JTextField disp = new JTextField("0");
    private final JLabel opLabel = new JLabel(" ");
    private String op = "";
    private double val = 0;
    private boolean next = true;

    public KalkulatorSederhana() {
        super("Kalkulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        disp.setHorizontalAlignment(SwingConstants.RIGHT);
        disp.setEditable(false);
        disp.setFont(new Font("Segoe UI", Font.BOLD, 24));
        opLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        opLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        JPanel panel = new JPanel(new GridLayout(5,4,5,5));
        String[] keys = {
            "C","Del","/","*",
            "7","8","9","-",
            "4","5","6","+",
            "1","2","3","=",
            "0",".","",""
        };
        for (String k: keys) {
            if (k.isEmpty()) panel.add(new JLabel());
            else {
                JButton b = new JButton(k);
                b.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                b.addActionListener(this::press);
                panel.add(b);
            }
        }

        JPanel top = new JPanel(new BorderLayout());
        top.add(opLabel, BorderLayout.NORTH);
        top.add(disp, BorderLayout.CENTER);

        getContentPane().add(top, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    private void press(ActionEvent e) {
        String t = ((JButton)e.getSource()).getText();
        if ("0123456789".contains(t)) digit(t);
        else if (t.equals(".")) dot();
        else if (t.equals("C")) clear();
        else if (t.equals("Del")) back();
        else if (t.equals("=")) equals();
        else operator(t);
    }

    private void digit(String s) {
        if (next) { disp.setText(s); next=false; }
        else disp.setText(disp.getText().equals("0") ? s : disp.getText()+s);
    }

    private void dot() {
        if (next) { disp.setText("0."); next=false; }
        else if (!disp.getText().contains(".")) disp.setText(disp.getText()+".");
    }

    private void clear() { disp.setText("0"); opLabel.setText(" "); op=""; val=0; next=true; }

    private void back() {
        String s = disp.getText();
        if (s.length() > 1 && !next) disp.setText(s.substring(0,s.length()-1));
        else { disp.setText("0"); next = true; }
    }

    private void operator(String o) {
        val = Double.parseDouble(disp.getText());
        op = o;
        opLabel.setText(val + " " + o);
        next = true;
    }

    private void equals() {
        if (op.isEmpty()) return;
        double cur = Double.parseDouble(disp.getText());
        double r = switch(op){
            case "+": yield val + cur;
            case "-": yield val - cur;
            case "*": yield val * cur;
            case "/": yield cur==0 ? Double.NaN : val / cur;
            default: yield cur;
        };
        disp.setText(Double.isNaN(r) ? "Error" : trim(r));
        opLabel.setText(" ");
        op="";
        next=true;
    }

    private String trim(double x){
        if (x==(long)x) return String.valueOf((long)x);
        return String.format("%.6f",x).replaceAll("0+$","").replaceAll("\\.$","");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KalkulatorSederhana().setVisible(true));
    }
}