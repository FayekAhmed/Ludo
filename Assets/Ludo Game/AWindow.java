import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AWindow extends JPanel {

    AWindow() {
        this.setPreferredSize(new Dimension(100, 100));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawRect(0, 0, 100, 100); // outer Layer

        for (int i = 0; i <= 10; i++) {
            g2D.drawLine(i, 0, i, 100); // y-axis Lines
            g2D.drawLine(0, i, 100, i); // x-axis lines
        }
    }
}