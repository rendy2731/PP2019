import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class IO_RPL03_Fix{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        FileWriter file = null;
        PrintWriter writer = null;

        try{
            System.out.print("Masukkan Nama File: ");
            String namaFile = raf.nextLine() + ".txt";
            ArrayList<String> listName = new ArrayList<>();
            ArrayList<String> listNim = new ArrayList<>();
            ArrayList<String> listAngkatan = new ArrayList<>();

            System.out.print("Berapa Jumlah Assisten yang ingin diinput :");
            int numberOfAssistance = raf.nextInt();
            raf.nextLine();

            for (int i = 0; i < numberOfAssistance; i++) {
                System.out.print("nama : ");
                listName.add(raf.next());
                System.out.print("nim : ");
                listNim.add(raf.next());
                System.out.print("angkatan : ");
                listAngkatan.add(raf.next());
            }
            
            file = new FileWriter(namaFile);
            writer = new PrintWriter(file);
            writer.printf("+----------------------+------------+-----------+\n");
            writer.printf("|         NAMA         |    NIM     |    ANGK   |\n");
            writer.printf("+----------------------+------------+-----------+\n");
            for (int j = 0; j < numberOfAssistance; j++) {    
                writer.printf("| %-20s | %-10s | %-8s  |\n", listName.get(j), listNim.get(j), listAngkatan.get(j));
            }
            writer.printf("+----------------------+------------+-----------+\n");

        } catch (IOException ioe){
            System.out.println("gagal");
        } finally {
            try {
                if (writer != null) {
                    System.out.println("Berhasil");
                    writer.close();
                } 
                if (file != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}