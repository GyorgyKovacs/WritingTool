package pen;

class Marker extends WritingTool {


    public Marker(double inkLossPerChar) {
        super(inkLossPerChar);
    }
    @Override
    public void erase(StringBuilder sb){}

    @Override
    public double setInkLossPerChar(StringBuilder sb) {
        int i = sb.length();
        double midLoss = 1.09;
        double highLoss = 1.21;
        return i <= 20 ? inkLossPerChar : i > 40 ? highLoss : midLoss;
    }

}
