import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends JComponent {
    int startX = 0, startY = 0;
    int size = 25;
    int speed = 5;

    public void paintComponent(Graphics g){
        g.setColor(Color.pink);
        g.fillRect(startX,startY,size,size);

    }

    Timer timer;

    public Q1(){
        timer = new Timer(100, new TimeAnimation());
        timer.start();
    }

    class TimeAnimation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            startX += speed;
            startY += speed;
            if(startX > getHeight()-size || startY > getWidth()-size){
                startX = 0;
                startY = 0;
            }

            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Homework 10");
        frame.setSize(600,600);
        Q1 canvas = new Q1();
        frame.add(canvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
