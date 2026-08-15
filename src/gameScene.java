import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gameScene extends JPanel {
    private int width;
    private int height;
    JFrame frame;
    private JButton pauseButton;
   private player player;
   private int score;
   private ball ball;
   public static Color ballColor = Color.RED;

    private boolean gameOver = false;
   private boolean paused = false;
    public gameScene(int x,int y,int width,int height,JFrame frame) {
        this.width = width;
        this.height = height;
        this.frame = frame;
        setBounds(x,y,width,height);
        this.ball = new ball(400,100);
        this.player = new player(400,520);
        this.setFocusable(true);
        SwingUtilities.invokeLater(() -> requestFocusInWindow());
        this.addKeyListener(new movementListener(this.player));
        this.mainGameLoop();

        pauseButton = new JButton("PAUSE");
        pauseButton.setBounds(0,0, 100, 50);
        pauseButton.addActionListener( e -> {
            //this.remove(pauseButton);
            pauseButton.setVisible(false);

            paused = true;

            JButton exitButton = new JButton("EXIT");
            exitButton.setBounds(0,50, 100, 50);
            exitButton.addActionListener(e2 ->{
                pagesManager.switchBetweenPages(new homePage(width, height, frame), frame);
            });

            JButton resumeButton = new JButton("RESUME");
            resumeButton.setBounds(0,0, 100, 50);
            resumeButton.addActionListener(e1 ->{
                this.remove(resumeButton);
                this.remove(exitButton);
                pauseButton.setVisible(true);

                paused = false;

                this.requestFocusInWindow();


            });

            this.add(resumeButton);
            this.add(exitButton);
        });
        this.add(pauseButton);
    }

    public void showGameOverButtons(int width, int height, JFrame frame) {
        pauseButton.setVisible(false);

        JButton restartButton = new JButton("RESTART");
        restartButton.setBounds(width / 2 - 75, height / 2 + 50, 150, 50);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(width / 2 - 75, height / 2 + 110, 150, 50);

        restartButton.addActionListener(e -> {
            pagesManager.switchBetweenPages(
                    new gameScene(0, 0, width, height, frame), frame);
        });

        exitButton.addActionListener(e -> {
            pagesManager.switchBetweenPages(
                    new homePage(width, height, frame),
                    frame
            );
        });

        this.add(restartButton);
        this.add(exitButton);

       this.revalidate();
       this.repaint();
    }


    public void mainGameLoop() {
        new Thread(()->{
           while(true){
               if(!paused) {
                   ball.moveBall();
                   this.repaint();

                   if (checkCollision(ball, player) && ball.getVy() > 0) {
                       ball.setVy(-ball.getVy());
                       this.score++;
                   }
                   if (ball.getY() + ball.getSize() > height) {
                       this.gameOver = true;
                       this.repaint();
                       showGameOverButtons(width, height, frame);
                       break;
                   }
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
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Arial", Font.BOLD, 30));
        graphics.drawString("Score: " + score, getWidth()-250, 40);
        if(gameOver){
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("Arial", Font.BOLD, 70));
            graphics.drawString("GAME OVER", getWidth()/2-100, getHeight()/2);
        }

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