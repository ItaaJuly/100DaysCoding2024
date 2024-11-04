package itaaa;
public class Day64 {
    public static void main(String[] args) {
        //Break label
        for (int pertama = 0; pertama < 3; pertama++) {
            for (int terakhir = 0; terakhir < 3; terakhir++) {
                if (pertama == 1 && terakhir == 1) {
                   break;
                }
                System.out.println("Pertama:" + pertama + " Terakhir:"+ terakhir);
            }
            
        }
        System.out.println("Stoppppppp!!!!!!");
    }
    
