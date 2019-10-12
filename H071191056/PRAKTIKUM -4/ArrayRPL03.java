import java.util.Scanner;
public class ArrayRPL03{
	public static void main(String[] args) {
		Scanner raf = new Scanner(System.in);
			System.out.println("Insert Number Of Player: ");
			int player = raf.nextInt();
			int[] happen = new int[3];
			int[] succes = new int[3];

		 	float happenSkill[] = new float[3];
			float succesSkill[] = new float[3];
			float totalService = 0;
			float totalBlock = 0;
			float totalSmash = 0;

			//Perulangan untuk ke-3 pemain
			for(int i = 0; i < player; i++){
				String name = raf.next();
				//Perulangan untuk Smash, Block dan Service yang terjadi
				for(int j = 0; j < 3;j++){
					happen[j] = raf.nextInt();
					happenSkill[j] += happen[j];

				}
				//Perulangan untuk Smash, Block dan Service yang berhasil
				for(int j = 0; j < 3;j++){
				succes[j] = raf.nextInt();
					//Kondisi dimaana Pukulan yang dilakukan lebih kecil daripada keberhasilan
					if(happen[j] < succes[j]){
						System.out.println("Tidak Cocokmi!!! ");
						System.exit(0);

					}
				succesSkill[j] += succes[j];
				}
				//Rumus Menghitung persentase keberhasilan Smash block Dan Service
				float service = (succesSkill[0]  * 100) / happenSkill[0];
				totalService = service;
				float block = (succesSkill[1] * 100) / happenSkill[1];
				totalBlock = block;
				float smash = (succesSkill[2]  * 100) / happenSkill[2];
				totalSmash = smash;
			}

			System.out.printf("Service: %.2f%%",totalService);
			System.out.println();
			System.out.printf("Block: %.2f%%",totalBlock);
			System.out.println();
			System.out.printf("Smash: %.2f%%",totalSmash);

	}
}
