import java.util.Scanner;

public class P4_3 {

    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        int i = lab.nextInt();
        int j = lab.nextInt();
        int k = lab.nextInt();
        int [][] matriksA = new int [i][j];
        int [][] matriksB = new int [j][k];

        for (int a = 0; a < i ; a++) {
            for (int b = 0; b < j; b++) {
                matriksA [a][b] = lab.nextInt();
            }
        }
        for (int b = 0; b < j; b++) {
            for (int c = 0; c < k; c++) {
                matriksB [b][c] = lab.nextInt();
            }
        }
        for (int a = 0; a < i; a++) {
            for (int c = 0; c< k; c++) {
                int hasil = 0;
                for (int b = 0; b < j; b++) {
                    hasil += matriksA[a][b]*matriksB[b][c];

                }System.out.print(hasil + " ");
            }System.out.println();
        }
        
    }
}