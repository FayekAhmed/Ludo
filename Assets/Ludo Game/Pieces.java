import java.awt.Graphics;

public class LudoPieces extends Dice {
    static LudoDice d = new Dice();
    static LudoBoard b = new Board();

    private String pieceColor;
    private boolean notUnAlive;

    public Pieces()
    {
        
    }

    public Pieces(String str, int x, int y)
    {
        pieceColor = str;
        addPieces(x, y)
    }

    public void addPieces(Graphics g, int x, int y) {
        g.drawOval(x, y, x + 100, y + 100);
    }

    public int movePieces(int xBox, int yBox)
    {
        int change = d.getValue();
        if(x == )
    }

    public int Increment() {
        Dice d = new Dice();
        return d.getValue();
    }

    public int xCoor() {

    }

    public int yCoor() {

    }

    public boolean deSpawn(Object one, Object two)
    {
        if(one.xCoor() == two.xCoor() && one.yCoor() == two.yCoor())
        {
            notUnAlive true;
        }
        return notUnAlive;
    }
}