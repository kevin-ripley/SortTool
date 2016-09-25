/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorttool;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author q46p749
 */
public class SortTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1000;
        int max = 1000;
        int[] arr = new int[n];
        long startTime = 0, endTime = 0, totalTime = 0;
        SortBehavior ms = new MergeSort();
         SortBehavior bs = new BubbleSort();
         SortBehavior is = new InsertionSort();
         
         System.out.println("Please choose a tool you would like to use:\n 1 for Mathematica\n 2 for MTool\n 3 for MyMath");
         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         System.out.println("Now that you picked the tool, here are the default search methods they use:\nMathematica - Insertion sort\n MTool - Merge Sort\n MyMath - Bubble Sort");
         System.out.println("Would you like to keep these defaults? Y or N");
         Scanner choice = new Scanner(System.in);
         String yorn = scan.nextLine();
         
         
        Random rdm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdm.nextInt(max);
        }
        
        /* Merge Sort. */
        
        startTime = System.nanoTime();
        int[] returnArr = ms.sort(arr);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        for (int i = 0; i < returnArr.length; i++) {
            System.out.print(returnArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n" + totalTime + " = totalTime.");

        /* Bubble Sort. */
        
        startTime = System.nanoTime();
        int[] retBs = bs.sort(arr);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        for (int i = 0; i < retBs.length; i++) {
            System.out.print(retBs[i] + " ");
            for (int j = i + 1; j < retBs.length; j++) {
                if (retBs[i] > retBs[j]) {
                    System.out.println("Out of order!");
                    System.exit(-1);
                }
            }
        }
        System.out.println("\n" + totalTime + " = totalTime.");

        /* Insertion Sort*/
        
        startTime = System.nanoTime();
        int[] retis = is.sort(arr);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        for (int i = 0; i < retis.length; i++) {
            System.out.print(retis[i] + " ");
            for (int j = i + 1; j < retis.length; j++) {
                if (retis[i] > retis[j]) {
                    System.out.println("Out of order!");
                    System.exit(-1);
                }
            }
        }
        System.out.println("\n" + totalTime + " = totalTime.");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
