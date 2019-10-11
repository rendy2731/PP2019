import java.util.Scanner;
public class P4_1 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        System.out.println("masukkan n");
        int n = lab.nextInt();
        int [] data = new int [n];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = lab.nextInt();

            
        }
        System.out.println("-------");
        
        for (int bilangan : data) {
            if (bilangan%2 == 0){
                System.out.println(bilangan + " ");
            }
        }

    }
}