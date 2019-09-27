import java.util.Scanner;
public class P3_4 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        System.out.println("masukkan harga barang");
        int price = lab.nextInt();
        System.out.println("masukkan jumlah uang yang di bayarkan ");
        int cash = lab.nextInt();

        int change = cash-price;
        int money = 0;
        int sisa = 0;

        for (int i = 1; i <= 7; i++) {
            switch(i){
                case 1 :
                money = change/100000;
                System.out.println(money+ " uang Rp. 100.000");
                break;

                case 2 :
                sisa = change - (money * 100000);
                money = sisa / 50000;
                System.out.println(money+ " uang Rp. 50.000");
                break;

                case 3:
                sisa = sisa - (money * 50000);
                money = sisa / 20000;
                System.out.println(money+ " uang Rp. 20.000");
                break;

                case 4:
                sisa = sisa - (money * 20000);
                money = sisa/10000;
                System.out.println(money + " uang Rp. 10.000");
                break;

                case 5 :
                sisa = sisa-(money * 10000);
                money = sisa/5000;
                System.out.println(money + " uang Rp. 5.000");
                break;

                case 6 :
                sisa = sisa-(money * 5000);
                money = sisa/2000;
                System.out.println(money + " uang Rp. 2.000");
                break;

                case 7 :
                sisa = sisa-(money*2000);
                money = sisa/1000;
                System.out.println(money + " uang Rp. 1.000");
                
            }   
        }
    }
}
