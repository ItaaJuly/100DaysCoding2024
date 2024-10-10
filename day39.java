package itaaa;

import java.util.Scanner;


public class Day39 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        //Operator Penugasan: Pengisian dan Modulo
        
        //Pengisian
        System.out.print("Angka One : ");
        int a = ta.nextInt();
        
        System.out.print("Angka Two : ");
        int b = ta.nextInt();
        
        //Modulo
        a %= b;
        System.out.println("Sisa bagi : " + (a %= b));
        
        
        
        
    
                
    }
