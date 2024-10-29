package itaaa;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        //Loop while decrement
        
        System.out.print("Masukkan angka awal : ");
        int angka = ta.nextInt();
        while (angka > 0) {
            System.out.println("Angka:  " + angka);
            angka--;
        }
            
        System.out.println("Finish!!!!");    
       
                
    }
