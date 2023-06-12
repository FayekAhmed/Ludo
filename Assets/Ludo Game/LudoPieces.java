public class LudoPieces extends LudoDice {
    static LudoDice d = new LudoDice();
    static LudoBoard b = new LudoBoard();

    private String pieceColor;
    private int value;

    public LudoPieces() {
        value = Position();
    }

    public boolean Precondition() {
        if (d.getValue() == 1)
            return true;
        else
            return false;
    }

    public LudoPieces(String str) {
        pieceColor = str;
    }

    public int Increment() {
        LudoDice d = new LudoDice();
        return d.getValue();
    }

    public int Position() {
        int result = Increment() + Increment();
        return result;
    }

}