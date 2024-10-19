package itaaa;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        //Pecabangan : if-else
        
        int angka = ta.nextInt();
        int angkaJg = ta.nextInt();
       
        if (angka != angkaJg) {
            System.out.println("Yes");
        }else
            System.out.println("No");
                
    }
