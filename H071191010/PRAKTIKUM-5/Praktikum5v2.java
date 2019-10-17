import java.util.Scanner; 
import java.util.Random; 
 
 	class Praktikum5v2 { 
 	static String serialNumber(int n, int m) { 
 		Random rng = new Random(System.currentTimeMillis()); 
 		String seq = ""; 
 
 		for (int j = 0; j < n; j++) { 
 			for (int k = 0; k < m; k++) { 
 				seq += ((char) (rng.nextInt(10) + '0')); 
 			} 
 			if (j < n - 1) {
 				seq += '-'; 
 			} 
	}
 
 	return seq; 
	}
 	public static void main(String[] args) { 
  	Scanner sc = new Scanner(System.in); 
 	int n = sc.nextInt(); 
 	int m = sc.nextInt(); 
 	String serialNumber = serialNumber(n, m); 
 	System.out.println(serialNumber); 
	}
}