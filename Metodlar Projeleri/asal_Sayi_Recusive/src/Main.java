import java.util.Scanner;

public class Main {
    static boolean isAsal(int sayi, int sinir) {
        if (sayi < 2) {
            return true;
        }
        if (sinir == 1) {
            return true;
        }
        if (sayi % sinir == 0) {
            return false;
        }
        return isAsal(sayi, sinir - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scan.nextInt();

        if (isAsal(sayi, sayi / 2)) {
            System.out.println(sayi+" Asal Sayıdır.");
        }
        else{
            System.out.println(sayi+" Asal Değildir.");
        }



    }

}
