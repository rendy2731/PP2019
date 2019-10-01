import java.util.Scanner;

public class BilanganPrima{
        public static void main(String[] args) {
            Scanner raf = new Scanner(System.in);
            System.out.print("Masukkan Prima: ");
            int prima = raf.nextInt();
            for(int i = 2;i <= Math.sqrt(prima) + 1; i++){
                if(prima % i == 0){
                    System.out.println(prima + " Bukan Bilangan Prima");
                    System.exit(0);
                }
                
            }
            System.out.println(prima + " Bilangan Prima");
        }
}