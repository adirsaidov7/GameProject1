import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gameScene extends JPanel {
   private player player;
   private int score;
   private ball ball;
   private boolean gameOver;
    public gameScene(int x,int y,int width,int height,JFrame frame) {
        setBounds(x,y,width,height);
        this.ball = new ball(400,100);
        this.player = new player(400,520);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new movementListener(this.player));
       this.mainGameLoop();


    }
    public void mainGameLoop() {
        new Thread(()->{
           while(true){
               ball.moveBall();
              this.repaint();

                  if(checkCollision(ball,player)&& ball.getVy() > 0){
                      ball.setVy(-ball.getVy());
                  }
                  if(ball.getVy() + 30 < 0){
                      this.gameOver = true;
                  }



              try {
                   Thread.sleep(16);
               } catch (InterruptedException e) {}

          }
       }).start();
    }


    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.player.draw(graphics);
        this.ball.draw(graphics);

    }
    public boolean checkCollision(ball ball,player player) {
        Rectangle playerRectangle = new Rectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight());
    Rectangle ballRectangle = new Rectangle(ball.getX(), ball.getY(), ball.getSize(), ball.getSize());
    if(playerRectangle.intersects(ballRectangle))
         return true;
     else
         return false;
}
}