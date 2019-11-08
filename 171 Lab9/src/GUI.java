import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JLabel label;
    JButton button1, button2;
    int counter1 = 0;
    int counter2 = 0;

    public GUI(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Click a button");
        add(label);

        button1 = new JButton("ON");
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("OFF");
        button2.addActionListener(this);
        add(button2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if(click.equals(button1)){
            counter1++;
            label.setText("ON button is clicked "+counter1+" times");
        }else if(click.equals(button2)){
            counter2++;
            label.setText("OFF button is clicked "+counter2+" times");
        }
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
