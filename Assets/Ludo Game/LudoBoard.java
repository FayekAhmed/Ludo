public class LudoBoard {

    public LudoBoard() {

    }

    public Object[][] intBoard() {
        Object[][] intBoard = { { 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 },
                { 90, 89, 88, 87, 86, 85, 84, 83, 82, 81 },
                { 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 },
                { 70, 69, 68, 67, 66, 65, 64, 63, 62, 61 },
                { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 },
                { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41 },
                { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
                { 30, 29, 28, 27, 26, 25, 24, 23, 22, 21 },
                { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
                { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 } };
        return intBoard;
    }

    public boolean gotSnake(int i) {
        if (i == 17 || i == 54 || i == 62 || i == 64 || i == 87 || i == 92 || i == 93 || i == 95 || i == 99)
            return true;
        else
            return false;
    }

    public int Snakes(int i) {
        if (i == 17)
            i = 8;
        i = 34;
        if (i == 64)
            i = 60;
        if (i == 62)
            i = 19;
        if (i == 87)
            i = 24;
        if (i == 93)
            i = 73;
        if (i == 95)
            i = 72;
        if (i == 99)
            i = 78;
        return i;
    }

    public String SnakeMessage() {
        return "Oops You got eaten by a snake";
    }

    public boolean gotLadder(int i) {
        if (i == 4 || i == 9 || i == 20 || i == 40 || i == 28 || i == 51 || i == 63 || i == 71)
            return true;
        else
            return false;
    }

    public int Ladders(int i) {
        if (i == 4)
            i = 14;
        if (i == 9)
            i = 31;
        if (i == 20)
            i = 38;
        if (i == 40)
            i = 59;
        if (i == 28)
            i = 84;
        if (i == 51)
            i = 67;
        if (i == 63)
            i = 81;
        if (i == 71)
            i = 91;
        return i;
    }

    public String LadderMessage() {
        return "Hooray You climbed a ladder";
    }
}