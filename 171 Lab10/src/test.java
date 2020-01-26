import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame{
    private JPanel input;
//    private JLabel originLabel;
//    private JLabel destinationLabel;
//    private JLabel distanceLabel;
    private JButton findPath;
    private JTextField origin;
    private JTextField destination;
    private String ending;
    private String starting;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        test t=new test();

    }

    public test() {
        setTitle("Map");
        setSize(1000,1000);
        setVisible(true);

        //Initialize all the components:
        JLabel originLabel = new JLabel("Enter your origin:");
        add(originLabel);
        origin = new JTextField(5);
        add(origin);
        JLabel destinationLabel = new JLabel("Enter your destination:");
        add(destinationLabel);
        destination = new JTextField(5);
        add(destination);
        JLabel distanceLabel = new JLabel("Distance: N/A");
        add(distanceLabel);
//        findPath = new JButton("Find Path");
//        findPath.addActionListener(this);
//        frame.add(findPath);
//        input = new JPanel();
//        //add(input);
//        setLayout(new FlowLayout());

//        input.add(originLabel);
//        input.add(destinationLabel);
//        input.add(distanceLabel);
//        input.add(origin);
//        input.add(destination);
//        input.add(findPath);
//        frame.add(input);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}