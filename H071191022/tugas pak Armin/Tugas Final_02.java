import java.util.Scanner;
public class P2_2 {

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        System.out.println("input baris dan kolom matriks PQ");
        int p = sep.nextInt();
        int q = sep.nextInt();
        System.out.println("input baris dan kolom matriks RS");
        int r = sep.nextInt();
        int s = sep.nextInt();
        int [][] matriksPQ = new int [p][q];
        int [][] matriksRS = new int [r][s];


        if (q==r || s==p){
        //input matriks PQ
        System.out.println("input matriks " + p + " kali " + q);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matriksPQ [i][j] = sep.nextInt();
            }
        }

        //input matriks RS
        System.out.println("input matriks " + r + " kali " + s);
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < s; l++) {
                matriksRS [k][l] = sep.nextInt();
            }
        }

        //output
        System.out.println("hasil kali matriks PQ dan RS ");
        for (int i = 0; i < p; i++) {
            for (int l = 0; l < s ; l++) {
                int result = 0;
                for (int k = 0; k < q; k++) {
                    result += matriksPQ[i][k] * matriksRS [k][l];
                }System.out.print(result + " ");
        }System.out.println();   
    }

        System.out.println("hasil kali matriks RS dan PQ");
        for (int k = 0; k < r; k++) {
            for (int j = 0; j < q ; j++) {
                int result2 = 0;
                for (int i = 0; i < p; i++) {
                    result2 += matriksRS[k][i] * matriksPQ [i][j];
                }System.out.print(result2 + " ");
            }System.out.println();
        }
        }else{
        System.out.println("perkalian matriks tidak bisa dilakukan");
        }
    }
}