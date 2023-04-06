package pen;

public class Pencil extends WritingTool {


    public Pencil(double inkLossPerChar, boolean canErase) {
        super(inkLossPerChar, canErase);
    }

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        return inkLossPerChar;
    }

}
