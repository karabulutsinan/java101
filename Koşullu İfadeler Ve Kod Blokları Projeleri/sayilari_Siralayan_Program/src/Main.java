import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;//Değişkenler

        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz.");
        a = input.nextInt();

        System.out.println("2.Sayıyı giriniz.");
        b = input.nextInt();

        System.out.println("3.Sayıyı giriniz.");
        c = input.nextInt();

        if ((a < b) && (a < c)) {//a"nın en küçük olduğu senaryo
            if ((b < c)) {
                System.out.println(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if ((b < a) && (b < c)) {//b"nin en küçük olduğu senaryo
            if ((c < a)) {
                System.out.println(b + "<" + c + "<" + a);
            } else {
                System.out.println(b + "<" + a + "<" + c);
            }
        } else {//c"nin en küçük olduğu senaryo
            if ((b < a)) {
                System.out.println(c + "<" + b + "<" + a);

            } else {
                System.out.println(c + "<" + a + "<" + b);
            }
        }

    }

}

