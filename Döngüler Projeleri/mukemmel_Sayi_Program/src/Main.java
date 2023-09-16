import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exit=false ;//Programı bitirmek veya devam ettirmek için kullandığım  boolean.


        while(!exit) {//Mükemmel sayı girene kadar devam etsin.
            System.out.print("Bir Sayı Giriniz: ");
            int n = input.nextInt();

            int total = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    total = total + i;

                }
            }
            if (total == n) {
                System.out.println("Bu Bir Mükemmel Sayıdır.");
                exit=true;//Eğerki girdiği değer doğruysa boolen çalışssın ve program sonlansın.
            } else {
                System.out.println("Bu Bir Mükemmel Sayı Değildir.");
            }

        }
    }
}