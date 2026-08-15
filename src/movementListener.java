import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class movementListener implements KeyListener {
    private player player;
    public movementListener(player player) {
        this.player = player;

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        this.player.moveLeft();

        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.player.moveRight();

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
