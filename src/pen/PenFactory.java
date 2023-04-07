package pen;

import java.util.Random;

public class PenFactory {
    private PenFactory() {
    }

    private static final PenFactory INSTANCE = new PenFactory();

    public static PenFactory getINSTANCE() {
        return INSTANCE;
    }

    public void createRandomToolsArray(WritingTool[] writingTools) {
        Random random = new Random();
        for (int i = 0; i < writingTools.length; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0 -> writingTools[i] = new Pen(1.15);
                case 1 -> writingTools[i] = new Pencil(0.95);
                case 2 -> writingTools[i] = new Marker(1);
            }
        }
    }
}
