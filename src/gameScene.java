import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

public class gameScene extends JPanel {
   private player player;
   private boolean paused = false;
    public gameScene(int x,int y,int width,int height, JFrame frame) {
        this.setBounds(0,0,width,height);
        this.player = new player(400,520);
        this.setFocusable(true);
       // this.requestFocus();
        this.addKeyListener(new movementListener(this.player));
        SwingUtilities.invokeLater(() -> requestFocusInWindow());
        this.mainGameLoop();



        JButton pauseButton = new JButton("PAUSE");
        pauseButton.setBounds(0,0, 100, 50);
        pauseButton.addActionListener( e -> {
           this.remove(pauseButton);

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
                this.add(pauseButton);

                paused = false;
            });

            this.add(resumeButton);
            this.add(exitButton);
        });
        this.add(pauseButton);
    }
    public void mainGameLoop() {
        new Thread(()->{
           while(true){

               System.out.println(this.player.getX());
               this.repaint();
//               try {
//                   Thread.sleep(16);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }

          }
       }).start();
    }


    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.player.draw(graphics);
    }
}