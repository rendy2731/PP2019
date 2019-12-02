import java.util.*;
import java.io.*;

public class IO_RPL02 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner raf = new Scanner (System.in);
      FileWriter fw = null;
      PrintWriter pw = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         String filePertama = raf.next();                                            
         String fileKedua = raf.next();                                           
         raf.close();
         fr = new FileReader(String.format("%s.txt",filePertama));
         br = new BufferedReader(fr);
         fw = new FileWriter(String.format("%s.txt", fileKedua));
         pw = new PrintWriter(fw);

         String tes;

         int max = 0;
         while ((tes = br.readLine()) != null){
            max = tes.length() > max ? tes.length() : max;
         }
         fr = new FileReader(String.format("%s.txt",filePertama));
         br = new BufferedReader(fr);

      
         String test;

         while ((test = br.readLine()) != null) {
            pw.write(String.format("%"+max+"s\n", test));
         }
         
      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (fw != null){
               System.out.println("Berhasil");
               fw.close();
            } 
            if (fr != null){
               fr.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
      }
   }
}