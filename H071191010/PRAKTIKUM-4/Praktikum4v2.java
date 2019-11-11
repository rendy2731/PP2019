import java.util.Scanner;

class Praktikum4v2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int array1 [][] = new int [a][b];
    int array2 [][] = new int [b][c];
    //matriks
    for (int i = 0; i < a; i++){
        for (int j =0; j<b;j++){
            array1[i][j] = sc.nextInt();
        }
    }
    for (int i =0; i < b; i++){
        for (int j =0; j<c; j++){
            array2[i][j] = sc.nextInt();

        }
    }
    int baris1 = array1.length;
    int kolom1 = array1[0].length;
    int baris2 = array2.length;
    int kolom2 = array2[0].length;
    int sum = 0;
    int array3[][] = new int [baris1][baris2];

    for (int i = 0;i< baris1; i++){
        for (int j = 0;j<baris2; j++){
            sum = 0;
            for (int k=0;k<kolom1; k++){
                sum += array1[i][k] * array2[k][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
}