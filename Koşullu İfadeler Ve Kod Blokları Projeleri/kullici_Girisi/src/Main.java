import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerin tanımlıyoruz.

        String userName, password;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Adı ve Şifresinin istiyoruz.
        System.out.print("Kullanıcı Adınız Giriniz: ");
        userName = input.nextLine();

        System.out.print("Kullanıcı Şifresini Giriniz: ");
        password = input.nextLine();

        //Girilen verilerin sistemde kayıtlı verilerle eşlenildiğini bakılan kısım.
        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız.");
        }else{
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
