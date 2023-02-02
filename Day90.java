import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Day90 {
    public Day90() throws MalformedInputException, MalformedURLException{
        JFrame jFrame = new JFrame("Image");
        jFrame.setSize(300, 125);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String imageURL = "some-url-here";
        URL domain = new URL(imageURL);
        ImageIcon imageIcon = new ImageIcon(domain, "java");
        JLabel jlabel = new JLabel(imageIcon, JLabel.CENTER);

        jFrame.add(jlabel);
        jFrame.setVisible(true);
    }   
    public static void main(String[] args) throws MalformedInputException, MalformedURLException{
        new Day90();
        
    }
}