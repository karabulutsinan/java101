import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;//Girilen doğum yılının çıktısını alabilmek için oluşturulan değişken

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        age = input.nextInt();
        int result = age % 12;//Girilen doğum yılının 12ye bölümüden kalanı veren değişken
        String animal = "";

        switch (result) {//Girilen doğum yılının 12ye bölümüden kalanın sayılara karşılık gelen Hayvanların listelendiği kısım
            case 0:
                animal = "Maymun";
                break;
            case 1:
                animal = "Horoz";
                break;
            case 2:
                animal = "Köpek";
                break;
            case 3:
                animal = "Domuz";
                break;
            case 4:
                animal = "Fare";
                break;
            case 5:
                animal = "Öküz";
                break;
            case 6:
                animal = "Kaplan";
                break;
            case 7:
                animal = "Tavşan";
                break;
            case 8:
                animal = "Ejdarha";
                break;
            case 9:
                animal = "Yılan";
                break;
            case 10:
                animal = "At";
                break;
            case 11:
                animal = "Koyun";
                break;

        }
        System.out.println("Çin Zodyağı Burcunuz : " + animal);

    }
}
