import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi icin eleman sayisini girin: ");//Kaç adet fibonacci sayısi yazdırsın.
        int elemanSayisi = scanner.nextInt();//Kaç adet isteniyorsa o sayının tutulduğu data

        int sayi1 = 0, sayi2 = 1;

        System.out.print(elemanSayisi + " Elemanli Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {//İlk başta girilen eleman sayısı kadar döngü döndürüyoruz.
            System.out.print(sayi1 + " ");

            int toplam = sayi1 + sayi2;//Toplamı hep bir önceki sayıyla topluyoruz
            sayi1 = sayi2;//İlk girilen sayı önceki sayıya eşitleniyor.
            sayi2 = toplam;//Son verilen çıktı
        }
    }
}