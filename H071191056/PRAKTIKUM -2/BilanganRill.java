import java.util.Scanner;

public class BilanganRill{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);
        try{
            System.out.println("Masukkan Input: ");
            int angka = raf.nextInt();
            int angka2 = raf.nextInt();
            int angka3 = raf.nextInt();
            int angka4 = raf.nextInt();
            int angka5 = raf.nextInt();
            

            int genap = 0;
            int positif = 0;
            int ganjil = 0;
            int negatif = 0;
            
            if(angka % 2 == 0){
                genap += 1;
            }
            else if(angka % 2 == 1 || angka % 2 == -1 ){
                ganjil += 1;
            }
            if(angka > 0){
                positif += 1;
            }
            else if(angka < 0){
                negatif++;
            }
            
            if(angka2 % 2 == 0){
                genap += 1;
            }
            else if(angka2 % 2 == 1 || angka2 % 2 == -1 ){
                ganjil += 1;
            }
            if(angka2 > 0){
                positif += 1;
            }
            else if(angka2 < 0){
                negatif++;
            }

            if(angka3 % 2 == 0){
                genap += 1;
            }
            else if(angka3 % 2 == 1 || angka3 % 2 == -1 ){
                ganjil += 1;
            }
            if(angka3 > 0){
                positif += 1;
            }
            else if(angka3 < 0){
                negatif++;
            }

            if(angka4 % 2 == 0){
                genap += 1;
            }
            else if(angka4 % 2 == 1 || angka4 % 2 == -1 ){
                ganjil += 1;
            }
            if(angka4 > 0){
                positif += 1;
            }
            else if(angka4 < 0){
                negatif++;
            }

            if(angka5 % 2 == 0){
                genap += 1;
            }
            else if(angka5 % 2 == 1 || angka5 % 2 == -1 ){
                ganjil += 1;
            }
            if(angka5 > 0){
                positif += 1;
            }
            else if(angka5 < 0){
                negatif++;
            }
                

            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");
        }
        catch(Exception e){
            System.out.println("Inputan tidak valid");
        }
        finally{
            raf.close();
        }
    }
}