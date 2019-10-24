import java.util.Scanner;

public class Praktikum01 {
    public static void main(String[] args) {
        Scanner as = new Scanner (System.in);
        String sentence = as.nextLine();
        System.out.printf("#%s%s%s%c\n",hexadecimal(sentence),palindrom(sentence),octal(sentence),symbol(sentence));
    }

    public static String replaceUpper (String sentence){
        String replaceAll = sentence.replaceAll(" ","");
        String upperCase = replaceAll.toUpperCase();
        return upperCase;
    }

    public static String hexadecimal (String sentence){
        int hex = sentence.length()*sentence.length();
        String hexResult = String.format("%x",hex);
        return hexResult;
    }

    public static String palindrom (String sentence){
        String upperCase = replaceUpper(sentence);
        String palindromBelum = upperCase.substring(0, upperCase.length() / 2);
        char palindromChar[] = palindromBelum.substring(0, palindromBelum.length() - 1).toCharArray();
        for (int i = 0; i < palindromChar.length / 2; i++) {
            char temp = palindromChar[i];
            palindromChar[i] = palindromChar[palindromChar.length - i - 1];
            palindromChar[palindromChar.length - i - 1] = temp;
        }
        return palindromBelum + new String(palindromChar);
    }

    public static String octal (String sentence){
        int octal = sentence.length();
        String octalResult = String.format("%o", octal);
        return octalResult;
    }

    public static char symbol (String sentence){
        int hex = sentence.length()*sentence.length();
        String hexResult = String.format("%x",hex);
        int result = (int)hexResult.charAt(0);

        if (result >= 'a' && result <= 'z'){
            return '?';
        }else{
            return '!';
        }
    }
}
