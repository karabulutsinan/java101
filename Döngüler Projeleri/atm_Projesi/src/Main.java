import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlandığı kısım
        String userName, userPassword;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int price;
        //Kullanıcın 3 defa yanlış girme hakkının olduğu kısım
        for (int i = 1; i <= right; i--) {
            //Kullanıcıdan verilerin alındığı kısım
            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName = input.nextLine();

            System.out.print("Kullanıcı Parlonızı Giriniz:");
            userPassword = input.nextLine();
            int select;
            //Kullanıcıdan bilgilerin check edildiği yer
            if (userName.equals("sinan") && userPassword.equals("karabulut")) {
                System.out.println("Sisteme giriş yaptınız.");
                System.out.println("Merhaba Semsan Bankasına Hoşgeldiniz.");
                do {
                    //Kullanıcının yaptırmak istediği seçeneğin seçildiği kısım
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3 Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lüften Bir Seçim Yapınız.");
                    select = input.nextInt();
                    //Seçilen butonda yaptırılmak istenilen kısım
                    switch (select) {
                        case 1:
                            System.out.println("Yatıracağınız tutar:");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekeceğiniz tutar:");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Kalan bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Görüşürüz.");
                            break;
                        default:
                            System.out.println("Tekrar deneyiniz.");
                            break;
                    }
                } while (select != 4);
                break;

                //Hatalı işlem yapıldığını belirtilen kısım
            } else {
                right--;
                System.out.println("Hatalı şifre girdiniz.Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Müşteri hizmetlerine başvurnuz.");
                    break;
                } else {
                    System.out.println("Kalan hakkınız: " + right);

                }


            }


        }


    }
}
