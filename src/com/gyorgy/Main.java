package com.gyorgy;

import pen.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        WritingTool[] writingTools = new WritingTool[10];
        PenFactory.getINSTANCE().createRandomToolsArray(writingTools);
        writeText(writingTools);
        printSortedArray();
    }

    private void printSortedArray() {
    }

    private void writeText(WritingTool[] writingTools) {
        for (WritingTool w : writingTools) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                char[] text = createRandomTextArray();
                System.out.printf("%s%n", Arrays.toString(text));
                for (char c : text) {
                    sb.append(c);
                    w.write(sb);
                }
                if (w.canErase) {
                    w.erase(sb);
                }
            }
            System.out.println(sb);
            System.out.printf("%s inkLevel= %.2f%%%n", w.getClass().getSimpleName(), w.inkLevel);
        }
    }

    private char[] createRandomTextArray() {
        Random random = new Random();
        char[] array = new char[random.nextInt(3) + 3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) random.nextInt(65, 90);
        }
        return array;
    }

}
