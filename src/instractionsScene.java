import javax.swing.*;
import java.awt.*;

public class instractionsScene extends JPanel{
  public instractionsScene(int width,int height, JFrame frame) {
      this.setBounds(0, 0,width , height);

      JLabel instractionstTitel = new JLabel("Instructions");
      this.setLayout(null);

      instractionstTitel.setBounds(0, 0, width, 100);
      instractionstTitel.setFont(new Font("Times New Roman", Font.BOLD, 70));
      instractionstTitel.setHorizontalAlignment(JLabel.CENTER);
      this.add(instractionstTitel);

      JLabel instractionsText = new JLabel("How To Play");
      instractionsText.setBounds(0, 100, width, 30);
      instractionsText.setFont(new Font("Times New Roman", Font.PLAIN, 25));
      this.add(instractionsText);

      JLabel line1 = new JLabel("Use the arrow keys to move the paddle.");
      line1.setBounds(0, 140, width, 25);

      JLabel line2 = new JLabel("Hit the ball with the paddle to keep it in play.");
      line2.setBounds(0, 170, width, 25);

      JLabel line3 = new JLabel("Try not to let the ball pass your paddle.");
      line3.setBounds(0, 200, width, 25);

      JLabel line4 = new JLabel("The game ends when you miss the ball.");
      line4.setBounds(0, 230, width, 25);

      JLabel line5 = new JLabel("Good luck and have fun!");
      line5.setBounds(0, 260, width, 25);

      this.add(line1);
      this.add(line2);
      this.add(line3);
      this.add(line4);
      this.add(line5);

      JButton gameButton = new JButton("TO THE GAME");
      gameButton.setBounds(width/2 - homePage.BUTTON_WIDTH/2,height-homePage.BUTTON_HEIGHT,homePage.BUTTON_WIDTH,homePage.BUTTON_HEIGHT);
     gameButton.addActionListener( e -> {
           pagesManager.switchBetweenPages(new gameScene(0,0, width, height, frame),frame);
        });
      this.add(gameButton);





  }
}

