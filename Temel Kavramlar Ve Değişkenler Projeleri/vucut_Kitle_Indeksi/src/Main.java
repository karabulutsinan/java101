import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            double kg,m,index;

            Scanner input = new Scanner(System.in);
            System.out.print("Kilonuzu Giriniz: ");
            kg = input.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Boyunuz Giriniz: ");
            m= input2.nextDouble();

            index=kg/(m*m);

            System.out.println("Vucut Kitle İndexi: " + index);





        }
    }
