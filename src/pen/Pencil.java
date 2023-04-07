package pen;

public class Pencil extends WritingTool {


    public Pencil(double inkLossPerChar) {
        super(inkLossPerChar);
    }

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        return inkLossPerChar;
    }

    @Override
    public void erase(StringBuilder sb) {
        sb.delete(sb.length() - 1, sb.length());
    }

}
