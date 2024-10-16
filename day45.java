package itaaa;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        
        System.out.print("Nilai a : ");
        int a = ta.nextInt();
        
        System.out.print("Nilai b : ");
        int b = ta.nextInt();
       
        if ((a == b) || (a != b)) {
            System.out.println("true");
        }else
            System.out.println("false");
        
    }
