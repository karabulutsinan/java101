import java.util.Arrays;
import java.util.List;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    static boolean isRepeat(int[] array ,int deger ){
        for (int i : array) {
            if (i == deger) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10,20,20,10,10,20,5,20};
        int counter =0;
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        int[] duplicate = new int[list.length];
        int startNumber = 0;
        for (int i = 0; i < list.length; i++) {
            counter =0;
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                        counter++;
                }
            }
            if(!isRepeat(duplicate,list[i])){
                duplicate [startNumber]=list[i];
                startNumber++;
                System.out.println(list[i] +" sayısı "+counter+" kere tekrar edildi." );
            }
        }
    }
}