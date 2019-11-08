import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
public class canvas5 extends JComponent implements KeyListener,MouseListener {
    char c;
    int x,y;

    public canvas5() {
        super();
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setTitle("Canvas5");
        canvas5 canvas5=new canvas5();
        frame.add(canvas5);
        frame.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        Graphics g=getGraphics();
        x=e.getX();
        y=e.getY();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        c=e.getKeyChar();
        Graphics g=getGraphics();
        x=x+10;
        g.drawString(String.valueOf(c), x, y);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }


}
