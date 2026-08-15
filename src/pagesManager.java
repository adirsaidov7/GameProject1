import javax.swing.*;

public class pagesManager {

    public static void switchBetweenPages(JPanel page, JFrame frame) {
        frame.setContentPane(page);
        frame.revalidate();
        frame.repaint();
    }


}
