public class Board extends Pieces {
    public Board() {

    }

    public void addBoard() {
        Image board = Toolkit.getDefaultToolkit().getImage("");
        g.drawImage(board, 300, 300, this);
        g.finalize();
    }
}