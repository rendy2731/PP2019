import java.util.Scanner;

public class DuniaPokemon{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);
        System.out.println("Nama Pokemon 1 dan Elemen Dasar-nya: ");
        String pokemon1 = raf.next();
        String elemen1 = raf.next();
    
        String pokemon2;
        String elemen2;

        switch(elemen1){
                case "Fire":           
                    System.out.println("Nama Pokemon 2 dan Elemen Dasar-nya: ");
                    pokemon2 = raf.next();
                    elemen2 = raf.next();
                    switch(elemen2){
                        case "Water":
                            System.out.println("\n" + pokemon2);
                        break;

                        case "Ice":
                            System.out.println("\n" + pokemon1);
                        break;

                        case "Electric":
                            System.out.println(pokemon1);
                        break;

                        case "Ground":
                            System.out.println(pokemon2);
                        break;

                        default:
                            System.out.println("draw");

                    }
                    break;

                case "Water":
                    System.out.println("Nama Pokemon 2 dan Elemen Dasar-nya: ");
                    pokemon2 = raf.next();
                    elemen2 = raf.next();
                    switch(elemen2){
                        case "Fire":
                            System.out.println(pokemon1);
                        break;

                        case "Electric":
                            System.out.println(pokemon2);
                        break;

                        case "Ice":
                            System.out.println(pokemon2);
                        break;

                        case "Ground":
                            System.out.println(pokemon1);
                        break;

                        default:
                            System.out.println("draw");
                    }
                    break;

                case "Ground":
                System.out.println("Nama Pokemon 2 dan Elemen Dasar-nya: ");
                pokemon2 = raf.next();
                elemen2 = raf.next();
                    
                    switch(elemen2){
                        case "Water":
                            System.out.println(pokemon2);
                        break;

                        case "Fire":
                            System.out.println(pokemon1);
                        break;

                        case "Electric":
                            System.out.println(pokemon1);
                        break;

                        case "Ice":
                            System.out.println(pokemon2);
                        break;

                        default:
                            System.out.println("draw");
                    }
                    break;
                
                case "Ice":
                System.out.println("Nama Pokemon 2 dan Elemen Dasar-nya: ");
                pokemon2 = raf.next();
                elemen2 = raf.next();

                     switch(elemen2){
                        case "Ground":
                            System.out.println(pokemon1);
                        break;

                        case "Electric":
                            System.out.println(pokemon2);
                        break;

                        case "Fire":
                            System.out.println(pokemon2);
                        break;

                        case "Water":
                            System.out.println(pokemon1);
                        break;

                        default:
                            System.out.println("draw");
                    }
                    break;

                case "Electric":
                System.out.println("Nama Pokemon 2 dan Elemen Dasar-nya: ");
                pokemon2 = raf.next();
                elemen2 = raf.next();

                    switch(elemen2){
                        case "Water":
                            System.out.println(pokemon1);
                        break;

                        case "Fire":
                            System.out.println(pokemon2);
                        break;

                        case "Ice":
                            System.out.println(pokemon1);
                        break;

                        case "Ground":
                            System.out.println(pokemon2);
                        break;

                        default:
                            System.out.println("draw");
                    }
                    break;

        }

    }
}