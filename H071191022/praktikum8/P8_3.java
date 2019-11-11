import java.util.Scanner;
import java.io.*;

public class P8_3 {

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        String fileName = sep.next()+".txt";
        int nData = sep.nextInt();

        String name [] = new String [nData];
        String nim [] = new String [nData];
        int year [] = new int [nData];

        for (int i = 0; i < nData; i++) {
            String nameReplace = sep.next().replaceAll("_"," ");
            name [i] = nameReplace.substring(0,Math.min(nameReplace.length(),20));
            String nimReplace = sep.next();
            nim [i] = nimReplace.substring(0,Math.min(nimReplace.length(), 10));
            year[i] = sep.nextInt();
        }
        FileOutputStream out = null;

		try {
			out = new FileOutputStream(fileName);
			PrintWriter writer = new PrintWriter(out);
		
			writer.println("+----------------------+------------+---------- +");
			writer.println("| Nama                 | NIM        | Angkatan |");
			writer.println("+----------------------+------------+----------+");
			for (int i = 0; i < nData; i++)
			writer.printf("| %-20s | %-10s | %-8d |\n", name[i], nim[i], year[i]);
			writer.println("+----------------------+------------+----------+");
    
			writer.flush();
			System.out.println("Berhasil");
		} catch (IOException e) {
            System.out.println("Gagal");
            
		} finally {

			try {
                if (out != null) 
                out.close();
			} catch (IOException e) {
				System.out.println(e);
				System.exit(1);
			}
		}
    }
}