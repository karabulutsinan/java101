import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();//Girilen yıl değişkeni


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {//Yazılan yılın 4 e bölümünde kalan 0 ve 100 e bölümünden kalan 0 değilse veya 400 e tam bölünüyor ise
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }

    }
}
