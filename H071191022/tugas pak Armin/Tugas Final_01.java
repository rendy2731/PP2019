import java.util.Scanner;

public class P2_1 {


    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        int input [] = new int [10];
        double error = 0;
        double sum = 0;
        int i;

        System.out.println("masukkan 10 data");
        for (int j = 0; j < input.length; j++) {
            input [j]= sep.nextInt();
            sum += input[j];
        }
        System.out.println("================================================");
        System.out.println("|\tNo\t|\tdata\t|\terror\t|");
        System.out.println("================================================");

        double rataRata = sum/10;

        for (int j = 0; j < input.length; j++) {
            error = Math.sqrt(Math.pow((rataRata - input[j]), 2));
            System.out.printf("|\t%d\t|\t%d|\t\t%.2f|\n",(j+1),input[j],error);
        }
    }
}