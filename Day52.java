import javax.swing.*;

public class Day52 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter You are name");
        JOptionPane.showMessageDialog(null , name);

        long age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Yoy are" +age+ "years old");

        long width = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Yoy are" +width+ "years old");

        long height  = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Yoy are" +height+ "years old");
    }
}
