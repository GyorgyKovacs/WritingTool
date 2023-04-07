package pen;


class Pen extends WritingTool {

    public Pen(double inkLossPerChar) {
        super(inkLossPerChar);
    }

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        return inkLossPerChar;
    }
}
