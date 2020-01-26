import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Q4_2 extends JPanel{
    int lines;

    public int getRandom(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    public void paintComponent(Graphics g){
        for(int i = 0; i < lines; i++) {
            int x1 = getRandom(600);
            int y1 = getRandom(600);
            int x2 = getRandom(600);
            int y2 = getRandom(600);
            g.drawLine(x1,y1,x2, y2);
        }

    }

    Timer timer;

    public Q4_2(){
        JPanel panel = new JPanel();
        add(panel);
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Enter number of lines");
        add(label);
        JTextField text = new JTextField(10);
        add(text);
        panel.add(text);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lines = Integer.parseInt(text.getText());
            }
        });

        timer = new Timer(5000, new TimeAnimation());
        timer.start();
    }
    class TimeAnimation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Homework 10");
        frame.setSize(600,600);
        Q4_2 canvas = new Q4_2();
        frame.add(canvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

