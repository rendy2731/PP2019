import java.util.Scanner;

class RPL2Tugas4 {
	// Program pokemon (isi penjelasan yang pajang disini)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String poke1 = sc.next();
		String elem1 = sc.next().toLowerCase();
		String poke2 = sc.next();
		String elem2 = sc.next().toLowerCase();

		switch(elem1) {
			case "fire": {
				switch(elem2) {
					case "fire":
						System.out.println("draw");
						break;
					case "ice":
					case "electric":
						System.out.println(poke1);
						break;
					case "water":
					case "ground":
						System.out.println(poke2);
						break;
					default:
						System.out.println("missingno element: 2nd pokemon");
				}
				break;
			}
			case "ice": {
				switch(elem2) {
					case "ice":
						System.out.println("draw");
						break;
					case "ground":
					case "water":
						System.out.println(poke1);
						break;
					case "fire":
					case "electric":
						System.out.println(poke2);
						break;
					default:
						System.out.println("missingno element: 2nd pokemon");
				}
				break;
			}
			case "ground": {
				switch(elem2) {
					case "ground":
						System.out.println("draw");
						break;
					case "fire":
					case "electric":
						System.out.println(poke1);
						break;
					case "water":
					case "ice":
						System.out.println(poke2);
					default:
						System.out.println("missingno element: 2nd pokemon");
				}
				break;
			}
			case "electric": {
				switch(elem2) {
					case "electric":
						System.out.println("draw");
						break;
					case "water":
					case "ice":
						System.out.println(poke1);
						break;
					case "fire":
					case "ground":
						System.out.println(poke2);
						break;
					default:
						System.out.println("missingno element: 2nd pokemon");
				}
				break;
			}
			case "water": {
				switch(elem2) {
					case "water":
						System.out.println("draw");
						break;
					case "fire":
					case "ground":
						System.out.println(poke1);
						break;
					case "ice":
					case "electric":
						System.out.println(poke2);
						break;
					default:
						System.out.println("missingno element: 2nd pokemon");
				}
				break;
			}
			default:
				System.out.println("missingno element: 1st pokemon");
		}
	}
}
