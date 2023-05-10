import java.awt.Color;
import java.awt.Graphics;

public class Board extends Pieces {
    public Board() {

    }

    public void addBoard(Graphics g) {
        int x = 600;
        int y = 300;
        //outline 1
        g.setColor(Color.white);
        g.drawRect(x, y, x + 1900, y + 1900);

        //outline 2
        g.drawRect(x + 100, y + 100, x + 1800, y + 1800);

        //box1
        x = 700;
        y = 400;
        g.setColor(Color.red);
        g.drawRect(x, y, x + 600, y + 600);

        //box 2
        y = 1300;
        g.setColor(Color.blue);
        g.drawRect(x, y, x + 600, y + 600);

        //box 3
        
}