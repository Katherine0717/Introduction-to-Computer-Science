import java.awt.Graphics;
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
public class canvas extends JComponent implements MouseListener, MouseMotionListener{
    public canvas() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Graphics g = getGraphics();
        g.fillOval(x, y, 50, 50);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("CanvasListener.mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("CanvasListener.mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("CanvasListener.mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("CanvasListener.mouseExited");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        //System.out.println("CanvasWithMouseMotionListener.mouseMoved");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("CanvasWithMouseMotionListener.mouseDragged");
        int x = e.getX();
        int y = e.getY();
        Graphics g = getGraphics();
        g.fillOval(x, y, 10, 10);
    }

    public static void main (String args[]) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setTitle("canvas");
        canvas c=new canvas();
        frame.add(c);
        frame.setVisible(true);

    }


}
