package itaaa;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
        
        System.out.print("Makanan favorit : ");
        String fav = ta.nextLine();
        String ok = fav.equals("Nasi ayam ? ") ? "tak":"iya";
        System.out.println("oh jdi ksukaan km itu ? " + ok);
        
                
    }
