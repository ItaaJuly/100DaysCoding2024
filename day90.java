package itaaa;

import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Membaca input 10 angka kategori
        int[] data = new int[10];
        int[] frekuensi = new int[100]; 
        for (int i = 0; i < 10; i++) {
            data[i] = in.nextInt();
            frekuensi[data[i]]++;         }

                for (int i = 0; i < frekuensi.length; i++) {
            if (frekuensi[i] > 0) {
                System.out.println("Kode " + i + " muncul sebanyak: " + frekuensi[i] + " kali");
            }
        }
                
                
    }
    
