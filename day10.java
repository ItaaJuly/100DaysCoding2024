package itaa;

public class day10 {
    public static void main(String[] args) {
        //Mendeklarasikan variabel dengan tipe data byte
        byte myByte = 90;
        System.out.println("Nilai myByte: " + myByte);
        
        myByte += 70;
        System.out.println("Nilai myByte setelah penambahan: " + myByte);
        
        byte anotherByte = 40;
        byte result = (byte) (myByte + anotherByte);
        System.out.println("Hasil pejumlahan myByte dan anotherByte:" + result);
        
            
        }
            
        
