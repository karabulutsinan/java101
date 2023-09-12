import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutP=2.14,elmaP=3.67,domatesP=1.11,muzP=0.95,patlicanP=5,toplam;
        double armut,elma,domates,muz,patlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo :");
        armut = input.nextDouble();


        System.out.print("Elma kaç kilo :");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo :");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo :");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo :");
        patlican = input.nextDouble();

        toplam =(armut*armutP)+(elma*elmaP)+(domates*domatesP)+(muz*muzP)+(patlican*patlicanP);



        System.out.println("Toplam Tutar :" + toplam);




    }
}