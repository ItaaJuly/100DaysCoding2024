package ta;

import java.util.Scanner;


public class day36 {
    public static void main(String[] args) {
        Scanner ita = new Scanner (System.in);
        
        //Operator Aritmatika: Perkalian,Pembagian dan Modulo
        
        //Perkalian
        System.out.print("Angka pertama: ");
        byte ang = ita.nextByte();
        
        //Pembagian
        System.out.print("Angka kedua: ");
        int ung = ita.nextInt();
        
        //Modulo
        System.out.print("Angka ketiga: ");
        short oi =ita.nextShort();
        
       
        System.out.println(ang * ang);
        System.out.println(ung / ang);
        System.out.println(ang % oi);
        
       
        
                
    }
    
