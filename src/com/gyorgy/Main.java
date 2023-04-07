package com.gyorgy;

import pen.PenFactory;
import pen.WritingTool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        WritingTool[] writingTools = new WritingTool[10];
        PenFactory.getINSTANCE().createRandomToolsArray(writingTools);
        writeText(writingTools);
        Arrays.sort(writingTools, Comparator.comparingDouble(wt -> wt.inkLevel));
        printSortedArray(writingTools);
    }

    private void printSortedArray(WritingTool[] writingTools) {
        System.out.printf("%nSORTED WRITING TOOLS >>>%n");
        for (WritingTool tool : writingTools) {
            System.out.printf("%s, inkLevel=%.2f%n", tool.getClass().getSimpleName(), tool.inkLevel);
        }
    }

    private void writeText(WritingTool[] writingTools) {
        for (WritingTool writingTool : writingTools) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                char[] text = createRandomTextArray();
                for (char c : text) {
                    sb.append(c);
                    writingTool.write(sb);
                }
                if (writingTool.canErase) {
                    writingTool.erase(sb);
                }
            }
            System.out.printf("%-6s: inkLevel= %.2f%% >>> %s%n"//
                    , writingTool.getClass().getSimpleName(), writingTool.inkLevel, sb);
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