import javax.swing.*;
import java.awt.*;

public class homePage extends JPanel {
    public static final int BUTTON_WIDTH = 300;
    public static final int BUTTON_HEIGHT = 100;
    public homePage(int width, int height) {
        this.setBounds(0,0,width,height);
        this.setBackground(Color.gray);
        this.setLayout(null);

        JLabel welcome = new JLabel("WELCOME TO THE GAME");
        welcome.setBounds(0, 0, width, height/3);
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setFont(new Font("Times New Roman",Font.BOLD,25));
        this.add(welcome);

        JButton instractionsButton = new JButton("INSTRACTIONS");
        instractionsButton.setBounds(width/2 - BUTTON_WIDTH/2,height/3,BUTTON_WIDTH,BUTTON_HEIGHT);
        instractionsButton.addActionListener(() -> {


        });
        this.add(instractionsButton);

        JButton gameButton = new JButton("TO THE GAME");
        gameButton.setBounds(width/2 - BUTTON_WIDTH/2,height/3 * 2,BUTTON_WIDTH,BUTTON_HEIGHT);
        this.add(gameButton);

    }


}
