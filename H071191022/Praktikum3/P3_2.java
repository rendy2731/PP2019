import java.util.Scanner;
public class P3_2 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        System.out.println("masukkan nilai X (horizontal)");
        int x = lab.nextInt();
        System.out.println("masukkan nilai Y (vertikal)");
        int y = lab.nextInt();
           for (int i = 1; i <= y; i++) {
               System.out.print(i + " ");
                if (i%x==0){
                    System.out.println("\n");
                }
           }       
        }
    }   