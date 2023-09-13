import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fzk, kmya;//ders değişkenleri
        double toplam = 0;//toplam dersleri sayan sayaç
        int gecerliDersSayisi = 0;//eğerki girilen not 0 100 arası işe ders sayılarını sayan sayaç


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz :");
        mat = input.nextInt();
        if ((mat >= 0 && mat <= 100)) {
            toplam = toplam + mat;
            gecerliDersSayisi++;
        } else {
            System.out.println("Geçerli bir not girmediniz.Ortalamaya katılmıycaktır.");
        }

        System.out.print("Fizik notunu giriniz :");
        fzk = input.nextInt();
        if ((fzk >= 0 && fzk <= 100)) {
            toplam = toplam + fzk;
            gecerliDersSayisi++;
        } else {
            System.out.println("Geçerli bir not girmediniz.Ortalamaya katılmıycaktır.");
        }

        System.out.print("Kimya notunu giriniz :");
        kmya = input.nextInt();
        if ((kmya >= 0 && kmya <= 100)) {
            toplam = toplam + kmya;
            gecerliDersSayisi++;
        } else {
            System.out.println("Geçerli bir not girmediniz.Ortalamaya katılmıycaktır.");
        }

        toplam = toplam / gecerliDersSayisi;//bütün toplanan notların (0 100 arası not girilen derslere)bölümünden elde edilen sonuç

        System.out.println("Ortalamanız: " + toplam);

        //Sınıfı geçip kalma durumu
        if(toplam>=55){
            System.out.println("Sınıfı Geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }


    }
}
