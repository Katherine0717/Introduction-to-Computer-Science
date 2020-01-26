import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 extends Q1 {
    int r = 100;
    double theta = 0.0;
    int size = 8;
    int startX = 150, startY = 150;


    public void paintComponent(Graphics g){
        g.setColor(Color.gray);
        g.drawOval(200 - r + size/2,150-r/2 + size/2, 2*r, 2*r);
        g.setColor(Color.pink);
        g.fillRect(startX,startY,size,size);

    }

    Timer timer;

    public Q3(){
        timer = new Timer(100, new TimeAnimation());
        timer.start();
    }

    class TimeAnimation implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(theta < 2 * Math.PI) {
                startX = (int)(r * Math.cos(theta) + 200);
                startY = (int)(r * Math.sin(theta) + 200);
                theta += 0.2;
            }else{

            }

            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Homework 10");
        frame.setSize(600,600);
        Q3 canvas = new Q3();
        frame.add(canvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
