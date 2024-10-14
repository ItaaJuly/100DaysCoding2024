package itaaa;

import java.util.Scanner;


public class Day43 {
    public static void main(String[] args) {
        Scanner ta = new Scanner (System.in);
        // Operator Perbandingan : Lebih besar sama dengan dan Lebih kecil sama dengan
        
        System.out.print("Nilai a : ");
        int a = ta.nextInt();
        
        System.out.print("Nilai b : ");
        int b = ta.nextInt();
        
        if (a >= b) {
            System.out.println("iya");
        }else if (a <= b) {
            System.out.println("Tidak");
        }
               
                
    }
