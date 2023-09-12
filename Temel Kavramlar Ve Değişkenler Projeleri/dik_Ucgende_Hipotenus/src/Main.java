import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double aKenar,bKenar,cKenar;

        Scanner input = new Scanner(System.in);

        System.out.print("Dikey Kenarı Giriniz: ");
        aKenar=input.nextDouble();

        System.out.print("Yatay Kenarı Giriniz: ");
        bKenar=input.nextDouble();

        cKenar= Math.sqrt((aKenar *aKenar)+(bKenar*bKenar));
        System.out.println("Hipotenüs :" + cKenar);







    }
}