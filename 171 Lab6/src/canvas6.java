import java.awt.Color;
/**
 * Ningyuan Xiong
 * nxiong
 * HW8
 * MW 2:00-3:15
 * I did not collaborate with anyone on this assignment.
 *
 */
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class canvas6 extends JComponent implements KeyListener,MouseListener,MouseMotionListener {
    Color color;
    int x,y;
    char[] s;

    public canvas6() {
        super();
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setTitle("Canvas6");
        canvas6 canvas6=new canvas6();
        frame.add(canvas6);
        frame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int a=e.getKeyCode();
        if(a == KeyEvent.VK_0){
            color = Color.MAGENTA;
        }
        else if (a == KeyEvent.VK_1){
            color = Color.orange;
        }
        else if (a == KeyEvent.VK_2){
            color = Color.yellow;
        }
        else if (a == KeyEvent.VK_3){
            color = Color.green;
        }
        else if (a == KeyEvent.VK_4){
            color = Color.red;
        }
        else if (a == KeyEvent.VK_5){
            color = Color.blue;
        }
        else if (a == KeyEvent.VK_6){
            color = Color.lightGray;
        }
        else if (a == KeyEvent.VK_7){
            color = Color.PINK;
        }
        else if (a == KeyEvent.VK_8){
            color = Color.black;
        }
        else if (a == KeyEvent.VK_9){
            color = Color.GRAY;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
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
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        int x = e.getX();
        int y = e.getY();
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x, y, 10, 10);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
