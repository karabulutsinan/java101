import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu : ");

        int number = input.nextInt();//Yazılan dizi boyutu değişkeni hafızada tutuyoruz.

        System.out.println("Dizinin elemanlarını giriniz: ");

        int[] list = new int[number];//Yeni bir dizi tanımıyoruz yukarıda girilen sayı kadar değişkeni olucak.

        for (int i = 0; i < list.length; i++) {//Dizinin içinde listemizde kaç tane sayı varsa o kadar dönücek.
            System.out.print((i + 1) + ". Elemanı : ");//index numarası 0 dan başladığı için +1 yazdırıak (0+1=1) 1.Elemanı yazdırıyoruz .
            list[i] = input.nextInt();//Listemizin içine yazılan rakamları hafızada tutuyoruz.
        }

        Arrays.sort(list);//Array komutu ile diziyi küçükten büyüğü sıralıyoruz.
        System.out.println("Sıralaması : " + Arrays.toString(list));//Listemizi yazdırıyoruz.
    }
}