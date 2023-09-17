import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("B sayısını giriniz: ");
        int b = input.nextInt();
        System.out.print("C sayısını giriniz: ");
        int c = input.nextInt();
        int sonuc = a + b * c - b;
        System.out.println("\na+b*c-b İşleminin Sonucu: " + sonuc);
    }
}