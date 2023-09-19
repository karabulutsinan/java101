import java.util.Scanner;

public class Main {
    public static int pattern(int sayi, boolean arttir, int sayiDepolama) {
        int variable;
        if (sayi > sayiDepolama && arttir) {
            return 1;
        }
        if (sayi <= 0) {
            arttir = true;
        }
        if (arttir) {
            variable = 5;
        } else {
            variable = -5;
        }
        System.out.print(sayi + " ");
        return pattern(sayi +variable, arttir, sayiDepolama);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int sayi = input.nextInt();
        pattern(sayi, false, sayi);
    }

}