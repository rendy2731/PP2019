import java.util.Scanner;
import java.io.*;

class P8_1 {

    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;
        Scanner sep = new Scanner (System.in);

        try {
            input = new FileInputStream(String.format("%s.txt",sep.nextLine()));
            output = new FileOutputStream(String.format("%s.txt",sep.nextLine()));
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (IOException ioe) {
            System.out.println("fail");
            
        } finally{

            try{
            if (input != null){
                System.out.println("success");
                input.close();
            }
            if (output != null){
                output.close();
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
}