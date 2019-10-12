import java.util.Scanner;

public class P4_2 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);

        //indeks ke -0 = service
        //indeks ke-1 = blok
        //indeks ke-2 = smash

        int percobaan [] = {0,0,0};
        int berhasil [] = {0,0,0};

        System.out.println("masukkan jumlah pemain");
        int jumlahPemain = lab.nextInt();

        for (int i = 0; i < jumlahPemain; i++) {
            String namaPemain = lab.next();
            int smashBlokService [] = {0,0,0};

            for (int j = 0; j < 3;j++) {
                smashBlokService[j] = lab.nextInt();
                percobaan[j] += smashBlokService[j];    
            } 
            for (int j = 0; j < 3;j++) {
				int k = lab.nextInt();
				if (k > smashBlokService[j]) {
					System.out.println(namaPemain);
					return;
                }
                berhasil[j] += k;
                
            }
        }

		double persenServis = berhasil[0] * 100.0 / (percobaan[0]*1.0);
		double persenBlock = berhasil[1] * 100.0 / (percobaan[1] * 1.0);
		double persenSmash = berhasil[2] * 100.0 / (percobaan[2] * 1.0);
		System.out.printf("Servis = %.2f%%\n", persenServis);
		System.out.printf("Block = %.2f%%\n", persenBlock);
		System.out.printf("Smash =  %.2f%%\n", persenSmash);
    }
}

