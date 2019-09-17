import java.util.Scanner;

class Praktikum{

    public static void main (String[] args){
        Scanner Praktikum = new Scanner (System.in); 
        System.out.println ("waktu");
        int a = Praktikum.nextInt();
        System.out.println("kecepatan");
        int b = Praktikum.nextInt();
        float c = 14;
        float d = (a*b)/c;

        System.out.printf("bensin yang digunakan %.3f L ",d);


        
    }







}