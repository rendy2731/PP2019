import java.util.Scanner;

class Praktikum2Soal1 {
    public static void main(String[] args) {
        Scanner pt = new Scanner (System.in);
        String input1;
        String input2;
        String input3;

        input1 = pt.nextLine();
        switch (input1){
            case "vertebrado":
            input2 = pt.nextLine();
            switch (input2){
                case "ave":
                input3 = pt.nextLine();
                switch(input3){
                    case "carnivoro":
                        System.out.println("aguia");
                        break;
                    case "onivoro":
                        System.out.println("pomba");
                        break;
                    default:
                        System.out.println("tidak terdeteksi");
                
                }break;

                case "mamifero":
                input3 = pt.nextLine();
                switch (input3){
                case "onivoro":
                    System.out.println("homem");
                    break;
                case "herbivoro":
                    System.out.println("vaca");
                    break;
                default:
                    System.out.println("tidak terdeteksi");
                }
            }break;
        
            case "invertebrado" :
            input2 = pt.nextLine();
            switch (input2){
            case "inseto":
            input3 = pt.nextLine();
            switch (input3){
            case "hematofago":
                System.out.println("pulga");
                break;
            case "herbivoro":
                System.out.println("lagarta");
                break;
            default:
                System.out.println("tidak terdeteksi");

            }break;
                
            case "anelideo" :
            input3 = pt.nextLine();
            switch (input3){
            case "hematofago":
                System.out.println("sanguessuga");
                break;
            case "onivoro":
                System.out.println("minhoca");
            default:
                System.out.println("tidak terdeteksi");

            }break;
            }
        }
        pt.close();
    }
}
    


