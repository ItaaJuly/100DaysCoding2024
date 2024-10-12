package itaaa;

import java.util.Scanner;


public class Day41 {
    public static void main(String[] args) {
        Scanner ta = new Scanner (System.in);
               
        //Soal 2 evaluasi mentor
        
        int a = ta.nextInt();
        int b = ta.nextInt();
        a = a+  b;  //Melakukan operasi aritmatika untuk membalikkan angka a menjadi angka b
        b = a- b;   
        a = a- b;
        System.out.println(b+">"+a);
        
        boolean c = a > b;         
        System.out.println(c);
        }
   
