import java.util.Scanner; 
 
class Praktikum5v3 { 
 	static void myDay(int hari){ 
 	int tahun, bulan;
 	 
 	for (tahun = 0; hari >= 365; hari -= 365) { 
	tahun++;
	}
 	
 	for (bulan = 0; hari >= 30; hari -= 30) { 
 	bulan++;
 	}
 	if (tahun > 0)  
     if (bulan > 0)
     if (hari > 0) 
     System.out.println(tahun + " tahun");
 		System.out.println(bulan + " bulan"); 
 	
 		System.out.println(hari + " hari"); 
}  
 	public static void main(String[] args) { 
 	Scanner sc = new Scanner(System.in); 
 	int days = sc.nextInt(); 
 	myDay(days); 
 	} 
}