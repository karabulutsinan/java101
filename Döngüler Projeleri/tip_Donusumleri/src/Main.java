import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tam Sayı Giriniz :");
        int n =input.nextInt();
        double myDouble =n;
        System.out.println("Girdiğin tam sayının Double Değeri: "+myDouble);

        System.out.print("\nOndalıklı Sayı Giriniz :");
        double k = input.nextDouble();
        int myInteger= (int) k;
        System.out.println("Girdiğin tam sayının Double Değeri: "+myInteger);





    }
}