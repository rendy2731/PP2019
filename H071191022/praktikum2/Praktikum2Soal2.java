import java.util.Scanner;
class Praktikum2Soal2 {

    public static void main(String[] args) {
        Scanner pt = new Scanner (System.in);
        String pokemon1,pokemon2,elemen1,elemen2;

        System.out.println("masukkan nama pemain 1");
        pokemon1 = pt.next();
        elemen1 = pt.next();
        System.out.println("masukkan nama pemain 2");
        pokemon2 = pt.next();
        elemen2 = pt.next();

        switch (elemen1){
            case "fire" :
            switch (elemen2){
                case "ice" :
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric" :
                    System.out.println(pokemon1 + " win");
                    break;
                case "water" :
                    System.out.println(pokemon2 + " win");
                    break;
                case "fire":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }break;

            case "ground":
            switch (elemen2){
                case "fire":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println(pokemon1 + " win");
                    break;
                case "water":
                    System.out.println(pokemon2 + " win");
                    break;
                case "ground":
                    System.out.println("draw");
                default:
                    System.out.println("wrong");
                    break;
            }break;

            case "electric":
            switch (elemen2){
                case "water":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
            }break;

            case "water":
            switch(elemen2){
                case "electric":
                    System.out.println(pokemon2 + " win");
                    break;
                case "ice":
                    System.out.println(pokemon2 + " win");
                    break;
                case "water":
                    System.out.println("draw");
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }break;

            case "ice":
            switch(elemen2){
                case "ground":
                    System.out.println(pokemon1 + " win");
                    break;
                case "electric":
                    System.out.println(pokemon2 + " win");
                    break;
                default:
                    System.out.println("wrong");
                    break;

            }break;
        }
        pt.close();
    }
}
