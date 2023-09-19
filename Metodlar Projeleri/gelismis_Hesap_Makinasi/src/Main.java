
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama İşlemi Sonucu : " + result);
        return result;

    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkartma İşlemi Sonucu : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma İşlemi Sonucu  :" + result);
        return result;
    }

    static int divided(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Sayılar 0 Girilemez!!!");
            return 0;
        } else if (a == 0) {
            System.out.println("Birinci Sayı 0 Girilemez.");
            return 0;
        } else if (b == 0) {
            System.out.println("İkinci Sayı 0 Girilemez.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme İşlemi Sonucu : " + result);
        return result;

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println(a + " Sayısının " + b + " Üssü : " + result);
        return 1;

    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        int cevre = 2 * (a + b);
        System.out.println("Dikdörgenin Çevresi: " + cevre);

        int alan = (a * b);
        System.out.println("Dikdörgenin Çevresi: " + alan);

    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }


        System.out.println("Sonuç : " + result);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkartma İşlemi \n"
                + "3 - Çarpma İşlemi \n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayıları Hesaplama \n"
                + "6 - Mod Alma \n"
                + "7 - Dikdörtgen Alan ve Çevre Hesaplama \n"
                + "8 - Faktoriyel Hesaplama\n"
                + "0 - Çıkış Yap";


        while (true) {
            System.out.println(menu);

            System.out.print("Lütfen Bir Seçim Yapınız: ");
            select = input.nextInt();
            if (select == 0) {
                System.out.println("Hesap Makinasından Çıkış Yaptınız.");
                break;
            }
            int a=0,b=0;
            if (select != 8) {
                System.out.print("Birinci Sayıyı Giriniz : ");
                a = input.nextInt();
                System.out.print("İkinci Sayıyı Girinz : ");
                b = input.nextInt();
            }


            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                case 8:
                    factorial();
                    break;
                default:
                    System.out.println("Yanlış Bir Seçim Yaptınız.");
            }


        }


    }
}