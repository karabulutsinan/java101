import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        if(b==0){
            return 1;
        }else if(b>0){
            return a*power(a,b-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base Sayısı: ");
        a=scanner.nextInt();
        System.out.print("Üs Sayısı: ");
        b=scanner.nextInt();
        int sonuc = power(a,b);


        System.out.println("Base Sayısı : "+a+" \nÜs Sayısı : "+b+"\nSonuc : "+sonuc);


    }
}