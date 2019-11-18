import java.util.*;
public class CollectionRPL02{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        HashMap<String, Character> morseCode = new HashMap<>();
        System.out.print("Masukkan Kode Morse: ");
        String morseInput = raf.nextLine();
        String morseToArray[] = morseInput.split("\\s+");

        morseCode.put(".-", 'A');
        morseCode.put("-...", 'B');
        morseCode.put("-.-.",'C');
        morseCode.put("-..",'D');
        morseCode.put(".",'E');
        morseCode.put("..-.",'F');
        morseCode.put("--.",'G');
        morseCode.put("....",'H');
        morseCode.put("..",'I');
        morseCode.put(".---",'J');
        morseCode.put("-.-",'K');
        morseCode.put(".-..",'L');
        morseCode.put("--",'M');
        morseCode.put("-.",'N');
        morseCode.put("---",'O');
        morseCode.put(".--.",'P');
        morseCode.put("--.-",'Q');
        morseCode.put(".-.",'R');
        morseCode.put("...",'S');
        morseCode.put("-",'T');
        morseCode.put("..-",'U');
        morseCode.put("...-",'V');
        morseCode.put(".--",'W');
        morseCode.put("-..-",'X');
        morseCode.put("-.--",'Y');
        morseCode.put("--..",'Z');
        morseCode.put(".--",'1');
        morseCode.put("..--",'2');
        morseCode.put("...--",'3');
        morseCode.put("...-",'4');
        morseCode.put(".....",'5');
        morseCode.put("-....",'6');
        morseCode.put("--...",'7');
        morseCode.put("---..",'8');
        morseCode.put("----.",'9');
        morseCode.put("-----",'0');

        for(String key : morseToArray){
            System.out.print(morseCode.get(key));
        }

    }
}