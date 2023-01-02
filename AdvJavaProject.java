import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvJavaProject extends Applet {
    static int x, y;

    public void paint(Graphics g, int dir) {

            try{
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, 700, 700);
                g.setColor(Color.BLACK);

            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (dir){
                case 1:
                    y=y-5;
                    drawFace(x, y, g);
                    break;
                case 2:
                    x=x+5;
                    drawFace(x, y, g);
                    break;
                case 3:
                    y=y+5;
                    drawFace(x, y, g);
                    break;
                case 4:
                    x=x-5;
                    drawFace(x, y, g);
                    break;
            }



//        }

    }

    private void drawFace(int a, int b, Graphics g) {
        g.drawOval(a-50, b-50, 100, 100);
        g.drawOval(a-30, b-35, 20, 20);
        g.drawOval(a+10, b-35, 20, 20);
        g.fillOval(a-18, b+10, 36, 30);
    }


    @Override
    public void init() {
        x=350;
        y=350;

        Button btnUp = new Button("UP");
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), 1);
            }
        });
        Button btnDown = new Button("DOWN");
        btnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), 3);
            }
        });
        Button btnLeft = new Button("LEFT");
        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), 4);
            }
        });
        Button btnRight = new Button("RIGHT");
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics(), 2);
            }
        });
        add(btnUp);
        add(btnDown);
        add(btnLeft);
        add(btnRight);

    }

    @Override
    public void paint(Graphics g) {
        drawFace(x, y, g);
    }
}
