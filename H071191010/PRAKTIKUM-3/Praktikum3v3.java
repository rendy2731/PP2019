import java.util.Scanner;

class Praktikum3v3{
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        int n = ap.nextInt();
        int fn = 0;
        int fn1 = 1;
        int fn2 = 0;

        for (int i = 0; i<=n; i++){
            fn = fn1;
            fn1 = fn2;
            System.out.print(fn2 + " ");
            fn2 = fn + fn1;
        }
    }
}