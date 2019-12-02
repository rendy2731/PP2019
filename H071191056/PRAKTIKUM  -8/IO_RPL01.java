import java.io.*;
import java.util.*;
public class IO_RPL01{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        
        
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream(raf.next() + ".txt");
            output = new FileOutputStream(raf.next() + ".txt");
            int i;
            while((i = input.read()) != -1){
                output.write(i);
            }
        }
        catch(IOException ioe){
            System.out.println("gagal");
        }
        finally{
            try{
                if(input != null){
                    System.out.println("Berhasil");
                    input.close();
                }
                if(output != null){
                    //System.out.println("Gagal");
                    output.close();                
                }
            }
            catch(IOException ioe){
                System.out.println("Gagal");
            }
        }
        
    }
}