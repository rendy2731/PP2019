import java.util.Scanner;

class Praktikum3v2{
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        int x = af.nextInt();
        int y = af.nextInt();

        for (int i = 1; i <= y; i++){
            System.out.print(i + " ");
            if (i % x ==0){
                System.out.println();
            }
        }
    }
}