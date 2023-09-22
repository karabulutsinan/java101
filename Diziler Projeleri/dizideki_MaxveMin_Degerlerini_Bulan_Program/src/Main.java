import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*
        int[] array = {12, 15, 5, 32, 3, 78};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {//  max =  array[i]>max ?


           //if (array[i]>max){
           //    max=array[i];
           //}
           //if(array[i]<min){
           //    min=array[i];
           //}

            max = (array[i] > max) ? array[i] : max;
            min = (min > array[i]) ? array[i] : min;
        }
        System.out.println(min);
        System.out.println(max);
       */
        int n;
        int[] array ={15,12,788,1,-1,-778,2};
        int i =0;
        System.out.print("Dizi : ");
        do {
            System.out.print(array[i]+",");
            i++;
        }
        while (i<array.length);

        System.out.print("\nSayı Giriniz :");

        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Girilen Sayı : "+n);

        int highDiff= 9999;
        int lowDiff= 9999;

        int highClose=0,lowClose=0;

        for(int j=0; j< array.length; j++){
            if (array[j]>n){
                if(highDiff>array[j]-n){
                    highDiff=array[j]-n;
                    highClose=array[j];
                }
            }
            if(array[j]<n){
                if(lowDiff>n-array[j]){
                    lowDiff=n-array[j];
                    lowClose=array[j];
                }
            }

        }

        System.out.println("Girilen sayıdan kücük en yakin sayi : " + lowClose);
        System.out.println("Girilen sayıdan büyük en yakin sayi : " + highClose);

    }
}