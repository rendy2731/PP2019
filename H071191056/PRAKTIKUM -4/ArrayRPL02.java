import java.util.Scanner;
public class ArrayRPL02{
	public static void main(String[] args) {
		Scanner raf = new Scanner(System.in);
		System.out.println("-------------------- Welcome Sir --------------------");
		System.out.println("-------------------- Program Matrix --------------------");
		System.out.println("---------------- By : Rafly Ramdhani Putra ----------------\n-------------------- NIM : H071191056]--------------------");
		System.out.println("-----------------------------------------------------------");

		System.out.println("Silahkan Masukkan input: ");
		int i = raf.nextInt();
		int j = raf.nextInt();
		int k = raf.nextInt();

		int[][] matrixA = new int[i][j];
		int[][] matrixB = new int[j][k];
		//int[][] matrixC = new int[i][k];

		//Matrix A
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matrixA[a][b] = raf.nextInt();

			}
		}
		//Matrix B
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matrixB[b][c] = raf.nextInt();
			}
		}
		//Perkalian Matrix
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matrixA[a][c] * matrixB[c][b];
					//matrixC[a][c] = matrixA[a][b] + matrixB[b][c];
					//total += matrixC[a][c];*/

				}
				System.out.print(total + " ");


			}
			System.out.println();
		}



	}
}
