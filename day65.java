package itaaa;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        
        //Nested Loop
        System.out.print("Baris: ");
        int baris = ta.nextInt();
        
        System.out.print("Kolom: ");
        int kolom = ta.nextInt();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("&");
                
            }
            System.out.println();
        }
    }
    
