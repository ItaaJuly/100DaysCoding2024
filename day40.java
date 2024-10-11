package itaaa;

import java.util.Scanner;


public class Day40 {
    public static void main(String[] args) {
       //Operator pembanding: lebih besar dan lebih kecil 
        Scanner ta = new Scanner (System.in);
        System.out.print("Nilai A : ");
       int a = ta.nextInt();
       
        System.out.print("Nilai B : ");
       int b = ta.nextInt();
       
        if (a>b) {
            System.out.println("Nilai a lebih besar dari nilai b");
        }else if (a<b) {
            System.out.println("Nilai a lebih kecil dari nilai b");
        }
        
    }
