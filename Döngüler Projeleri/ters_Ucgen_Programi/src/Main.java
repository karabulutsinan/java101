import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int yukseklik = input.nextInt();
        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;

        boslukSayisi = 0;
        yildizSayisi = 2 * yukseklik - 3;
        for (int i = 0; i < yukseklik - 1; i++) {

            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;


        }
    }
}