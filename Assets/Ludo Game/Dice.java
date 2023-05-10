import java.util.*;

public class Dice {
    final int value;

    static Random rd = new Random();

    public Dice() {

    }

    public void drawDice() {

    }

    public int getValue() {
        value = rd.nextInt(6) + 1;
        return value;
    }
}