import java.awt.Color;
import java.awt.Graphics;

public class LudoBoard extends Jframe {
    public Board() {
        addBoard();
    }

    public void addBoard(Graphics g) {
        int x = 600;
        int y = 300;
        // outline 1
        g.setColor(Color.white);
        g.drawRect(x, y, x + 1900, y + 1900);

        // outline 2
        g.drawRect(x + 100, y + 100, x + 1800, y + 1800);

        // y-axis lines for boxes
        g.drawLine(1400, 1000, 1400, 1300);
        g.drawLine(1500, 1000, 1500, 1300);

        // x-axis lines for boxes
        g.drawLine(1300, 1000, 1600, 1000); // bottom line 1
        g.drawLine(700, 1100, 2200, 1100); // bottom line 2

        g.drawLine(1300, 1300, 1600, 1300); // top line 1
        g.drawLine(700, 1200, 2200, 1200); // top line 2

        // box1
        x = 700;
        y = 400;
        g.setColor(Color.RED);
        g.drawRect(x, y, x + 600, y + 600);

        // box 2
        y = 1300;
        g.setColor(Color.BLUE);
        g.drawRect(x, y, x + 600, y + 600);

        // box 3
        x = 1600;
        g.setColor(Color.YELLOW);
        g.drawRect(x, y, x + 600, y + 600);

        // box 4
        y = 400;
        g.setColor(Color.GREEN);
        g.drawRect(x, y, x + 600, y + 600);
    }
}