import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nTotal = 1, rTotal = 1, nrTotal = 1, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz:");
        int n = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        int r = input.nextInt();


        for (int i = 1; i <= n; i++) {
            nTotal = nTotal * i;
        }
        System.out.println("Kullanıcıdan gelen birinci sayı 'n': " + n + "!" + "\n" + "Faktöriyel değeri: " + nTotal);

        for (int i = 1; i <= r; i++) {
            rTotal = rTotal * i;
        }
        System.out.println("Kullanıcıdan gelen ikinci sayı 'r': " + r + "!" + "\n" + "Faktöriyel değeri: " + rTotal);

        for (int i = 1; i <= (n - r); i++) {
            nrTotal = nrTotal * i;
        }
        System.out.println("n-r: " + (n - r) + "!" + "\n" + "Faktöriyel değeri: " + nrTotal);

        result = nTotal / (rTotal * nrTotal);

        System.out.println("C(n,r)=n!/(r!*(n-r)!): " + "İşlemin Sonucu: " + result);


    }
}
