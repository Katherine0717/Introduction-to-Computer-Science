import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Control extends JFrame implements ActionListener,ItemListener, ChangeListener {
    protected JLabel speedLabel,angleLabel,timeLabel,shapeLabel,colorLabel,delayLable;
    protected JSlider speed, angle, time;
    protected JButton startButton, repaintButton;
    protected JTextField timeDelay;
    protected double speednum,anglenum,timenum;
    protected int delaynum;
    String[] stylechoose = {"", "Star", "Dot", "Sun", "Cat", "Pig"};
    String[] colorchoose = {"", "Blue", "Red", "Pink", "Cyan", "Gray", "Random"};
    //create a JComboBox for choosing a style and color
    JComboBox styleList = new JComboBox(stylechoose);
    JComboBox colorlist = new JComboBox(colorchoose);
    String color = "";
    String style = "";
    Random random=new Random();

    public Control() {
        setLayout(new FlowLayout());
        setTitle("Firework");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add a speed label
        speedLabel=new JLabel("Please choose a speed: ");
        add(speedLabel);

        //add a speed slider
        speed = new JSlider(0, 250);
        speed.addChangeListener(this);
        add(speed);
        //add  an angle label
        angleLabel = new JLabel("Please choose an angle: ");
        add(angleLabel);

        //add an angle slider
        angle = new JSlider(0, 90);
        angle.addChangeListener(this);
        add(angle);
        //add a time label
        timeLabel = new JLabel("Please choose a time: ");
        add(timeLabel);

        //add a time slider
        time = new JSlider(0, 5);
        time.addChangeListener(this);
        add(time);
        //add a time delay label
        delayLable = new JLabel("Please enter time delay(second): ");
        add(delayLable);
        timeDelay = new JTextField(5);
        add(timeDelay);

        shapeLabel=new JLabel("Please choose a shape: ");
        add(shapeLabel);
        add(styleList);
        colorLabel=new JLabel("Please choose a color: ");
        add(colorLabel);
        add(colorlist);
        startButton=new JButton("Start");
        startButton.addActionListener(this);
        add(startButton);
        repaintButton=new JButton("Repaint");
        repaintButton.addActionListener(this);
        add(repaintButton);
        styleList.setSelectedIndex(0);
        styleList.addItemListener(this);
        colorlist.setSelectedIndex(0);
        colorlist.addItemListener(this);

    }

    //change the value when user change the slider
    public void stateChanged(ChangeEvent e) {
        Object s = e.getSource();
        if(s.equals(speed)){
            speedLabel.setText("Please choose a speed:" + speed.getValue());
        }else if(s.equals(angle)){
            angleLabel.setText("Please choose an angle: " + angle.getValue());
        }else if(s.equals(time)){
            timeLabel.setText("Please choose an time: " + time.getValue());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Control control=new Control();
        control.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if(src==repaintButton){
            repaint();
        }
        setLayout(new FlowLayout());
        Graphics g=getGraphics();
        //give value for each parameter
        speednum = speed.getValue();
        anglenum = angle.getValue();
        timenum = time.getValue();
        delaynum = Integer.parseInt(timeDelay.getText());
        //detect the source
        if(src == startButton) {
            trajectory(g, delaynum);
            if (style.equals("Concentric circle")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawCircle(g);
            } else if (style.equals("Star")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawStar(g);
            } else if (style.equals("Dot")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawDot(g);

            } else if (style.equals("Sun")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawSun(g);
            } else if (style.equals("Line")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawLine(g);
            } else if (style.equals("Cat")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawCat(g);
            } else if (style.equals("Pig")) {
                if (color.equals("Random")) {
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                } else if (color.equals("Blue")) {
                    g.setColor(Color.blue);
                } else if (color.equals("Red")) {
                    g.setColor(Color.red);
                } else if (color.equals("Pink")) {
                    g.setColor(Color.pink);
                } else if (color.equals("Cyan")) {
                    g.setColor(Color.cyan);
                } else if (color.equals("Gray")) {
                    g.setColor(Color.GRAY);
                }
                drawPig(g);
            }
        }
    }

    //method of drawing the trajectory
    public void trajectory(Graphics g, int delaynum){
        for (double i = 0; i <= timenum - 0.1 ; i += 0.1) {
            int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * i);
            int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * i - (0.5 * (9.8)) * i * i));
            g.fillOval(x, y, 3, 3);
        }
        try {
            TimeUnit.SECONDS.sleep(delaynum);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void drawCircle(Graphics g) {
        int radius=0;
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        for(int i=0;i<=30;i++) {
            radius+=5;
            g.drawOval(x-radius, y-radius, radius*2,radius*2);
        }
    }
    public void drawStar(Graphics g) {
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        int z = 100;
        g.drawLine(x, y - z, x - (int)Math.sqrt(3)*z/2 - 25, y + z/2);
        g.drawLine(x, y - z, x + (int)Math.sqrt(3)*z/2 + 25, y + z/2);
        g.drawLine(x - (int)Math.sqrt(3)*z/2 - 25, y + z/2, x + (int)Math.sqrt(3)*z/2 + 25, y + z/2);
        g.drawLine(x, y + z, x - (int)Math.sqrt(3)*z/2 - 25, y - z/2);
        g.drawLine(x, y + z, x + (int)Math.sqrt(3)*z/2 + 25, y - z/2);
        g.drawLine(x - (int)Math.sqrt(3)*z/2 - 25, y - z/2, x + (int)Math.sqrt(3)*z/2 + 25, y - z/2);
    }

    public void drawDot(Graphics g) {
        Random r=new Random();
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        for (int i = 0; i <= 30; i++) {
            int pointX = r.nextInt(100) + (x - 50);
            int pointY = r.nextInt(100) + (y - 50);
            g.fillOval(pointX, pointY, 5, 5);
        }
    }
    public void drawLine(Graphics g) {
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        for (int i = 0; i <= 100; i++) {
            g.drawLine(x, y, (int) (x + 100 * Math.cos(i+5)), (int) (y + 100 * Math.sin(i+5)));
        }
    }
    public void drawSun(Graphics g) {
        int radius=0;
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        for (int i = 0; i <= 100; i++) {
            g.drawLine(x, y, (int) (x + 150 * Math.cos(i+5)), (int) (y + 150 * Math.sin(i+5)));
        }
        for(int i=0;i<=30;i++) {
            radius+=5;
            g.drawOval(x-radius, y-radius, radius*2,radius*2);
        }
    }

    public void drawCat(Graphics g){
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        int face = 150;
        int ear = 30;
        g.drawOval(x - face/2, y - face/2, face, face);
        g.fillOval(x - 55, y - 15, 15, 25);
        g.fillOval(x + 40, y - 15, 15, 25);
        g.drawOval(x - face/2, y - face/2 - 15, ear, ear + 10);
        g.drawOval(x + face/2 - ear, y - face/2 - 15, ear, ear + 10);
        g.drawLine(x - 30, y + 20, x + 30, y + 20);
        g.drawLine(x - 30, y + 20, x, y + 45);
        g.drawLine(x + 30, y + 20, x, y + 45);

    }

    public void drawPig(Graphics g){
        int x = (int) ((speednum) * (Math.cos(Math.toRadians(anglenum))) * timenum);
        int y = (int) (getHeight() - ((speednum * (Math.sin(Math.toRadians(anglenum)))) * timenum - (0.5 * (9.8)) * timenum * timenum));
        int face = 160;
        int ear = 30;
        g.drawOval(x - face/2, y - face/2, face , face - 40);
        g.fillOval(x - 55, y - 25, 15, 15);
        g.fillOval(x + 40, y - 25, 15, 15);
        g.drawArc(x - face/2, y - face/2 - 5, ear, ear + 10, 0, 180);
        g.drawLine(x - face/2, y - face/2 - 5 + (ear + 10)/2, x - face/2 + ear, y - face/2 - 5 + (ear + 10)/2);
        g.drawArc(x + face/2 - ear, y - face/2 - 5, ear, ear + 10, 0, 180);
        g.drawLine(x + face/2 - ear, y - face/2 - 5 + (ear + 10)/2, x + face/2, y - face/2 - 5 + (ear + 10)/2);
        g.drawOval(x - 25,  y - 30 , 50, 40);
        g.drawOval(x - 15, y - 20, 10, 20);
        g.drawOval(x + 8, y - 20, 10, 20);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(colorlist)) {
            color=(String)colorlist.getSelectedItem();
        }
        else if(e.getSource().equals(styleList)) {
            style=(String)styleList.getSelectedItem();
        }

    }
}

