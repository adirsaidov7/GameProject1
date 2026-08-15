import javax.swing.*;
public class Main {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static void main(String[] args) {
        JFrame game = new JFrame();

        game.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setLayout(null);
        game.add(new gameScene(0,0,WINDOW_WIDTH,WINDOW_HEIGHT));
        game.setVisible(true);
       // game.add(new homePage(WINDOW_WIDTH,WINDOW_HEIGHT));


    }
}