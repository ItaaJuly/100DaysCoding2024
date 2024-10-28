package itaaa;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        //Looping Decrement
        System.out.print("Masukkan nilai : ");
        int a = ta.nextInt();
        for (int go = a; go>= 1; go++) {
            System.out.println(go);
        }
                
    }
