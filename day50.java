package itaaa;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        
        //Percabangan if-else if-else
        int n = ta.nextInt();
        if (n == 0) {
            System.out.println("Netral");
        }else if (n < 6) {
            System.out.println("Good");
        }else
            System.out.println("Diluar nurul");
                
    }
