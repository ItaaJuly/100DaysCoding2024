package itaaa;
public class Day93 {
    public static void main(String[] args) {
        
           int n = 5;
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n - i - 1; j++) {
                   System.out.print(" ");
               }
               for (int k = 0; k < (2 * i + 1); k++) {
                   if (k == 0 || k == (2 * i)) {
                       System.out.print("o");
                   }else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
        }
    }
