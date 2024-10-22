package itaaa;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
         Scanner ta = new Scanner(System.in);
         //Percabangan : Switch Case
         int angka = ta.nextInt();
         switch (angka) {
             case 1 :
                 System.out.println("Ini angka satu");
                 break;
             case 2 :
                 System.out.println("Ini angka dua");
                 break;
             case 3 :
                 System.out.println("Ini angka tiga");
                 break;
             case 4 :
                 System.out.println("Ini angka empat");
                 break;
             case 5 :
                 System.out.println("Ini angka lima");
                 break;
             default:
                 System.out.println("Diluar batas");
         }
                 
    }
