import java.util.Scanner;

public class Vetebrata{
    public static void main(String[] args){
        
        Scanner raf = new Scanner(System.in);

        System.out.println("Inputan anda: ");
        String input1 = raf.nextLine();

        String input2;
        String input3;

        switch(input1){
                case "vertebrado":
                    System.out.println("Inputan ke-2 anda: ");
                    input2 = raf.nextLine();

                    switch(input2){
                        case "ave":
                            System.out.println("Inputan ke-3 anda: ");
                            input3 = raf.nextLine();

                            switch(input3){
                                case "carnivoro":
                                System.out.println("\nHasil Output adalah: \nAgula");

                                break;

                                case "onivoro":
                                System.out.println("\nHasil Output adalah: \nPomba");

                                break;

                                default:
                                System.out.println("\nInputan tidak valid");

                        
                            }
                            break;

                        case "mamifero":
                            System.out.println("Inputan ke-3 anda: ");
                            input3 = raf.nextLine();

                            switch(input3){
                                case "onivoro":
                                System.out.println("\nHasil Output adalah: \nHomem");

                                break;

                                case "herbivoro":
                                System.out.println("\nHasil Output adalah: \nVaca");

                                break;

                                default:
                                System.out.println("\nInputan tidak valid");

                            }
                            break;

                            default:
                            System.out.println("\nInputan tidak valid");
                    }
                    break;
                

                case "invertebrado":
                    System.out.println("Inputan ke- 2 anda: ");
                    input2 = raf.nextLine();

                    switch(input2){
                        case "inseto":
                            System.out.println("Inputan ke-3 anda: ");
                            input3 = raf.nextLine();

                            switch(input3){
                                case "hematofago":
                                    System.out.println("\nHasil Output adalah: \nPulga");

                                break;
                                
                                case "herbivoro":
                                    System.out.println("\nHasil Output adalah: \nLagarta");

                                break;

                                default:
                                System.out.println("\nInputan tidak valid");
                            }
                            break;
                        case "anelideo":
                            System.out.println("Inputan ke-3 anda: ");
                            input3 = raf.nextLine();
                            
                            switch(input3){
                                case "hematofago":
                                    System.out.println("\nHasil Output adalah: \nSanguessuga");
                                
                                break;
                                
                                case "onivoro":
                                    System.out.println("\nHasil Output adalah: \nMinhoca");
                                
                                break;
                                
                                default:
                                System.out.println("Inputan tidak valid");
                            }
                            break;

                            default:
                            System.out.println("Inputan tidak valid");
                    }
                    break;

                    default:
                    System.out.println("Inputan tidak valid");
                    

        }
    }
}