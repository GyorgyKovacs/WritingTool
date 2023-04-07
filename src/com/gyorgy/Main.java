package com.gyorgy;

import pen.PenFactory;
import pen.WritingTool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
/**
 * This is the main class for the WritingTool application.
 * It creates a set of random writing tools and char arrays,
 * writes out the concatenated arrays and sorts the writing tools by ink level.
 * @author Gyorgy Kovacs
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        WritingTool[] writingTools = new WritingTool[10];
        PenFactory.getINSTANCE().createRandomToolsArray(writingTools);
        System.out.println("Created 10 random writing tools with random text:");
        writeText(writingTools);
        Arrays.sort(writingTools, Comparator.comparingDouble(wt -> wt.inkLevel));
        printFormattedArray(writingTools);
    }

    private void writeText(WritingTool[] writingTools) {
        for (WritingTool writingTool : writingTools) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                char[] text = createRandomTextArray();
                writingTool.write(sb, text);
                if (writingTool.canErase) {
                    writingTool.erase(sb);
                }
            }
            System.out.printf("%-6s : inkLevel= %.2f%% >>> %s%n"//
                    , writingTool.getClass().getSimpleName(), writingTool.inkLevel, sb);
        }
    }

    private char[] createRandomTextArray() {
        Random random = new Random();
        char[] array = new char[random.nextInt(3) + 3];
        for (int i = 0; i < array.length; i++) {
            char c;
            do {
                c = (char) random.nextInt(128);
            } while (!Character.isLetterOrDigit(c));
            array[i] = c;
        }
        return array;
    }

    private void printFormattedArray(WritingTool[] writingTools) {
        System.out.printf("%nSORTED WRITING TOOLS >>>%n");
        for (WritingTool tool : writingTools) {
            System.out.printf("%-6s : inkLevel = %.2f%n", tool.getClass().getSimpleName(), tool.inkLevel);
        }
    }

}