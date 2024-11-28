package itaaa;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] nilai = new int[5];
        for (int i = 0; i < 5; i++) {
            nilai[i] = in.nextInt();
        }
          int total = 0;
          for (int i = 0; i < 5; i++) {
            total += nilai[i];
        }
          double rata = total / 5.0;
          System.out.println("Total: " + total);
          System.out.println("Nilai rata-rata: " + rata);
    }
