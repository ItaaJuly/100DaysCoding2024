package itaaa;
public class Day78 {
    public static void main(String[] args) {
        //Sting method:equalsgnoreCase()
       String a = "Coding";
       String b = "coding";
       String c = "CODING";
       
        //Mengabaikan kapital
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(b.equalsIgnoreCase(c));
    }
