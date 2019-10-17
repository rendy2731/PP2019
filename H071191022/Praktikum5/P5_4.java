import java.util.Scanner;
public class P5_4{

  static int luasPersegi (int a, int b){
    int luasPersegi = a*b;
    return luasPersegi;
  }

  static int luasPersegiPanjang (int c,int d){
    int luasPersegiPanjang = c*d;
    return luasPersegiPanjang;
  }

  static double luasSegitiga (int e,int f){
    double luasSegitiga = (e*f)/2;
    return luasSegitiga;
  }
  static double luasLingkaran (int g){
    double luasLingkaran = 3.14*g*g;
    return luasLingkaran;
  }

  static double luasJajarGenjang (int h,int i){
    double luasJajarGenjang = h*i;
    return luasJajarGenjang;
  }

  static double luasTrapesium(int j,int k,int l){
    double luasTrapesium = (j+k)/2*l;
    return luasTrapesium;
  }

  static double luasBelahKetupat(int m,int n){
    double luasBelahKetupat = (m*n)/2;
    return luasBelahKetupat;
  }

  static double luasLayangLayang (int o,int p){
    double luasLayangLayang = (o*p)/2;
    return luasLayangLayang;
  }

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);

        System.out.println("**PILIH BANGUN DATAR**");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Trapesium");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Layang-Layang"); 
        System.out.println("\nInput angka sesuai dengan nomor bangun datar yang di inginkan");

        String bangunDatar = sep.nextLine();

          switch (bangunDatar){

            case "1":
              System.out.println("MENGHITUNG LUAS PERSEGI");
              System.out.println("masukkan panjang");
              int a = sep.nextInt();
              System.out.println("masukkan lebar");
              int b = sep.nextInt();
              System.out.printf("luas persegi = " + luasPersegi(a, b));
              break;

            case "2":
              System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
              System.out.println("masukkan panjang");
              int c = sep.nextInt();
              System.out.println("masukkan lebar");
              int d = sep.nextInt();
              System.out.printf("luas persegi panjang = " + luasPersegiPanjang (c,d));
              break;

            case "3":
              System.out.println("MENGHITUNG LUAS SEGITIGA");
              System.out.println("masukkan tinggi");
              int e = sep.nextInt();
              System.out.println("masukkan alas");
              int f = sep.nextInt();
              System.out.printf("luas segitiga = " + luasSegitiga (e,f));
              break;

            case "4":
              System.out.println("MENGHITUNG LUAS LINGKARAN");
              System.out.println("masukkan jari-jari");
              int g = sep.nextInt();
              System.out.println("luas lingkarannya = " + luasLingkaran (g));
              break;

            case "5":
              System.out.println("MENGHITUNG LUAS JAJAR GENJANG");
              System.out.println("masukkan alas");
              int h = sep.nextInt();
              System.out.println("masukkan tinggi ");
              int i = sep.nextInt();
              System.out.println("luas Jajar Genjang = " + luasJajarGenjang (h,i)); 
              break;

            case "6":
              System.out.println("MENGHITUNG LUAS TRAPESIUM");
              System.out.println("masukkan sisi atas");
              int j = sep.nextInt();
              System.out.println("masukkan sisi bawah");
              int k = sep.nextInt();
              System.out.println("masukkan tinggi");
              int l = sep.nextInt();
              System.out.println("luas Trapesium = " + luasTrapesium (j,k,l));
              break;

            case "7":
              System.out.println("MENGHITUNG LUAS BELAH KETUPAT");
              System.out.println("masukkan diagonal 1");
              int m = sep.nextInt();
              System.out.println("masukkan diagonal 2");
              int n = sep.nextInt();
              double luasBelahKetupat = (m*n)/2;
              System.out.println("luas belah ketupat = " + luasBelahKetupat (m,n));
              break;

            case "8":
              System.out.println("MENGHITUNG LUAS LAYANG-LAYANG");
              System.out.println("masukkan diagonal 1");
              int o = sep.nextInt();
              System.out.println("masukkan diagonal 2");
              int p = sep.nextInt();
              double luasLayangLayang = (o*p)/2;
              System.out.println("luas layang-layang = " + luasLayangLayang (o,p));
              break;

      }
    }
  }
      
                    
  

        
                  
