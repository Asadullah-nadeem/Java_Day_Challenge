import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Day62 extends JFrame {
    public Day62() {
        setDefaultLookAndFeelDecorated(true);
        setLayout(new BorderLayout());
        setSize(403, 239);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.PROPERTIES);

    }


    public static void main(String[] args) throws MalformedURLException {
        Day62 t = new Day62();
        t.setSize(400,400);
        t.setVisible(true);
        Color color = new Color(255, 0, 0);
        t.getContentPane().setBackground(color);

  

    }

}