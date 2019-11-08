import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Q5 extends JComponent implements MouseListener, MouseMotionListener, KeyListener {

    String key = "";
    int code;

    public Q5() {
        super();
        addMouseListener(this); //problem 1
        addMouseMotionListener(this); //problem 2
        addKeyListener(this); //problem 5
        setFocusable(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //problem 2
        System.out.println("canvas.mouseClicked");
        System.out.println("canvas width=" + getWidth() + ", height=" + getHeight());
        Graphics g = getGraphics();

        // problem 6
        if (code == KeyEvent.VK_Y) {
            g.setColor(Color.yellow);
        } else if (code == KeyEvent.VK_1) {
            g.setColor(Color.BLUE);
        } else if (code == KeyEvent.VK_2) {
            g.setColor(Color.GREEN);
        } else if (code == KeyEvent.VK_3) {
            g.setColor(Color.orange);
        } else if (code == KeyEvent.VK_4) {
            g.setColor(Color.gray);
        } else if (code == KeyEvent.VK_5) {
            g.setColor(Color.pink);
        } else {

        }
        int x = e.getX();
        int y = e.getY();
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("canvas.mousePressed");

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
        // problem 3
        System.out.println("canvas.mouseDragged");
        Graphics g = getGraphics();

        // problem 6
        if (code == KeyEvent.VK_Y) {
            g.setColor(Color.yellow);
        } else if (code == KeyEvent.VK_1) {
            g.setColor(Color.BLUE);
        } else if (code == KeyEvent.VK_2) {
            g.setColor(Color.GREEN);
        } else if (code == KeyEvent.VK_3) {
            g.setColor(Color.orange);
        } else if (code == KeyEvent.VK_4) {
            g.setColor(Color.gray);
        } else if (code == KeyEvent.VK_5) {
            g.setColor(Color.pink);
        } else {

        }
        int x = e.getX();
        int y = e.getY();
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("canvas.mouseMoved");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Canvas.keyPressed: " + e.getKeyCode());

        // problem 5
        code = e.getKeyCode();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Canvas.keyReleased: " + e.getKeyCode());

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Canvas.keyTyped: " + e.getKeyChar());

        //problem 5
        char input = e.getKeyChar();
        key = key + input;
        Graphics g = getGraphics();
        g.drawString(key, 100,100);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        canvas c = new canvas();
        jf.setVisible(true);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setTitle("Lab 8");
        jf.add(c);
    }

}