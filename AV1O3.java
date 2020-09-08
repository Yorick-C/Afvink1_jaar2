import java.awt.event.*;
import javax.swing.*;
class AV1O3 extends JFrame implements ActionListener {
    // constructie van het textveld
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;
    AV1O3()
    {
    }

    public static void main(String[] args)
    {
        // Geeft een naam aan het frame
        f = new JFrame("textfield");

        // Text input wordt hier opgeslagen
        l = new JLabel();

        // Naam van de knop
        b = new JButton("submit");

        // Object voor de class
        AV1O3 te = new AV1O3();

        // addActionListener aan de knop te linken
        b.addActionListener(te);

        // maakt het textveld 16 kollomen
        t = new JTextField(16);

        // maakt een panel voor de knopen en textveld
        JPanel p = new JPanel();

        // zet de knoppen er in
        p.add(t);
        p.add(b);
        p.add(l);

        // voegt een panel toe aan het frame
        f.add(p);

        // grote van het frame
        f.setSize(300, 300);

        // zonder dit laat die de textveld niet zien
        f.show();
    }

    // input van de submit knop
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // zet de text in het label veld
            l.setText(t.getText());

            // zet hem weer blanco
            t.setText("  ");
        }
    }
}