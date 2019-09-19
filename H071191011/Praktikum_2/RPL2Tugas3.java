import java.util.Scanner;

class RPL2Tugas3 {
	// Buatlah program yang meminta 3 inputan string, dan menampilkan hasil
	// sesuai gambar dibawah ini
	//|    Input 1    |  Input 2  |   Input 3   |    Output   |
	//                            / carnivoro  --    aguia
	//                /   ave    *
	//               /            \  onivoro   --    pomba
	//  vertebrado  *
	//               \            /  onivoro   --    homen
	//                \ mamifero *
	//                            \ herbivoro  --    vaca
	//
	//                            / hematofago --    pulga
	//                / inseto   *
	//               /            \ herbivoro  --   lagarta
	// invertebrado *
	//               \            / hematofago -- sanguessuga
	//                \ anelideo *
	//                            \  onivoro   --   minhoca
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = null;

		// Lines below are inefficient, but works.
		String input1 = sc.nextLine().toLowerCase();
		switch(input1) {
			case "vertebrado": {
				String input2 = sc.nextLine().toLowerCase();
				switch(input2) {
					case "ave": {
						String input3 = sc.nextLine().toLowerCase();
						switch(input3) {
							case "carnivoro": {
								result = "aguia";
								break;
							}
							case "onivoro": {
								result = "pomba";
								break;
							}
							default: break;
						}
						break;
					}
					case "mamifero": {
						String input3 = sc.nextLine().toLowerCase();
						switch(input3) {
							case "onivoro": {
								result = "homen";
								break;
							}
							case "herbivoro": {
								result = "vaca";
								break;
							}
							default: break;
						}
						break;
					}
				}
				break;
			}
			case "invertebrado": {
				String input2 = sc.nextLine().toLowerCase();
				switch(input2) {
					case "inseto": {
						String input3 = sc.nextLine().toLowerCase();
						switch(input3) {
							case "hematofago": {
								result = "pulga";
								break;
							}
							case "herbivoro": {
								result = "lagarta";
								break;
							}
							default: break;
						}
						break;
					}
					case "anelideo": {
						String input3 = sc.nextLine().toLowerCase();
						switch(input3) {
							case "hematofago": {
								result = "sanguessuga";
								break;
							}
							case "onivoro": {
								result = "minhoca";
								break;
							}
							default: break;
						}
						break;
					}
					default: break;
				}
				break;
			}
			default: break;
		}

		System.out.println(result == null ? "Invalid input" : result);
	}
}
