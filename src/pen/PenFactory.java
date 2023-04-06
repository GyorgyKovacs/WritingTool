package pen;

import java.util.Random;

public class PenFactory {
    private PenFactory() {
    }

    private static final PenFactory INSTANCE = new PenFactory();

    public static PenFactory getINSTANCE() {
        return INSTANCE;
    }

    public void createRandomToolsArray(WritingTool[] writingTool) {
        Random random = new Random();
        for (int i = 0; i < writingTool.length; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0 -> writingTool[i] = new Pen(1.15, true);
                case 1 -> writingTool[i] = new Pencil(0.95, true);
                case 2 -> writingTool[i] = new Marker(1, false);
            }
        }
    }
}
