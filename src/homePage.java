import javax.swing.*;
import java.awt.*;

public class homePage extends JPanel {
    public static final int BUTTON_WIDTH = 300;
    public static final int BUTTON_HEIGHT = 100;
    JFrame frame;
    public homePage(int width, int height, JFrame frame) {
        this.setBounds(0,0,width,height);
        this.setBackground(Color.gray);
        this.setLayout(null);
        this.frame = frame;

        JLabel welcome = new JLabel("WELCOME TO THE GAME");
        welcome.setBounds(0, 0, width, height/3);
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setFont(new Font("Times New Roman",Font.BOLD,25));
        this.add(welcome);

        JButton instractionsButton = new JButton("INSTRACTIONS");
        instractionsButton.setBounds(width/2 - BUTTON_WIDTH/2,height - 4 * BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        instractionsButton.addActionListener( e -> {
            pagesManager.switchBetweenPages(new instractionsScene(width, height,frame), frame);
        });
        this.add(instractionsButton);

        JButton gameButton = new JButton("TO THE GAME");
        gameButton.setBounds(width/2 - BUTTON_WIDTH/2,height - 3 * BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        gameButton.addActionListener( e -> {
            pagesManager.switchBetweenPages(new gameScene(0, 0, width,height, frame), frame);
        });
        this.add(gameButton);

        JButton skinsButton = new JButton("SKINS");
        skinsButton.setBounds(width/2 - BUTTON_WIDTH/2, height - 2*BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        skinsButton.addActionListener( e -> {
            pagesManager.switchBetweenPages(new skins(width, height, frame), frame);
        });
        this.add(skinsButton);
    }





}
