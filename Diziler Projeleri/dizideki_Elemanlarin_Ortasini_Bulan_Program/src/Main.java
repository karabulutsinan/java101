public class Main {
    public static void main(String[] args) {

      int [] array={1,2,3,4,5,6};
      double sum=0.0;

      for (int i=0;i<array.length;i++){
          System.out.print(array[i]+" sayısının harmonik değeri:");
          System.out.println((double)1/array[i]);
          sum+=(double)1/array[i];
      }
        System.out.println("Harmonik Değerlerin Toplamı");
        System.out.println(sum);
    }
}