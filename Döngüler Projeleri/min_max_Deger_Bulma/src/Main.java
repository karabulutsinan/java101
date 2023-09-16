import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı giriceksiniz: ");
        int n = input.nextInt();//Kullanıcın kaç adet sayı girmek istediğini datayı tutan data.
        int max = 0;
        int min = 0;
        for (int i = 1; i <= n; i++){//Kullanıcının ilk başta girdiği sayıya kadar döngü döndüren döngü.

            System.out.print(i + "." + "Sayısını giriniz: ");
        //Kullanıcı başta kaç adet sayı girdiyse o kadar kere sayı girmesini isteyen kısım
        int k = input.nextInt();

        if (i == 1) {//İlk girilen sayının en küçük ve en büyüğe eşitleniyorki karşılaştırma yaptığında en küçük sayıyı yani min=0 almasın :)
            min = k;
            max = k;
        }
        if (k < min) {//girdiğimiz sayı diğer sayılardan küçükse en küçük sayı
            min = k;
        }
        if (k > max) {//girdiğimiz sayı diğer sayılardan büyükse en büyük sayı
            max = k;
        }

    }
        System.out.println("En Büyük Sayı : "+max);//Ekrana yazdırıldığı kısım
        System.out.println("En Küçük Sayı : "+min);//Ekrana yazdırıldığı kısım


}
}