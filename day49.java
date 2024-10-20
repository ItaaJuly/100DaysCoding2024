package itaaa;

import java.util.Scanner;


public class Day49 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int a = ta.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int b = ta.nextInt();
        
        if (a == b) {
            System.out.println("iya");
        }else if (a < b) {
            System.out.println("ups");
        }
        
                
    }
