import java.util.Scanner;

public class  GanjilGenap{
    public static void main(String[] args){
    
        Scanner raf = new Scanner(System.in);

        System.out.println("Masukkan Input X: ");
        int x = raf.nextInt();

        System.out.println("Masukkan Input Y: ");
        int y = raf.nextInt();


        for(int i = x; i <= y; i++){
            if(i < 0 && i % 2 == 0){
                System.out.println(i + " genap negatif ");
            }
            else if(i < 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil negatif");
            }
            else if(i == 0){
                System.out.println(i + " nol");
            }
            else if(i > 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil positif");
            }
            else if(i > 0 && i % 2 == 0){
                System.out.println(i + " genap positif");
            }
            else{
                System.out.println(" Nothing happened");
            }
        }
        
        for(int j = y; j <= x; j++){
            if(j < 0 && j % 2 == 0){
                System.out.println(j + " genap negatif ");
            }
            else if(j < 0 && j % 2 == 1 || j % 2 == -1){
                System.out.println(j + " ganjil negatif");
            }
            else if(j == 0){
                
                System.out.println(j + " nol");
            }
            else if(j > 0 && j % 2 == 1 || j % 2 == -1){
                
                System.out.println(j + " ganjil positif");
            }
            else if(j > 0 && j % 2 == 0){
                
                System.out.println(j + " genap positif");
            }
            else{
                System.out.println(" Nothing happened");
            }
        }

    }
}