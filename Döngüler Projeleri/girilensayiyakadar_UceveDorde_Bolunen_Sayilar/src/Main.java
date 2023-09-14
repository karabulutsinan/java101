import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int sum = 0;
        int syc = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = input.nextInt();


        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
                sum += i;
                syc ++;
            }


        }
        System.out.println("Ortalaması: "+ sum/syc);


    }
}
