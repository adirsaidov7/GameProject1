import javax.swing.*;
import java.awt.*;

public class instractionsScene extends JPanel{
    public instractionsScene(int width,int height,JFrame frame) {
        this.setBounds(0, 0,width , height);

        JLabel instractionstTitel = new JLabel("Instractions");
        this.setLayout(null);
        instractionstTitel.setBounds(0,0,width,100);
        instractionstTitel.setFont(new Font("Times New Roman",Font.BOLD,70));
        instractionstTitel.setHorizontalAlignment(JLabel.CENTER);
        this.add(instractionstTitel);

        JLabel instractionsText = new JLabel("In this Game");
        instractionsText.setBounds(0,0,width,500);
        instractionsText.setFont(new Font("Times New Roman",Font.PLAIN,50));
        this.add(instractionsText);

        JButton gameButton = new JButton("TO THE GAME");
        gameButton.setBounds(width/2 - homePage.BUTTON_WIDTH/2,height-homePage.BUTTON_HEIGHT,homePage.BUTTON_WIDTH,homePage.BUTTON_HEIGHT);
      gameButton.addActionListener( e -> {
           pagesManager.switchBetweenPages(new gameScene(0,0,width,height,frame), frame);
        });
        this.add(gameButton);





    }
}