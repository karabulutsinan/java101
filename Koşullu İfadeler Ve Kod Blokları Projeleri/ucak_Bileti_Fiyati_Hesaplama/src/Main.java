import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //İhtiyacım olan değişkenleri tanımadığım kısım.
        int km, age, tip;
        double normalFiyat;
        double satisFiyat;
        double cocukIndirimi;
        double yetiskinIndirimi;
        double yasliIndirimi;


        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alındığı kısım.
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 =>Tek Yön ,2 => Gidiş Dönüş ) : ");
        tip = input.nextInt();
        //Girelen verilerin indirim oranlarına göre hesaplandığı kısım
        normalFiyat = km * 0.10;
        satisFiyat = tip == 1 ? normalFiyat : normalFiyat * 0.80*2;
        cocukIndirimi = satisFiyat*0.50;
        yetiskinIndirimi=satisFiyat*0.90;
        yasliIndirimi=satisFiyat*0.70;


        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olduğu ve gerekli indirimlerin ekrana yansıtıldığı kısım.
        if ((km > 0) && (age > 0) && (tip == 1 || tip == 2)) {
            if(age<12){
                System.out.println("Toplam Tutar ="+cocukIndirimi);
            }else if(age>12 && age<24){
                System.out.println("Toplam Tutar ="+yetiskinIndirimi);
            }else if(age>65){
                System.out.println("Toplam Tutar ="+yasliIndirimi);
            }else{
                System.out.println("Toplam Tutar ="+normalFiyat);
            }
        } else {
            System.out.print("Hatalı veri girdiniz.");
        }




    }

}

