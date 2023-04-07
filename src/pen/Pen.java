package pen;


class Pen extends WritingTool {

    public Pen(double inkLossPerChar) {
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
