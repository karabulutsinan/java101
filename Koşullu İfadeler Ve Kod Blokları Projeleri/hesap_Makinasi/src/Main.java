import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");

        System.out.print("Yapıcağınız işlemi tuşlayınız: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.println("Toplama İşleminiz Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma İşlemi Sonucu :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme İşlemi Sonucu : " + (n1 / n2));
                }else{
                    System.out.println("Bir sayı 0 a bölünemez.");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.Tekrar Deneyiniz...");
        }

    }
}
