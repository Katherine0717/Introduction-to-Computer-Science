import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame {
    JLabel originLabel;
    JLabel destinationLabel;
    JLabel distanceLabel;
    JTextField origin;
    JTextField destination;

    public test2(){
        setTitle("Map");
        setSize(1000, 1000);
//        setVisible(true);
        setLayout(new FlowLayout());

        originLabel = new JLabel("Enter your origin: ");
        add(originLabel);
        origin = new JTextField(5);
        add(origin);
        destinationLabel = new JLabel("Enter your destination: ");
        add(destinationLabel);
        destination = new JTextField(5);
        add(destination);
        distanceLabel = new JLabel("Distance: N/A");
        add(distanceLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new test2().setVisible(true);
//        test2 t = new test2();
    }
}
