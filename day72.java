package itaaa;
public class Day72 {
  //Methode rekursif untuk menghitung faktorial
    public static int faktorial(int n){
        if (n <= 1) {
            return 1;
        }else {//Memanggil metode faktorial secara rekursif
            return n * faktorial(n - 1);
            
    }
    
}
    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari: " + angka + " adalah " + hasil);
    }
