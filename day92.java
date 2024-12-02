package itaaa;
public class Day92 {
    public static void main(String[] args) {
        
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (2 * a -1); j++) {
                if (j == i || j == (2 * a - 2 - i)) {
                    System.out.print("o");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
