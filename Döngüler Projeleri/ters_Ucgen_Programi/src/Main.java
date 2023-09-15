import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        //Değişkenlerin tanımlandığı kısım
        int yukseklik = input.nextInt();
        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;
        //Sayaçların tanımlandığı kısım
        boslukSayisi = 0;
        yildizSayisi = 2 * yukseklik - 3;
        //Kullanının girdiği yıldızların sayısı
        for (int i = 0; i < yukseklik - 1; i++) {
            //Boşluk sayılarının olduğu kısım
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            //Yıldız sayılarının olduğu kısım
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
            //Girilen sayının her seferinde 2 li şekilde düşürdüğü kısım
            boslukSayisi++;
            yildizSayisi -= 2;


        }
    }
}