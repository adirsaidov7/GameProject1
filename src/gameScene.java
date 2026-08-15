import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

public class gameScene extends JPanel {
   private player player;
    public gameScene(int x,int y,int width,int height) {
        setBounds(x,y,width,height);
        this.player = new player(400,520);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new movementListener(this.player));
       this.mainGameLoop();

    }
    public void mainGameLoop() {
        new Thread(()->{
           while(true){
               System.out.println(this.player.getX());
              this.repaint();

          }
       }).start();
    }


    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.player.draw(graphics);

    }
}