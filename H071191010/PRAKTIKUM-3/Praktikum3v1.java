import java.util.Scanner;

class Praktikum3v1 {

    public static void main(String[] args) {
        Scanner ap = new Scanner (System.in);
        
        int x = ap.nextInt();
        int y = ap.nextInt();
        int m = y;

        if (y<x){
            x = y;
            y = m;
        }
        for(int i= x; i <= y; i++){
            if (i==0){
                System.out.println(i+" Nol");
            }
            else if(i%2==0){
                if (i>0){
                    System.out.println(i+" Genap Positif");
            }else{
                    System.out.println(i+" Genap Negatif");
                }
            }
            else {
                if (i>0){
                    System.out.println(i+" Ganjil Positif");
                }else if(i<0){
                    System.out.println(i+" Ganjil Negatif");
                }
            }
        }
        for(int j = x; j<= y; j++){
            if (j==0){
                System.out.println(j+" Nol");
            }
            else if(j%2==0){
                if (j>0){
                    System.out.println(j+" Genap Positif");
            }else{
                    System.out.println(j+" Genap Negatif");
                }
            }
            else {
                if (j>0){
                    System.out.println(j+" Ganjil Positif");
                }else if(j<0){
                    System.out.println(j+" Ganjil Negatif");
                }
            }
        }
    }
}