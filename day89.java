package itaaa;
import java.util.Scanner;
public class Day89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         //Membuat array untuk menyimpan harga produk
         int[] harga = new int[7];
         for (int i = 0; i < 7; i++) {
            harga[i] = in.nextInt();
        }
         //Mencari harga tertinggi (max) dan harga terendah (min)
         int max = harga[0];
         int min = harga [0];
         
         //Mmeproses array mencari harga tertinggi dan terendah
         for (int i = 0; i < harga.length; i++) {
             if (harga[i] > max) {
                 max = harga[i];
          //Mmemperbarui harga tertinggi jika ditemukan
             }
             if (harga[i] < min) {
                 min = harga[i];
          //Memperbarui harga terendah jika sudah ditemukan
             } 
             }
         System.out.println("Max: " + max);
         System.out.println("Min: " + min);
        }
    
