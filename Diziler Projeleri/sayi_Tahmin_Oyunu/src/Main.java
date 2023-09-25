import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);

        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5) {
            System.out.print("Lütfen tahmini giriniz : ");
            int selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(!isWrong){
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşürülecektir.");
                }
                else{
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hakkınız : "+(5-right));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikleri Doğru Tahmin.");
                System.out.println("Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {

                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if(!isWrong){
                System.out.println("Tahminlerizi : " + Arrays.toString(wrong));
            }

        }
    }
}