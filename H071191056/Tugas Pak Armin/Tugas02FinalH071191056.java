import java.util.Scanner;
public class Tugas02FinalH071191056{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        System.out.println("MatrixA");
        System.out.print(" Input p-");
        int p = raf.nextInt();
        System.out.print("\n Input q-");
        int q = raf.nextInt();
        System.out.println("MatrixB");
        System.out.print("\n Input r-");
        int r = raf.nextInt();
        System.out.print("\n Input s-");
        int s = raf.nextInt();
        int matrixA[][] = new int[p][q];
        int matrixB[][] = new int[r][s];
        System.out.println("Berikut Adalah Matrix A ");
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                System.out.print("Unsur Matrix A" + "[" + i + "]" + "[" + j + "] = ");
                matrixA[i][j] = raf.nextInt();  
            }
        }
        System.out.println("Berikut Adalah Matrix B");
        for(int j = 0; j < r; j++){
            for(int k = 0; k < s; k++){
                System.out.print("Unsur Matrix B" + "[" + j + "]" + "[" + k + "] = ");
                matrixB[j][k] = raf.nextInt();
            }
        }
        if(r != q){
            System.out.println("Tidak Bisa melakukan perkalian");
        }
        else{
        for(int i = 0; i < p; i++){
            for(int j = 0; j < s; j++){
                int total = 0;
              for(int k = 0; k < q; k++){
                total = total + matrixA[i][k] * matrixB[k][j];
                //total += matrixA[i][j];  
                    }
                    System.out.print(total + " ");
                }
                System.out.println();
            }
        }
        if(p != s){
            System.out.println("Tidak Bisa melakukan Perkalian");
        }
        else{
        for(int i = 0; i < r; i++){
            for(int j = 0; j < q; j++){
                int total = 0;
              for(int k = 0; k < s; k++){
                total = total + matrixB[i][k] * matrixA[k][j];
                //total += matrixA[i][j];  
                    }
                    System.out.print("\n" + total + " ");
                }
                System.out.println();
            }
        }
    }
}