import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.*;
public class ball {
    int x;
    int y;

    public static final int size = 30;

    double angle;
    double speed;
    double vx;
    double vy;


    public ball(int x, int y) {
        this.x = x;
        this.y = y;

//        Random rand = new Random();

        this.angle = 300;
        this.speed = 3;

        double radians = Math.toRadians(angle);

        this.vx = speed * Math.cos(radians);
        this.vy = speed * Math.sin(radians);
    }


    public void draw(Graphics graphics) {
        graphics.setColor(gameScene.ballColor);
        graphics.fillOval(x, y, size, size);
    }

    public void moveBall() {
        x += vx;
        y += vy;


        if (y <= 0 )
            vy = -vy;
        if (x <= 0 || x + size >= 790 )
                vx = -vx;
        if (vx==0)
            vx = -2;

    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public int getSize(){
        return size;
    }
    public void setVy(double vy) {
        this.vy = vy;
    }
    public double getVy(){
        return vy;
    }
}

