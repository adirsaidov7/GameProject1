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
   public void draw(Graphics graphics) {
     graphics.fillRect(this.x,this.y,width,height);
    }
    public void moveRight() {
        this.x+= 10;
    }
    public void moveLeft() {
        this.x-=10;
    }
    public int getX() {
        return x;
    }


    public int getY(){
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
