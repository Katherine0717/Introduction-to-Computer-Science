import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
/**
 * Ningyuan Xiong
 * nxiong
 * HW8
 * MW 2:00-3:15
 * I did not collaborate with anyone on this assignment.
 *
 */
public class canvas4 extends JComponent implements MouseListener, MouseMotionListener {

    private int FCX;
    private int FCY;
    private int LCX;
    private int LCY;
    private int x;
    private int y;

    //constructor
    public canvas4() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        Graphics g = getGraphics();
        g.fillOval(x, y, 15, 15);
        FCX=e.getX();
        FCY=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        LCX=e.getX();
        LCY=e.getY();
        repaint();

    }
    public void paintComponent(Graphics g)
    {
        g.drawLine(FCX,FCY,LCX,LCY);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setTitle("canvas4");
        canvas4 c=new canvas4();
        frame.add(c);
        frame.setVisible(true);

    }

}
