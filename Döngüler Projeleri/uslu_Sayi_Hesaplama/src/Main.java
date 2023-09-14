import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;

        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü Alınacak Sayıyı Giriniz.");
        n = scan.nextInt();

        System.out.println("Üs Olacak Sayıyı Giriniz.");
        k = scan.nextInt();

         int total=1;

        for(int i=1; i<=k; i++ ){
            total =total*n;
        }
        System.out.println("Cevap : "+total);


    }
}
