import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class LudoDice implements KeyListener {
    final int value;

    static Random rd = new Random();

    public Dice() {

    }

    public void drawDice() {
        System.out.println("XXXXXXXXXXXXX");
        System.out.println("X           X");
        System.out.println("X           X");
        System.out.println("X    " + value + "     X");
        System.out.println("X           X");
        System.out.println("X           X");
        System.out.println("XXXXXXXXXXXXX");
    }

    public int getValue() {
        value = rd.nextInt(6) + 1;
        return value;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            getValue();
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}