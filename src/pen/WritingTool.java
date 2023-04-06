package pen;

public abstract class WritingTool {

    public double inkLevel;
    public double inkLossPerChar;
    public boolean canErase;

    public WritingTool(double inkLossPerChar, boolean canErase) {
        this.inkLevel = 100;
        this.inkLossPerChar = inkLossPerChar;
        this.canErase = canErase;
    }

    public void write(StringBuilder sb) {
        inkLossPerChar = setInkLossPerChar(sb);
        inkLevel = inkLevel - inkLossPerChar;
    }

    public void erase(StringBuilder sb) {
        sb.delete(sb.length() - 1, sb.length());
    }

    public abstract double setInkLossPerChar(StringBuilder sb);


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "inkLevel=" + inkLevel +
                ", inkLossPerChar=" + inkLossPerChar +
                '}';
    }
}
