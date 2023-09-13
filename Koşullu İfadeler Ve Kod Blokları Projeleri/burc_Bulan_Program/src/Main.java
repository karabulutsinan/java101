import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        String month;
        int day;
        String burc = " ";


        Scanner input = new Scanner(System.in);
        //Veri Girişi
        System.out.print("Doğdunuz ayı giriniz: ");
        month = input.nextLine();

        System.out.print("Doğdunuz günü giriniz: ");
        day = input.nextInt();

        //Şeçilcek olan ayların ve günlerin hangi burc olduğunun karşılığı...
        if (month.equals("Ocak")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }

            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Şubat")) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Mart")) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Nisan")) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Mayıs")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "ikizler";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Haziran")) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Temmuz")) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Ağustos")) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Eylül")) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Ekim")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Kasım")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else if (month.equals("Aralık")) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                System.out.println("Geçersiz gün girdiniz.");
            }
        } else {
            System.out.println("Hatalı bir ay girdiniz.");
        }
        System.out.println("Burcunuz :" + burc);


    }
}
