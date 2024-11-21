package itaaa;
public class Day81 {
    public static void main(String[] args) {
        //String method ValueOf
        int [] no = {1, 2, 3, 4, 5};
        for (int i = 0; i < no.length; i++) {
            String StrNo = String.valueOf(no[i]);
            System.out.println("Elemen ke- " + (i + 1) + " adalah: " + StrNo);
        }
    }
    
