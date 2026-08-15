import javax.swing.*;

public class skins extends JPanel {
    public static final int BUTTONS_SPACE = 125;
    public static final int BUTTONS_WIDTH = 100;
    public static final int BUTTONS_HEIGHT = 50;
    public skins(int width, int height, JFrame frame) {
        this.setBounds(0,0,width,height);
        this.setLayout(null);
        JLabel ballSkins = new JLabel("Ball Skins");
        ballSkins.setBounds(0,0,width,height/6);
        ballSkins.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(ballSkins);

        JButton orange = new JButton("ORANGE");
        orange.setBounds(BUTTONS_SPACE,height/6,BUTTONS_WIDTH,BUTTONS_HEIGHT);
        orange.addActionListener(e -> {

        });
        this.add(orange);

        JButton blue = new JButton("BLUE");
        blue.setBounds(BUTTONS_WIDTH + 2*BUTTONS_SPACE,height/6,BUTTONS_WIDTH,BUTTONS_HEIGHT);
        blue.addActionListener(e -> {

        });
        this.add(blue);

        JButton red = new JButton("RED");
        red.setBounds(2*BUTTONS_WIDTH + 3*BUTTONS_SPACE,height/6,BUTTONS_WIDTH,BUTTONS_HEIGHT);
        red.addActionListener(e -> {

        });
        this.add(red);

    }
}
