import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

// problem 4
public class Q4 extends JComponent implements MouseMotionListener, MouseListener {
    int originalX;
    int originalY;
    int lastX;
    int lastY;


    public Q4() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("canvas.mouseClicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("canvas.mousePressed");
        int x = e.getX();
        int y = e.getY();
        Graphics g = getGraphics();
        g.fillOval(x, y, 20, 20);

        originalX = x;
        originalY = y;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("canvas.mouseReleased");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("canvas.mouseEntered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("canvas.mouseExited");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("canvas.mouseDragged");
        lastX = e.getX();
        lastY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("canvas.mouseMoved");

    }

    public void paintComponent(Graphics g){
        g.drawLine(originalX, originalY, lastX, lastY);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Q4 q = new Q4();
        jf.setVisible(true);
        jf.setSize(500,500);
        jf.setLocation(600,600);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setTitle("Lab 8: problem 4");
        jf.add(q);
    }
}
