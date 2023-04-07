package pen;

public class Pencil extends WritingTool {


    public Pencil(double inkLossPerChar) {
        super(inkLossPerChar);
    }

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        return inkLossPerChar;
    }

}
