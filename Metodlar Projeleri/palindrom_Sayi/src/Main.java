import java.util.Scanner;

public class Main {
    static void Polindrom(int number) {//Tekrar çağırılmayan bir metod tanımladım.

        int temp = number, reversenumber = 0, lastnumber; // Değişkenlerin :)
        while (temp != 0) {//Sayımız 0"a eşit değilseye kadar alttaki işlemleri devam ettir.
            lastnumber = temp % 10;//Son sayıyı bulmak için Girdiğimiz sayıyı 10 a bölüyorum.
            reversenumber = (reversenumber * 10) + lastnumber;//Ters sayıyıda 10 ile çarpıp son sayıyı ekliyorumki basamak sayısını arttırıyım .
            temp = temp / 10;//Son olarak sayımızı 10 a bölüyorum.

        }
        if (number == reversenumber) {//Sayıymız Tersten Sayıya Eşitse
            System.out.println("Palindrom Sayıdır.");

        } else {//Değilse
            System.out.println("Palindrom Sayı Değildir.");


        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = input.nextInt();
        Polindrom(n);


    }
}