public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 Arasındaki Asal Sayılar");

        for (int i = 2; i < 100; i++) {//2-100 e kadar olan sayıları döngüye sokuyoruz
            int control=0;//Bir boolean değeri gibi düşünelim
            for (int j = 2; j < i; j++) {//Bu döngüdeki sayı 2-100 e kadar olan sayılardan küçükse
                if (i % j == 0) {//ve o sayı önceki döngüdeki sayıya bölümünden kalan yok ise
                    control = 1;//boolean değerim false olmuş oluyor.
                    break;//ve döngüyü burada sonlandırıyorum.
                }

            }
            if(control==0){//Eğer boolean true ise ekrana asal sayının çıktısını verilecek.
                System.out.print(i+" ");
            }
        }
    }
}
