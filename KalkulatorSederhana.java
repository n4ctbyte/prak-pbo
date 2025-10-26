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

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] keys = {
            "C", "Del", "/", "*",
            "7", "8", "9", "-",
            "4", "5", "6", "+",
            "1", "2", "3", "=",
            "0", ".", "", ""
        };
        for (String k : keys) {
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

        setupKeyBindings();

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(e -> {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                int kc = e.getKeyCode();
                if (kc == KeyEvent.VK_BACK_SPACE || kc == KeyEvent.VK_DELETE) {
                    SwingUtilities.invokeLater(this::back);
                    return true;
                }
                if (kc == KeyEvent.VK_ENTER) {
                    SwingUtilities.invokeLater(this::equalsOp);
                    return true;
                }
                if (kc == KeyEvent.VK_ESCAPE) {
                    SwingUtilities.invokeLater(this::clear);
                    return true;
                }
                if (kc == KeyEvent.VK_PERIOD || kc == KeyEvent.VK_DECIMAL) {
                    SwingUtilities.invokeLater(this::dot);
                    return true;
                }
            } else if (e.getID() == KeyEvent.KEY_TYPED) {
                char ch = e.getKeyChar();
                if (ch == '.') {
                    SwingUtilities.invokeLater(this::dot);
                    return true;
                }
            }
            return false;
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void setupKeyBindings() {
        JRootPane root = getRootPane();
        InputMap im = root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = root.getActionMap();

        for (int d = 0; d <= 9; d++) {
            String key = String.valueOf(d);
            im.put(KeyStroke.getKeyStroke(key), "digit" + key);
            am.put("digit" + key, new AbstractAction() {
                public void actionPerformed(ActionEvent e) { digit(key); }
            });

            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0 + d, 0), "digitN" + key);
            am.put("digitN" + key, new AbstractAction() {
                public void actionPerformed(ActionEvent e) { digit(key); }
            });
        }

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "dot");
        im.put(KeyStroke.getKeyStroke('.', 0), "dot");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "dot");
        am.put("dot", new AbstractAction() { public void actionPerformed(ActionEvent e) { dot(); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "plus");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.SHIFT_DOWN_MASK), "plus");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "plus");
        am.put("plus", new AbstractAction(){ public void actionPerformed(ActionEvent e){ operator("+"); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "minus");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "minus");
        am.put("minus", new AbstractAction(){ public void actionPerformed(ActionEvent e){ operator("-"); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ASTERISK, 0), "mul");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.SHIFT_DOWN_MASK), "mul");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "mul");
        am.put("mul", new AbstractAction(){ public void actionPerformed(ActionEvent e){ operator("*"); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0), "div");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "div");
        am.put("div", new AbstractAction(){ public void actionPerformed(ActionEvent e){ operator("/"); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "equals");
        im.put(KeyStroke.getKeyStroke("ENTER"), "equals");
        am.put("equals", new AbstractAction(){ public void actionPerformed(ActionEvent e){ equalsOp(); }});

        im.put(KeyStroke.getKeyStroke("BACK_SPACE"), "back");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0, false), "back");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0, false), "back");
        am.put("back", new AbstractAction(){ public void actionPerformed(ActionEvent e){ back(); }});

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "clear");
        am.put("clear", new AbstractAction(){ public void actionPerformed(ActionEvent e){ clear(); }});
    }

    private void press(ActionEvent e) {
        String t = ((JButton)e.getSource()).getText();
        if ("0123456789".contains(t)) digit(t);
        else if (t.equals(".")) dot();
        else if (t.equals("C")) clear();
        else if (t.equals("Del")) back();
        else if (t.equals("=")) equalsOp();
        else operator(t);
    }

    private void digit(String s) {
        if (next) { disp.setText(s); next = false; }
        else disp.setText(disp.getText().equals("0") ? s : disp.getText() + s);
    }

    private void dot() {
        if (next) { disp.setText("0."); next = false; }
        else if (!disp.getText().contains(".")) disp.setText(disp.getText() + ".");
    }

    private void clear() {
        disp.setText("0");
        opLabel.setText(" ");
        op = "";
        val = 0;
        next = true;
    }

    private void back() {
        String s = disp.getText();
        if (next) {
            if (!"0".equals(s)) {
                if (s.length() > 1) disp.setText(s.substring(0, s.length() - 1));
                else disp.setText("0");
            }
        } else {
            if (s.length() > 1) disp.setText(s.substring(0, s.length() - 1));
            else { disp.setText("0"); next = true; }
        }
    }

    private void operator(String o) {
        val = Double.parseDouble(disp.getText());
        op = o;
        opLabel.setText(val + " " + o);
        next = true;
    }

    private void equalsOp() {
        if (op.isEmpty()) return;
        double cur = Double.parseDouble(disp.getText());
        double r = switch (op) {
            case "+" -> val + cur;
            case "-" -> val - cur;
            case "*" -> val * cur;
            case "/" -> cur == 0 ? Double.NaN : val / cur;
            default -> cur;
        };
        disp.setText(Double.isNaN(r) ? "Error" : trim(r));
        opLabel.setText(" ");
        op = "";
        next = true;
    }

    private String trim(double x) {
        if (x == (long) x) return String.valueOf((long) x);
        return String.format("%.6f", x).replaceAll("0+$", "").replaceAll("\\.$", "");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KalkulatorSederhana().setVisible(true));
    }
}