package itaaa;
public class Day69 {
    public static void main(String[] args) {
        //Persegi kotak kosong
            int a = 5;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
                        System.out.print("o");
                    }else{
                        System.out.print(" ");
                }
        }
            System.out.println();
    }
}
