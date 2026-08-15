import java.awt.*;
import java.awt.event.KeyAdapter;
import javax.swing.*;

public class player {
    private int x;
    private int y;
    public static final int width = 50;
    public static final int height = 20;

    public player(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public void moveRight() {
        this.x++;
        System.out.println("the players x is: " + this.x);
    }
    public void moveLeft() {

        this.x--;
    }
    public int getX() {
        return x;

    }
    public void draw(Graphics graphics) {
        graphics.fillRect(this.x,this.y,width,height);
    }
}
