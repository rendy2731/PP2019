import java.util.Scanner;

public class P6_2 {

    //soal modul nomor 2

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        String input = sep.nextLine();
        String keep = changing(input);
        int keepLength = keep.length();
        int part = (int)Math.ceil(keepLength/16.0);
        
        for (int i = 0, j = 0; i < 16; i++) {
            for (int k = 0; k < part; k++) {
                if (j<keepLength){
                    System.out.print(keep.charAt(j++));
                }else{
                    System.out.print('?');
                }
            }

            if (i%4==3){
                System.out.println();
            }else{
                System.out.print(' ');
            }
        }
    }

    public static String changing (String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i%2 == 0){
                result += input.charAt(i);
            }else{
                result += input.codePointAt(i);
            }
        }
        return result;
    }



}