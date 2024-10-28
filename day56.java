package itaaa;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);
       //Evaluasi
       int suhu = ta.nextInt();
        if (suhu <= 0) {
            System.out.println("Air mendidih");
        }else if (suhu > 0 && suhu <= 100 ) {
            System.out.println("Air dalam keadaaan cair");
        }else if (suhu > 100) {
            System.out.println("Air mendidih");
        }
        }
                
    }￼Enter
