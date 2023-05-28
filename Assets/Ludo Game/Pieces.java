import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Pieces extends Dice implements MouseListener {

    static Board b = new Board();

    private String pieceColor;
    private boolean notUnAlive;

    public Pieces() {

    }

    public Pieces(String str) {
        pieceColor = str;
    }

    public void addPieces(Graphics g) {
        g.drawOval();
    }

    public int movePieces(int x, int y) {

    }

    public int Increment() {
        Dice d = new Dice();
        return d.getValue();
    }

    public int xCoor() {

    }

    public int yCoor() {

    }

    public boolean deSpawn(Object one, Object two) {
        if (one.xCoor() == two.xCoor() && one.yCoor() == two.yCoor()) {

        }
    }

    public int[] mouseClicked(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}