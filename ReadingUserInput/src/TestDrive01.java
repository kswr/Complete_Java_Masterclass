import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TestDrive01 extends JFrame {
//    static Scanner scanner;
    String name;
    Scanner scanner;

    public static void main(String[] args) {
        TestDrive01 gui = new TestDrive01();
        gui.scan();
        EventQueue.invokeLater(()->{
            gui.go();
        });
    }

    public void go() {
        JFrame jFrame = new JFrame();
//        JTextArea jTextArea = new JTextArea();
//        jTextArea.setText(name);
//        jFrame.getContentPane().add(jTextArea);
        JLabel jLabel = new JLabel();
        jLabel.setText(name);
        jFrame.getContentPane().add(jLabel);

//        jFrame.setSize(200,150);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void scan() {
        scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        scanner.close();
    }

}
