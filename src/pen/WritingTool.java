package pen;

public abstract class WritingTool {

    public double inkLevel;
    public double inkLossPerChar;

    public WritingTool(double inkLossPerChar) {
        this.inkLevel = 100;
        this.inkLossPerChar = inkLossPerChar;
    }

    public abstract double setInkLossPerChar(StringBuilder sb);

    public void write(StringBuilder sb, char[] chars) {
        for (char c : chars) {
            sb.append(c);
            inkLevel -= setInkLossPerChar(sb);
        }
    }

    public void erase(StringBuilder sb) {
        sb.delete(sb.length() - 1, sb.length());
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "inkLevel=" + inkLevel +
                ", inkLossPerChar=" + inkLossPerChar +
                '}';
    }
}
