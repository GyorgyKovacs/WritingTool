package pen;


class Pen extends WritingTool {

    public Pen(double inkLossPerChar, boolean canErase) {
        super(inkLossPerChar, canErase);
    }

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        return inkLossPerChar;
    }
}
