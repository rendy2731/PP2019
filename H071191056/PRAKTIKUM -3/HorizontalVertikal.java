import java.util.Scanner;
public class HorizontalVertikal{
    public static void main(String[] args){
        Scanner raf = new Scanner(System.in);

        System.out.println("Masukkan Input: ");
        int x = raf.nextInt();

        System.out.println("Masuukan Input ke-2: ");
        int y = raf.nextInt();

        System.out.println(" ");

        int i = 0;
        while(i < y){
            i++;
            if(i % x == 0){
                System.out.println(i);
                }
            else if(i % x !=0){
                System.out.print(i + " ");
                }
        }
        
    }   
}