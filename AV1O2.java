import javax.swing.*;

public class AV1O2 {
    public static void main(String[] args) {
        // maakt variablen aan en print niet graphies text uit
        addHello("Hello");
        String name = " James";
        System.out.println("Hello" + name);

    }
    public static void addHello (String H) {
        // print graphies text uit
        String name = " James";
        JOptionPane.showMessageDialog(null, H + name);
    }
}
