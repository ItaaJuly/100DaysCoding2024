package itaaa;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        System.out.print("Masukkan suhu air: ");
        int a = ta.nextInt();
        if (a <= 0) {
            System.out.println("Air membeku");
        }else if (a > 0 && a <= 100) {
            System.out.println("Air dalam keadaan cair");
        }else if (a > 100) {
            System.out.println("Air mendidih");
        }
                
                
    }
