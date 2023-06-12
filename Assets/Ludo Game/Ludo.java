public class Ludo {

    static LudoPieces p1 = new LudoPieces("Red");
    static LudoBoard lb1 = new LudoBoard();

    static LudoPieces p2 = new LudoPieces("Red");
    static LudoBoard lb2 = new LudoBoard();

    static LudoPieces p3 = new LudoPieces("Red");
    static LudoBoard lb3 = new LudoBoard();

    static LudoPieces p4 = new LudoPieces("Red");
    static LudoBoard lb4 = new LudoBoard();

    public static void main(String[] args) {
        BoardWindow window = new BoardWindow();

        if (lb1.gotSnake(p1.Position()) == true) {
            lb1.SnakeMessage();
            lb1.Snakes(p1.Position());
        }

        if (lb2.gotSnake(p2.Position()) == true) {
            lb2.SnakeMessage();
            lb2.Snakes(p2.Position());
        }

        if (lb3.gotSnake(p3.Position()) == true) {
            lb3.SnakeMessage();
            lb3.Snakes(p3.Position());
        }

        if (lb4.gotSnake(p4.Position()) == true) {
            lb4.SnakeMessage();
            lb4.Snakes(p4.Position());
        }

        p1.Position();
        if (p1.Position() == 100)
            System.out.println("Red has won the Game");

        p2.Position();
        if (p2.Position() == 100)
            System.out.println("Red has won the Game");

        p3.Position();
        if (p3.Position() == 100)
            System.out.println("Red has won the Game");

        p4.Position();
        if (p4.Position() == 100)
            System.out.println("Red has won the Game");
    }
}