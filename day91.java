package itaaa;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama: ");
                String a = in.nextLine();
        System.out.print("Masukkan kata kedua: ");
                String b = in.nextLine();
                
        if (a.endsWith("you") && b.endsWith("i")) {
        System.out.println("Kata pertama berakhir dengan 'you' dan kata kedua berkahir dengan 'i'. ");
        }else
            System.out.println("Percabangan tidak terpenuhi. ");
       //Jika saya menginput kata lain maka kode else yang akan dijalankan
       //Kecuali ada kata you dan i maka kode if yang akan dijalaankan
                
                
    }
    
