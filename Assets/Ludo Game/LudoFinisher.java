public class LudoFinisher {

    public String first(LudoPieces one, LudoPieces two, LudoPieces three, LudoPieces four) {
        if (one.Position() > two.Position() && one.Position() > three.Postition() && one.Position() > four.Position())
            return "You placed first";
    }

    public String second(LudoPieces one, LudoPieces two, LudoPieces three) {
        if (one.Position() > two.Position() && one.Position() > three.Postition())
            return "You placed second";
    }

    public String third(LudoPieces one, LudoPieces two) {
        if (one.Position() > two.Position())
            return "You placed thrird";
    }

    public String last() {
        return "You placed Last";
    }
}