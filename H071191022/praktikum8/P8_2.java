import java.util.Scanner;
import java.io.*;

class P8_2 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner sep = new Scanner (System.in);
      FileWriter fileWriter = null;
      PrintWriter printWriter = null;
      FileReader fileReader = null;
      BufferedReader bufferedReader = null;

      try {
         String first = sep.next();                                            
         //Main File
         String second = sep.next();                                           
         //Copied
         sep.close();
         fileReader = new FileReader(String.format("%s.txt",first));
         bufferedReader = new BufferedReader(fileReader);
         fileWriter = new FileWriter(String.format("%s.txt", second));
         printWriter = new PrintWriter(fileWriter);

         String check;
         int max = 0;
         while ((check = bufferedReader.readLine()) != null){
            max = check.length() > max ? check.length() : max;
         }
         fileReader = new FileReader(String.format("%s.txt",first));
         bufferedReader = new BufferedReader(fileReader);

      
         String cek;
         while ((cek = bufferedReader.readLine()) != null) {
            printWriter.write(String.format("%"+max+"s\n", cek));
         }
         
      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (fileWriter != null){
               System.out.println("Berhasil");
               fileWriter.close();
            } 
            if (fileReader != null){
               fileReader.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
      }
   }
}