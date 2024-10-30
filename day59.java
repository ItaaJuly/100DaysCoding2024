package itaaa;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        //Loop for each
        
        System.out.print("Masukkan jumlah elemen: ");
        int n = ta.nextInt();
        String[] elemen = new String[n];
        
        System.out.println("Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            elemen[i] = ta.next();
            
        }
        System.out.println("Elemen yang dimasukkan: "); 
        for (String e : elemen) {
            System.out.println(e);
        }
                
                
    }
