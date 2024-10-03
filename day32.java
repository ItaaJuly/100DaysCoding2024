package itaaa;


public class Day32 {
    public static void main(String[] args) {
        //Konversi data primitif ke String.
       int umur_dulu = 16;
       double umur_skrg = 19.3;
       boolean benarkahh = true;
       
       String umurString = String.valueOf(umur_dulu);
       String umur_skrgString = String.valueOf(umur_skrg);
       String benarkahhString = String.valueOf(true);
       
       //Konversi ke String
        System.out.println("Jadi umur sya dulu " + umurString + "tahun");
       
        System.out.println("dan skrg umur sya " + umur_skrgString + " bulan");
       
        System.out.println("yang benar ajaa baru umur 19 " + benarkahhString);
       
        
    }
    
}
