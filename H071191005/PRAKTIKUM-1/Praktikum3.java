import java.util.Scanner;

class Praktikum3 {

public static void main(String[] args){
    Scanner Praktikum3 = new Scanner (System.in);
    
    System.out.println("masukkan nilai h");
    float h =  Praktikum3.nextFloat();
    System.out.println("masukkan nilai a");
    float a = Praktikum3.nextFloat();
    System.out.println("masukkan nilai b");
    float b = Praktikum3.nextFloat();

    double x1 =Math.tan(Math.toRadians(a))*h;
    double x2 =Math.tan(Math.toRadians(b))*h;
    double panjangKapal = (x1-x2);

    System.out.printf("panjang kapal = %.1f  m",panjangKapal);

}
    


}






