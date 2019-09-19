import java.util.Scanner;
public class Praktikum2v1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan x");
        int x = sc.nextInt();
        System.out.println("masukkan y");
        int y = sc.nextInt();

        if (x<0 && y>0){
            if (x+y<0){
                System.out.println("berada pada kuadran 1");
            }else if (x+y>0){
                System.out.println("berada pada kuadran 2");
            }else{
                System.out.println("berada pada -x = y");
            }
            
        }else if(x>0 && y>0){
            if (x-y<0){
                System.out.println("berada pada kuadran 3");
            }else if(x-y>0){
                System.out.println("berada pada kuadran 4");
            }else{
                System.out.println("berada pada x = y");
            }
        }else if (x>0 && y<0){
            if (x+y>0){
                System.out.println("berada pada kuadran 5");
            }else if(x+y>0){
                System.out.println("berada pada kuadran 6");
            }else{
                System.out.println("berada pada x = -y");
            }

        }else if(x<0 && y<0){
            if (x-y>0){
                System.out.println("berada pada kuadran 7");
            }else if (x+(-y)<0){
                System.out.println("berada pada kuadran 8");
            }else{
                System.out.println("berada pada -x = -y");
            }
        }else{
            if (x==0 && y !=0){
                System.out.println(x + "," + y);
            }else{
                System.out.println(x + "," + y);
            }
        }
    }
}

