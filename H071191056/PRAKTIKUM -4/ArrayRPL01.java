import java.util.Scanner;

public class ArrayRPL01{
	public static void main(String[] args){
		Scanner raf = new Scanner(System.in);

		System.out.println("Masukkan inputan panjang deret: ");
		int deret = raf.nextInt();
		int[] isiDeret = new int[deret];
		//boolean angka = false; 

		for(int i = 0; i < deret; i++){
			isiDeret[i] = raf.nextInt();
		}
		for(int i = 0; i < deret - 1; i++){
			for(int j = i + 1; j < deret; j++){
			 	int angka1 = isiDeret[i];
			 	int angka2 = isiDeret[j];

			 	while(angka1 != angka2){
			 		if(angka1 > angka2){
			 			angka1 = angka1 - angka2;
			 		}
			 		else{
			 			angka2 = angka2 - angka1;
			 		}	
			 	}
			 	//System.out.println(angka1);
			 	if(angka1 == 1){
			 		System.out.println(isiDeret[i] + " " + isiDeret[j]);
			 	}
			}
		}
	}
}